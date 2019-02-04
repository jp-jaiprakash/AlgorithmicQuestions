package in.co.jaiprakash.algo.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinarySearchRecursiveTest {

	int[] returnArray() {
		return new int[] {2,3,5,9,20 };
	}
	
	@Test
	public void binarySearchRecursiveTest() {
		
		BinarySearchRecursive bsr = new BinarySearchRecursive();
		boolean b = bsr.searchElement(returnArray(), 15, returnArray().length -1, 0);
		assertEquals(true, b);
	}
}
