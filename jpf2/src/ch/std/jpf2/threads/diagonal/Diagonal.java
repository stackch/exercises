/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/threads/diagonal
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.threads.diagonal;

public class Diagonal
{
    private static Point point;
    private static MovePoint northWest;
    private static MovePoint southEast;
    private static java.lang.Thread    northWestThread;
    private static java.lang.Thread    southEastThread;
    
    public static void main (String[] args)
    {
        point = new Point();
        northWest = new MovePoint (point, -1,1);
        southEast = new MovePoint (point, 1,-1);
        northWestThread = new Thread (northWest);
        southEastThread = new Thread (southEast);
        northWestThread.start();
        southEastThread.start();
        while (true) {
            System.out.println ("point: " + point);
            if (point.isDiagonal() == false) {
                System.out.println ("point is not diagonal!");
            }
            try {
                Thread.sleep (20);
            } catch (InterruptedException e) {
            }
        }
    }

}