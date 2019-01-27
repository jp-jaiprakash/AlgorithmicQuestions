package in.co.jaiprakash.arrays.bothsorted;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UseOfInsertionSortTest {

	/*
	 * First define the basic setup
	 * 1. return arrayA
	 * 2. return arrayB
	 * 3. check if array is getting printed
	 * 4. check if array is sorted
	 */
	
	int [] returnArrayA() {
		return new int[]{-1,10,12,18,20,25,36};
	}
	
	int[] returnArrayB() {
		return new int[] {-6,-3,2,10,16};
	}
	
	@Test
	void testPrintArray() {
		UseOfInsertionSort uis = new UseOfInsertionSort();
		uis.printArray(returnArrayA());
	}
	
	@Test
	void testArrayIsSorted() {
		UseOfInsertionSort uis = new UseOfInsertionSort();
		boolean b = uis.isArraySorted(returnArrayA());
		assertEquals(true, b);
	}
	
	@Test
	void testArrayCisSorted() {
		UseOfInsertionSort uis = new UseOfInsertionSort();
		int [] arrayc = uis.insertBinA(returnArrayA(), returnArrayB());
		uis.printArray(arrayc);

		boolean b = uis.isArraySorted(arrayc);
		assertEquals(true, b);
	}
}
