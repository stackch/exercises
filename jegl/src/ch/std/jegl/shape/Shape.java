/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/shapeswing
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.shape;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements IShape {
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Color color;
	protected boolean fill;

	/**
	 * default constructor
	 */
	public Shape() {
		this(0, 0, Color.BLACK);
	}

	public Shape(int width, int height, Color color) {
		this(0, 0, width, height, color); // call special constructor
	}

	public Shape(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.fill = false;
	}

	@Override
	public abstract void draw(Graphics g);

	@Override
	public double getArea() {
		return 0.0;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height
				+ ", color=" + color + ", fill=" + fill + "]";
	}

}