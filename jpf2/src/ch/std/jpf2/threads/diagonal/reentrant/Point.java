/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/threads/diagonal
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.threads.diagonal.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Point {
	private Lock lock;
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
		this.lock = new ReentrantLock();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void movePoint(int x, int y) {
		try {
			this.lock.lock();
			this.x += x;
			this.y += y;
		} finally {
			this.lock.unlock();
		}
	}

	public boolean isDiagonal() {
		try {
			this.lock.lock();
			if ((x == y) || (-x == -y) || (-x == y) || (x == -y)) {
				return true;
			}
			return false;
		} finally {
			this.lock.unlock();
		}
	}

	public String toString() {
		final int localX;
		final int localY;
		try {
			this.lock.lock();
			localX = x;
			localY = y;
		} finally {
			this.lock.unlock();
		}
		return "x: " + localX + ", y: " + localY;
	}
}
