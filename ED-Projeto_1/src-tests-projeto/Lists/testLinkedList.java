package Lists;

import junit.framework.TestCase;

public class testLinkedList extends TestCase {
	
	List list = new LinkedList();

	protected void setUp() throws Exception {
		super.setUp();
		
		list.insert(0, 1);
		list.insert(1, 2);
		list.insert(2, 3);
		
	}
	
	public void testElement(){
		
		assertEquals(1, list.elementAt(0));
		assertEquals(2, list.elementAt(1));
		assertEquals(3, list.elementAt(2));
		
	}
	
	public void testSwap(){
		
		list.swap(2, 1);
		
		list.show(false);
		
	}
}
