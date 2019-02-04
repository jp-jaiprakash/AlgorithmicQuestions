package in.co.jaiprakash.algo.binarysearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BinarySearchIterativeTest {

	int[] returnArray() {
		return new int[] {2,3,5,9,20 };
	}
	
	@Test
	public void binarySearchIterativeTest() {
		BinarySearchIterative bsi = new BinarySearchIterative();
		boolean b = bsi.search(returnArray(), 5);
		assertEquals(true, b);
	}
}
