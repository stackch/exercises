/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/genericcache
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.genericcache;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestFactory {
	public static void main(String[] args) {
		Cache<String> stringCache = new Cache<String>();
		stringCache.add("sun", "Sunday");
		stringCache.add("mon", "Monday");
		stringCache.add("tue", "Tuesday");
		stringCache.add("wed", "Wednesday");
		stringCache.add("thu", "Thursday");
		stringCache.add("fri", "Friday");
		stringCache.add("sat", "Saturday");
		
		for (Object entry : stringCache) {  // should be for (Entry<String,String> entry : stringCache) but does not work
			System.out.println(entry);
		}

		Cache<StringBuffer> stringBufferCache = new Cache<StringBuffer>();
		stringBufferCache.add("sun", new StringBuffer("Sunday"));
		stringBufferCache.add("mon", new StringBuffer("Monday"));
		stringBufferCache.add("tue", new StringBuffer("Tuesday"));
		stringBufferCache.add("wed", new StringBuffer("Wednesday"));
		stringBufferCache.add("thu", new StringBuffer("Thursday"));
		stringBufferCache.add("fri", new StringBuffer("Friday"));
		stringBufferCache.add("sat", new StringBuffer("Saturday"));

		for (Object entry : stringBufferCache) {
			System.out.println(entry);
		}

		Cache<List<?>> listCache = new Cache<List<?>>();
		listCache.add ("arrayInteger", new ArrayList<Integer>());
		listCache.add ("linkedDouble", new LinkedList<Double>());
		
		for (Object entry : listCache) {
			System.out.println(entry);
		}

	}
}

