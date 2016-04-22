package Lists;

import org.junit.Before;

import junit.framework.TestCase;

public class testDLinkedList extends TestCase {

	List list = new DLinkedList();
	
	@Before
	public void setUp() throws Exception  {
		super.setUp();
		
		list.insert(0, 1);
		list.insert(1, 2);
		list.insert(2, 3);
		list.insert(3, 4);
		
	}
	
	public void testElement(){
		
		assertEquals(1, list.elementAt(0));
		assertEquals(2, list.elementAt(1));
		assertEquals(3, list.elementAt(2));
		assertEquals(4, list.elementAt(3));
		
		list.show(false);
		System.out.println();
		list.show(true);
		
	}
	
	public void testRemove(){
		
		list.remove(0);
		assertEquals(2, list.elementAt(0));
		
		list.remove(1);	
		assertEquals(2, list.elementAt(0));
		assertEquals(4, list.elementAt(1));
		
		list.remove(1);
		assertEquals(2, list.elementAt(0));
	}

}
