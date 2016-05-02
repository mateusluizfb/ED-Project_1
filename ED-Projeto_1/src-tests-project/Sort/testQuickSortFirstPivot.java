package Sort;

import Lists.LinkedList;
import Lists.List;
import junit.framework.TestCase;

public class testQuickSortFirstPivot extends TestCase {

	List array = new LinkedList();
	
	protected void setUp() throws Exception {
		super.setUp();
		
		array.insert(0, 9);
		array.insert(1, 8);
		array.insert(2, 7);
		array.insert(3, 6);
		
	}
	
	public void testSort(){
		
		AbstractSort qs = new QStLastPivot();
		
		qs.sort(array);
				
		assertEquals(6, array.elementAt(0));
		assertEquals(7, array.elementAt(1));
		assertEquals(8, array.elementAt(2));
		assertEquals(9, array.elementAt(3));
		
		
	}

}
