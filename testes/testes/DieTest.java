package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import grafosATG5.Die;

public class DieTest {
	
	Die die1;
	Die die2;
	
	Die dieNumSides1;
	Die dieNumSides2;
	
	Die dieResult1;
	Die dieResult2;

	@Before
	public void setUp() throws Exception {
		
		 die1 = new Die();
		 die2 = new Die();
		 
		 dieNumSides1 = new Die(15);
		 dieNumSides2 = new Die(3);
	}

	@Test
	public void testDie() {
		 
		assertEquals(6, die1.DEFAULT_SIDES);
		assertEquals(6, die2.DEFAULT_SIDES);		
	}
	
	@Test
	public void testDieInt() {
		
		assertEquals(15, dieNumSides1.getNumSides());
		assertEquals(3, dieNumSides2.getNumSides()); 
		
		assertEquals(1, dieNumSides2.getResult()); 
		assertEquals(1, dieNumSides2.getResult()); 
	}
//
//	@Test(expected = AssertionError.class)
//	public void testDieIntError() {
//		
//		 Die dieNumSidesError1 = new Die(1);
//		 Die dieNumSidesError2 = new Die(-1);
//	}

	@Test
	public void testDieIntInt() {
		
	}

//	@Test
//	public void testRoll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetNumSides() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetResult() {
//	
//
//	}
//
//	@Test
//	public void testEqualsObject() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
