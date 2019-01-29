package in.co.jaiprakash.arrays.bothsorted;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UseOfTwoPointersTest {

	/*
	 * 
	 */
	
	int [] returnArrayA() {
		return new int[]{-1,10,12,18,20,25,36};
	}
	
	int[] returnArrayB() {
		return new int[] {-6,-3,2,10,16};
	}
	
	@Test
	void testPrintArray() {
		UseOfTwoPointers ut = new UseOfTwoPointers();
		ut.printArray(returnArrayB());
	}
	
	@Test
	void testArrayCisSorted() {
		UseOfTwoPointers ut = new UseOfTwoPointers();
		int [] arrC =ut.useTwoPointers(returnArrayA(), returnArrayB());
		boolean b = ut.isArraySorted(arrC);
		ut.printArray(arrC);
		assertEquals(true, b);
	}
}
