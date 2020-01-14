/*
 * see https://www.simtech-ag.ch/education/java/jnoo/resources/documentclass
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jnoo.document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group implements Element {

	private String name;
	private List<Element> elementList;
	
	public Group(String name) {
		this.name = name;
		this.elementList = new ArrayList<>();
	}
	
	public void addElement(Element element) {
		this.elementList.add(element);
	}
	
	public void removeElement(Element element) {
		this.elementList.remove(element);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void print() {
		System.out.println("Group " + this.name + " [");
		for (Element element : elementList) {
			element.print();
		}
		System.out.println("]");
	}

}
