package in.co.jaiprakash.arrays.sumoftwoelements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SumOfTwoElementsTestII {

	int[] returnArray() {
		return new int[] { 7, 10, 6,12,5,8 };
	}
	
	@Test
	public void getNumberOfPairsTest() {
		SumOfTwoElementsII ste = new SumOfTwoElementsII();
		int n = ste.getNumberOfpairs(returnArray(), 17);
		assertEquals(2, n);
	}
}
