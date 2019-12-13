/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/shapeswing
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.shape;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Shape {
	/**
	 * default constructor
	 */
	public Oval() {
		this(0, 0, Color.BLACK);
	}

	public Oval(int width, int height, Color color) {
		this(0, 0, width, height, color); // call special constructor
	}

	public Oval(int x, int y, int width, int height, Color color) {
		super(x, y, width, height, color);
	}

	/**
	 * Berechne die Fläche des Rechtecks und gib solche zurück an den Anwender
	 * 
	 * @return
	 */
	@Override
	public double getArea() {
		return this.width * this.height * Math.PI / 4.0;
	}

	/**
	 * Zeichne das Rechteck
	 * 
	 * @param g
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(this.color);
		g.drawString(String.format("%.2f", this.getArea()), x, y - 2);
		if (this.fill) {
			g.fillOval(x, y, width, height);
		} else {
			g.drawOval(x, y, width, height);
		}
	}

}
