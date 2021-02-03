/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/threads/diagonal
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.threads.diagonal;

public class Point {
	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int a) {
		this(a, a);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public synchronized void movePoint(int x, int y) {
		this.x += x;
		this.y += y;
	}

	public synchronized boolean isDiagonal() {
		if ((x == y) || (-x == -y) || (-x == y) || (x == -y)) {
			return true;
		}
		return false;
	}

	public synchronized String toString() {
		return "x: " + x + ", y: " + y;
	}
}
