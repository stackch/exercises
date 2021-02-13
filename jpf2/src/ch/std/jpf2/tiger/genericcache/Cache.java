/*
 * see https://www.simtech-ag.ch/education/java/jpf2/resources/tiger/genericcache
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
 */

package ch.std.jpf2.tiger.genericcache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Cache<T> implements Iterable<Entry<String, T>>, Iterator<Entry<String, T>> {

	private Map<String, T> cacheMap = new HashMap<String, T>();
	private Iterator<Entry<String, T>> cacheMapIterator = null;

	public Cache() {
	}

	public void add(String key, T obj) {
		cacheMap.put(key, obj);
	}

	public T get(String key) {
		return cacheMap.get(key);
	}

	public Iterator<Entry<String, T>> iterator() {
		cacheMapIterator = cacheMap.entrySet().iterator();
		return cacheMapIterator;
	}

	public boolean hasNext() {
		return cacheMapIterator.hasNext();
	}

	public Entry<String, T> next() {
		return cacheMapIterator.next();
	}

	public void remove() {
	}

}
