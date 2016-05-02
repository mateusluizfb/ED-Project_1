package ExpressionsUriJudge;

import junit.framework.TestCase;

public class testUri extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testCompute(){
		
		ExpressionChecker ec = new ExpressionChecker();
		
		assertEquals(4, ec.compute("2 2 +"));
		assertEquals(5, ec.compute("2 2 + 1 +"));
		assertEquals(20, ec.compute("2 10 *"));
		assertEquals(2, ec.compute("10 5 /"));
		
		ec.compute("5 + 5");
		ec.compute("+ 2 2");
		
		
	}
}
