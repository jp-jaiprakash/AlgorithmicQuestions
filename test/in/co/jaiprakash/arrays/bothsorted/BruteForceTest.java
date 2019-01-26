package in.co.jaiprakash.arrays.bothsorted;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class BruteForceTest {

	public int[] arrayA;
	public int[] arrayB;
	
	@Before
	protected void setUp() {
		this.arrayA = new int[]{-1,10,12,18,20,25,36};
		this.arrayB = new int[] {-6,-3,2,10,16};
	}

	@Test
	void testPrintArray() {
		BruteForce bf = new BruteForce();
		bf.printArray(returnArrayA());
	}
	
	@Test
	void testPrintNullArray() {
		BruteForce bf = new BruteForce();
		bf.printArray(returnNullArray());
	}
	
	@Test
	void testCopyInArrayC() {
		BruteForce bf = new BruteForce();
		int [] arrayC = bf.copyInArrayC(returnArrayA(), returnArrayB());
		assertEquals(returnCombinedArrays().length, arrayC.length);
	}
	
	@Test
	void testArrayCisSorted() {
		BruteForce bf = new BruteForce();
		int [] arrayC = bf.copyInArrayC(returnArrayA(), returnArrayB());
		arrayC = bf.sortArray(arrayC);
		boolean b = bf.checkIfArrayIsSorted(arrayC);
		assertEquals(true, b);
	}
	@Test
	void testcheckIfArrayIsSorted() {
		BruteForce bf = new BruteForce();
		boolean b = bf.checkIfArrayIsSorted(returnArrayA());
		assertEquals(true, b);
	}
	
	@Test
	void testcheckIfNullArrayIsSorted() {
		BruteForce bf = new BruteForce();
		boolean b = bf.checkIfArrayIsSorted(returnNullArray());
		assertEquals(true, b);
	}
	
	int[] returnArrayA() {
		return new int[]{-1,10,12,18,20,25,36};
	}

	int[] returnArrayB() {
		return new int[] {-6,-3,2,10,16};
	}
	
	int [] returnNullArray() {
		return null;
	}
	
	int [] returnCombinedArrays() {
		return new int[] {-6,-3,-1,2,10,10,12,16,18,20,25,36};
	}
}
