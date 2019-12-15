/*
 * see https://www.simtech-ag.ch/education/java/jegl/resources/oo/shapeswing
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jegl.shapeinheritance.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import ch.std.jegl.shape.IShape;
import ch.std.jegl.shape.Oval;
import ch.std.jegl.shape.Rectangle;
import ch.std.jegl.shape.Shape;

public class ShapeSwing extends JPanel {

	private int counter = 0;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("paintComponent called " + ++counter);
		this.setBackground(Color.BLUE);
		// paint rectangle
		IShape r1 = new Rectangle(20, 20, 100, 200, Color.RED);
		r1.draw(g);
		Shape r2 = new Rectangle(140, 120, 200, 100, Color.YELLOW);
		r2.setFill(true);
		r2.draw(g);
		// paint 2 Oval instance
		IShape o1 = new Oval(140, 40, 160, 80, Color.GREEN);
		o1.draw(g);
		Shape o2 = new Oval(240, 250, 50, 50, Color.WHITE);
		o2.setFill(true);
		o2.draw(g);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(400, 400);
	}

	private static void createAndShowGui() {
		ShapeSwing mainPanel = new ShapeSwing();
		JFrame frame = new JFrame("RectangleSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(mainPanel);
		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGui();
			}
		});
	}
}