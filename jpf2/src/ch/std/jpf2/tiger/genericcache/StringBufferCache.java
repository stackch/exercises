/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/genericcache
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.genericcache;

import java.util.HashMap;
import java.util.Map;

public class StringBufferCache {
	
	private Map<String, StringBuffer> cacheMap = new HashMap<>();
	
	public StringBufferCache()
	{		
	}	
	public void add (String key, StringBuffer obj)
	{
		cacheMap.put(key, obj);
	}
	public StringBuffer get(String key)
	{
		return (StringBuffer)cacheMap.get(key);
	}
}

