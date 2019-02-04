package in.co.jaiprakash.arrays.sumoftwoelements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SumOfTwoElementsTest {

	int[] returnArray() {
		return new int[] { 7, 10, 6,12,5,8 };
	}
	
	@Test
	void sumEqualToK() {
		SumOfTwoElementsBF ste = new SumOfTwoElementsBF();
		int k = 17;
		int n =ste.numberOfPairs(returnArray(), k);
		assertEquals(2, n);
	}
}
