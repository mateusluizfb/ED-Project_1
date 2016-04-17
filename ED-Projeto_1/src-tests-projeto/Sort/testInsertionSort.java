package Sort;

import Lists.LinkedList;
import Lists.List;
import junit.framework.TestCase;

public class testInsertionSort extends TestCase {
	
	public void testInsert(){
		
		List array = new LinkedList();
		
		array.insert(0, 4);
		array.insert(1, 3);
		array.insert(2, 2);
		array.insert(3, 1);
		
		assertEquals(4, array.elementAt(0));
		assertEquals(3, array.elementAt(1));
		assertEquals(2, array.elementAt(2));
		assertEquals(1, array.elementAt(3));
		
		InsertionSort is = new InsertionSort();
		
		is.sort(array);
		array.show(false);
		
	}
	
	
	

}
