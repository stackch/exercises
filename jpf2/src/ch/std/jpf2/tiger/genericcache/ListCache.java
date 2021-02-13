/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/genericcache
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.genericcache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListCache {
	
	private Map<String, List<?>> cacheMap = new HashMap<>();
	
	public ListCache()
	{		
	}	
	public void add (String key, List<?> obj)
	{
		cacheMap.put(key, obj);
	}
	public List<?> get(String key)
	{
		return cacheMap.get(key);
	}
}
