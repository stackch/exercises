/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/lambda/stream/warehouse
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.lambda.stream.warehouse;

public class Article {

	private Integer id;
	private String name;
	private Integer quantity;
	private Double price;

	public Article() {
		this(null, null, null, null);
	}
	
	public Article(Integer id, String name, Integer quantity, Double price) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}


}

