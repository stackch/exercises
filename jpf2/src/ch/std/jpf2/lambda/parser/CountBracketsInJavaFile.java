/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/parser
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stream.brackets;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountBracketsInJavaFile {

	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("no args");
			System.exit(1);
		}
		final Path file = Paths.get(args[0]);
		try (final Stream<String> lines = Files.lines(file)) {
			final Map<Character, Integer> count = lines
					.flatMap(line -> IntStream.range(0, line.length()).mapToObj(line::charAt))
					.filter(c -> c == '{' || c == '}')
					.collect(TreeMap::new, (m, c) -> m.merge(c, 1, Integer::sum), Map::putAll);
			count.forEach((bracket, c) -> System.out.println(bracket + ": " + c));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
