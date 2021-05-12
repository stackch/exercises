/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/doublestream
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stream.random;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRandomNumberPartitioning {

	public static void main(String[] args) {
		{
			Stream<Double> doubleStream = Stream.generate(() -> {
				return new BigDecimal(-10.0 + Math.random() * 20.0).setScale(2, RoundingMode.HALF_UP).doubleValue();
			}).limit(10);
			
			Map<Boolean, List<Double>> doubleStreamMap = doubleStream.collect(Collectors.partitioningBy(d -> d < 0.0 ? false : true));
			System.out.println(doubleStreamMap.get(false));
			System.out.println(doubleStreamMap.get(true));
		}
	}
}
