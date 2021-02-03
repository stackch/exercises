/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/threads/diagonal
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.threads.diagonal.reentrant;

public class MovePoint implements java.lang.Runnable
{
    private Point point;
    private int   xmove;
    private int   ymove;

    public MovePoint ()
    {
        this (null, 0, 0);
    }
    public MovePoint (Point point, int xmove, int ymove)
    {
        this.point = point;
        this.xmove = xmove;
        this.ymove = ymove;
    }
    public void run ()
    {
        while (true) {
            point.movePoint (xmove, ymove);
        }
    }
}