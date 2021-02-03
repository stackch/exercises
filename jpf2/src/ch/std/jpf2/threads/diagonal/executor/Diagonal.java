/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/threads/diagonal
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.threads.diagonal.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Diagonal {
	private static Point point;
	private static MovePoint northWest;
	private static MovePoint southEast;

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		point = new Point();
		northWest = new MovePoint(point, -1, 1);
		southEast = new MovePoint(point, 1, -1);
		executor.execute(northWest);
		executor.execute(southEast);
		while (true) {
			System.out.println("point: " + point);
			if (point.isDiagonal() == false) {
				System.out.println("point is not diagonal!");
			}
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
			}
		}
	}

}