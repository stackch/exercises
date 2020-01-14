/*
 * see https://www.simtech-ag.ch/education/java/jnoo/resources/documentclass
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jnoo.document;

public class Oval implements Element {

	private int x;
	private int y;
	private int width;
	private int height;
			
	public Oval(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println(this);		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Oval [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}

}
