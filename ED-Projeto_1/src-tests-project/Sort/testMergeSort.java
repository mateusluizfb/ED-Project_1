package Sort;

import org.junit.Before;

import Lists.LinkedList;
import Lists.List;
import junit.framework.TestCase;

public class testMergeSort extends TestCase {
	
	List array = new LinkedList();
	
	@Before
	public void setUp() throws Exception {
		array.insert(0, 4);
		array.insert(1, 3);
		array.insert(2, 2); /// LACUNA COM [4, 3, 2, 1]
		array.insert(3, 1);
	}
	
	public void testInsert(){
		
		assertEquals(4, array.elementAt(0));
		assertEquals(3, array.elementAt(1));
		assertEquals(2, array.elementAt(2));
		assertEquals(1, array.elementAt(3));
	
	}
	
	public void testSort(){
		
		AbstractSort ms = new MergeSort();
		
		ms.sort(array);
		
		System.out.println(array.elementAt(0));
		System.out.println(array.elementAt(1));
		System.out.println(array.elementAt(2));
		System.out.println(array.elementAt(3));
		
		assertEquals(1, array.elementAt(0));
		assertEquals(2, array.elementAt(1));
		assertEquals(3, array.elementAt(2));
		assertEquals(4, array.elementAt(3));
		
		
	}
}
