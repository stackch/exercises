/*
 * see https://www.simtech-ag.ch/education/java/jnoo/resources/documentclass
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jnoo.document;

import java.util.ArrayList;
import java.util.List;

public class Page {
	// attributes
	private int number;
	private List<Element> elementList;
	
	// constructors
	public Page() {
		this(0);
	}
	
	public Page(int number) {
		this.number = number;
		this.elementList = new ArrayList<>();
	}

	public void addElement(Element element) {
		this.elementList.add(element);
	}
	
	public void removeElement(Element element) {
		this.elementList.remove(element);
	}
	
	public void print() {
		System.out.println("Page [" + this.number + "]");
		for (Element element : elementList) {
			element.print(); // welches print ???s
		}
	}

	// Getter and Setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {			
		this.number = number;
	}	
	
	@Override
	public String toString() {
		return "Page [number=" + number + "]";
	}
	
}
