/*
 * see https://www.simtech-ag.ch/education/java/jnoo/resources/documentclass
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jnoo.document;

import java.util.ArrayList;
import java.util.List;

public class Document {
	// attributes
	private String title;
	private String author;
	private List<Page> pageList; // loose kopplung

	// constructors
	public Document() {
		this("unknown", "unknown"); // constructor delegate
	}

	public Document(String title, String author) {
		this.title = title;
		this.author = author;
		this.pageList = new ArrayList<>(); // diamond operator
	}

	public void addPage(Page page) {
		this.pageList.add(page);
	}

	public void removePage(Page page) {
		this.pageList.remove(page);
	}

	public void print() {
		System.out.println("document print");
		System.out.println("title: " + title);
		System.out.println("author: " + author);
		for (Page page : this.pageList) {
			page.print();
		}
	}

	// getter and setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Document [title=" + title + ", author=" + author + "]";
	}

}
