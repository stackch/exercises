/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/stream/warehouse
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stream.warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Warehouse {

	private List<Article> articles = createInitialStock();

	public Warehouse() {
		super();
	}

	public List<Article> getArticles() {
		return this.articles;
	}

	public List<Article> getArticles(Predicate<Article> predicate) {
		List<Article> result = new ArrayList<Article>();

		for (Article article : this.articles) {
			if (predicate.test(article)) {
				result.add(article);
			}
		}

		return result;
	}

	public List<Article> getArticlesStream(Predicate<Article> predicate) {
		return this.articles.stream().filter(predicate).collect(Collectors.toList());
	}

	public void changeArticles(Predicate<Article> predicate, Consumer<Article> consumer) {
		for (Article article : this.articles) {
			if (predicate.test(article)) {
				consumer.accept(article);
			}
		}
	}

	private static List<Article> createInitialStock() {
		List<Article> result = new ArrayList<Article>();
		int id = 1;

		result.add(new Article(id++, "Bleistift", 75, 0.50));
		result.add(new Article(id++, "Ordner", 120, 3.70));
		result.add(new Article(id++, "Hefter", 45, 5.00));
		result.add(new Article(id++, "Kugelschreiber", 115, 1.50));
		result.add(new Article(id++, "Markierstift", 50, 2.50));
		result.add(new Article(id++, "Block A4", 200, 1.75));
		result.add(new Article(id++, "Block A5", 150, 1.25));

		return result;
	}

}

