package Lists;

import junit.framework.TestCase;

public class testSelfAdjustingList extends TestCase {
	
	List list = new SelfAdjustingList();
	
	protected void setUp() throws Exception {
		super.setUp();
		
		list.insert(0, 1);
		list.insert(1, 2);
		list.insert(2, 3);
		list.find(1);
		
		
	}
	public void testElement(){
		
		assertEquals(2, list.elementAt(2));
		assertEquals(3, list.elementAt(1));
		assertEquals(1, list.elementAt(0));
	}
	
	
	
}