/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/doublestream
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stream.random;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.ArrayList;

public class StreamGenerateRandomNumbers {

	public static void main(String[] args) {
		{
			DoubleStream doubleStream = new Random().doubles(10, -10.0, 10.0);
			System.out.println(
					doubleStream.collect(ArrayList<Double>::new, ArrayList<Double>::add, ArrayList<Double>::addAll));
		}
		{
			DoubleStream doubleStream = new Random().doubles(10, -10.0, 10.0)
					.map((d) -> new BigDecimal(d).setScale(2, RoundingMode.HALF_UP).doubleValue());
			System.out.println(
					doubleStream.collect(ArrayList<Double>::new, ArrayList<Double>::add, ArrayList<Double>::addAll));
		}
		{
			Stream<Double> tStream = Stream.generate(() -> {
				return new BigDecimal(-10.0 + Math.random() * 20.0).setScale(2, RoundingMode.HALF_UP).doubleValue();
			}).limit(10);
			System.out.println(tStream.collect(Collectors.toList()));

		}
	}
}
