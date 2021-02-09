/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/worditerable
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.worditerable;

import java.util.Iterator;
import java.util.StringTokenizer;

class WordIterable implements Iterable<String>, Iterator<String>
{
  private StringTokenizer st;

  public WordIterable( String s )
  {
    st = new StringTokenizer( s );
  }

  // Methode vom Iterable

  public Iterator<String> iterator()
  {
    return this;
  }

  // Methoden vom Iterator

  public boolean hasNext()
  {
    return st.hasMoreTokens();
  }

  public String next()
  {
    return st.nextToken();
  }

  public void remove() { }
}
