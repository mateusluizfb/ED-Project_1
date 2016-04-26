package Sort;

import org.junit.Before;

import Lists.LinkedList;
import Lists.List;
import junit.framework.TestCase;

public class testSelectionSort extends TestCase {
	
	List array = new LinkedList();
	
	@Before
	public void setUp() throws Exception {
		
		array.insert(0, 10);
		array.insert(1, 9);
		array.insert(2, 8);
		array.insert(3, 7);
	
	}
	
	public void testInsert(){
		
		assertEquals(10, array.elementAt(0));
		assertEquals(9, array.elementAt(1));
		assertEquals(8, array.elementAt(2));
		assertEquals(7, array.elementAt(3));
		
	}
	
	public void testSort(){
		
		AbstractSort ss = new SelectionSort();
		
		ss.sort(array);
		
		assertEquals(7, array.elementAt(0));
		assertEquals(8, array.elementAt(1));
		assertEquals(9, array.elementAt(2));
		assertEquals(10, array.elementAt(3));
		
		
	}

}
