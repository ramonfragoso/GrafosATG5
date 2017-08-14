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
	
	Die dieNumSidesError;
	
	@Before
	public void setUp() throws Exception {
		
		die1 = new Die();
		die2 = new Die();
		
		dieNumSides1 = new Die(15);
		dieNumSides2 = new Die(3);
		 
		dieResult1 = new Die(10, 8);
		dieResult2 = new Die(7, 6);
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

	@Test
	public void testDieIntInt() {
		
		
		assertEquals(10, dieResult1.getNumSides());
		assertEquals(7, dieResult2.getNumSides()); 
		
		assertEquals(8, dieResult1.getResult()); 
		assertEquals(6, dieResult2.getResult()); 
	} 

	@Test
	public void testRoll() {
		
		int newResult = dieResult1.roll();
		assertEquals(newResult, dieResult1.getResult());
		
		newResult = dieResult1.roll();
		assertEquals(newResult, dieResult1.getResult());

		newResult = dieResult1.roll();
		assertEquals(newResult, dieResult1.getResult());
	}
	
	@Test
	public void testEqualsObject() {
		
		Die sixSidesDie = new Die(6, 3);
		Die anotherSixSidesDie = new Die(6, 5);
		assertEquals(false, sixSidesDie.equals(anotherSixSidesDie));
	
		Die resultFourDie = new Die(6, 4);
		Die anotherResultFourDie = new Die(5, 4);
		assertEquals(false, resultFourDie.equals(anotherResultFourDie));
	
		Die dieEqualsToMyLittleDie = new Die(8, 6);
		Die myLittleDie = new Die(8, 6);
		assertEquals(true, dieEqualsToMyLittleDie.equals(myLittleDie));
		
		Integer number = new Integer(6);
		assertEquals(false, sixSidesDie.equals(null));
		assertEquals(true, sixSidesDie.equals(sixSidesDie));
		assertEquals(false, sixSidesDie.equals(number));
	}

	@Test
	public void testToString() {
		
		assertEquals("Num sides 6 result 1",die1.toString());
		assertEquals("Num sides 6 result 1",die2.toString());
		assertEquals("Num sides 15 result 1",dieNumSides1.toString());
		assertEquals("Num sides 3 result 1",dieNumSides2.toString());
		assertEquals("Num sides 10 result 8",dieResult1.toString());
		assertEquals("Num sides 7 result 6",dieResult2.toString());
	}

//	@Test
//	public void testDies() {
//		
//		Die die = new Die();
//		die.getResult();
//	}
	
//	@Test(expected = AssertionError.class)
//	public void testDieError() {
//		
//		dieNumSidesError = new Die(1);
//		dieNumSidesError = new Die(-1);
//	
//		dieNumSidesError = new Die(1);
//		dieNumSidesError = new Die(-1);
//	}
}
