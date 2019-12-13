/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/shapeswing
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.shape;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
	/**
	 * default constructor
	 */
	public Rectangle() {
		this(0, 0, Color.BLACK);
	}

	public Rectangle(int width, int height, Color color) {
		this(0, 0, width, height, color); // call special constructor
	}

	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}

	/**
	 * Berechne die Fläche des Rechtecks und gib solche zurück an den Anwender
	 * 
	 * @return
	 */
	@Override
	public double getArea() {
		return this.width * this.height;
	}

	/**
	 * Zeichne das Rechteck
	 * 
	 * @param g
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.drawString(String.valueOf(this.getArea()), x, y - 2);
		if (this.fill) {
			g.fillRect(x, y, width, height);
		} else {
			g.drawRect(x, y, width, height);
		}
	}

}
