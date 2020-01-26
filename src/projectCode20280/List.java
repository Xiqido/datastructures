/*
 * Author: Aonghus Lawlor aonghus.lawlor@ucd.ie
 * 2019
 * 
 * Do not edit this files! It will be updated during the module
 * 
 */

package projectCode20280;

import java.util.Iterator;

public interface List<E> extends Iterable<E> {
	
	int size();
	
	boolean isEmpty();
	
	E get(int i, E e);
	
	void add(int i, E e);
	
	E remove(int i);

	E removeFirst();

	E removeLast();
	
	Iterator<E> iterator();
}
