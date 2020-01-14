/*
 * see https://www.simtech-ag.ch/education/java/jnoo/resources/documentclass
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jnoo.document;

public class Text implements Element {
	
	private String text;

	public Text(String text) {
		this.text = text;
	}

	@Override
	public void print() {
		System.out.println(this);
	}

	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Text [text=" + text + "]";
	}
	
}
