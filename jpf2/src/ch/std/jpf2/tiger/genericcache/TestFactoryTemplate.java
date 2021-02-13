/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/genericcache
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.genericcache;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestFactoryTemplate {
	public static void main(String[] args) {
		StringCache stringCache = new StringCache();
		stringCache.add("sun", "Sunday");
		stringCache.add("mon", "Monday");
		stringCache.add("thu", "Thursday");
		stringCache.add("wed", "Wednesday");
		stringCache.add("thu", "Thursday");
		stringCache.add("fri", "Friday");
		stringCache.add("sat", "Saturday");

		StringBufferCache stringBufferCache = new StringBufferCache();
		stringBufferCache.add("sun", new StringBuffer("Sunday"));
		stringBufferCache.add("mon", new StringBuffer("Monday"));
		stringBufferCache.add("thu", new StringBuffer("Thursday"));
		stringBufferCache.add("wed", new StringBuffer("Wednesday"));
		stringBufferCache.add("thu", new StringBuffer("Thursday"));
		stringBufferCache.add("fri", new StringBuffer("Friday"));
		stringBufferCache.add("sat", new StringBuffer("Saturday"));
		
		ListCache listCache = new ListCache();
		listCache.add ("array", new ArrayList<>());
		listCache.add ("linked", new LinkedList<>());
	}
}
