package Sort;

import Lists.LinkedList;
import Lists.List;
import junit.framework.TestCase;

public class testQuickSortHybirdSelection extends TestCase {

	List array = new LinkedList();
	
	protected void setUp() throws Exception {
		super.setUp();
		
		array.insert(0, 8);
		array.insert(1, 9);
		array.insert(2, 7);
		array.insert(3, 6);
		array.insert(4, 5);
		array.insert(5, 4);
		array.insert(6, 3);
		array.insert(7, 2);
		
	}
	
	public void testSort(){
		
		AbstractSort qs = new QSHybridSelection();
		
		//enter in debug mode to see InsertionSort in action in QuickSortHibrid 
		qs.sort(array);
		
		assertEquals(2, array.elementAt(0));
		assertEquals(3, array.elementAt(1));
		assertEquals(4, array.elementAt(2));
		assertEquals(5, array.elementAt(3));
		assertEquals(6, array.elementAt(4));
		assertEquals(7, array.elementAt(5));
		assertEquals(8, array.elementAt(6));
		assertEquals(9, array.elementAt(7));
	}

}
