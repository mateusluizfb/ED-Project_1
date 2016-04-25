package Lists;

import junit.framework.TestCase;

public class testCircularDLinkedList extends TestCase {

	List list = new CircularDLinkedList();
	
	protected void setUp() throws Exception {
		super.setUp();
		
		list.insert(0, 1);
		list.insert(1, 2);
		list.insert(2, 3);
		list.insert(3, 4);
		list.insert(4, 5);
	}
	
	public void testInsert(){
		
		assertEquals(1, list.elementAt(0));
		assertEquals(2, list.elementAt(1));
		assertEquals(3, list.elementAt(2));
		assertEquals(4, list.elementAt(3));
		assertEquals(5, list.elementAt(4));
		assertEquals(5, list.size());
		
	}
	
	public void testRemove(){
		
		list.remove(0);
		assertEquals(2, list.elementAt(0));
		assertEquals(4, list.size());
		
		list.remove(1);
		assertEquals(4, list.elementAt(1));
		assertEquals(3, list.size());
		
		list.remove(2);
		assertEquals(4, list.elementAt(1));
		
		
		
	}

	
}
