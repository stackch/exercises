/*
 * see https://www.simtech-ag.ch/education/java/jnoo/resources/documentclass
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jnoo.document.test;

import ch.std.jnoo.document.Document;
import ch.std.jnoo.document.Group;
import ch.std.jnoo.document.Line;
import ch.std.jnoo.document.Oval;
import ch.std.jnoo.document.Page;
import ch.std.jnoo.document.Rect;
import ch.std.jnoo.document.Text;

public class DocumentTest {

	public static void main(String[] args) {
	    Document document = new Document("Java Basics", "Any");
	    Page one = new Page(1);
	    document.addPage(one);
	    Group g1 = new Group("Hans");
	    one.addElement(g1);
	    g1.addElement(new Text("this is text for group 1"));
	    g1.addElement(new Line(1,1,5,5));
	    g1.addElement(new Rect(1,1,50,50));
	    g1.addElement(new Oval(100,10,50,50));
	    Group g2 = new Group("Fritz");
	    one.addElement(g2);
	    g2.addElement(new Text("this is text for group 2"));
	    document.print();
	  }
}
