/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/genericcache
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.genericcache;

import java.util.HashMap;
import java.util.Map;

public class StringCache {
	
	private Map<String, String> cacheMap = new HashMap<>();
	
	public StringCache()
	{		
	}	
	public void add (String key, String obj)
	{
		cacheMap.put(key, obj);
	}
	public String get(String key)
	{
		return (String)cacheMap.get(key);
	}
}

