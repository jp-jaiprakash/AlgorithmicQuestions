package in.co.jaiprakash.arrays.inversioncount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ICBruteForceTest {

	int[] returnArray() {
		return new int[] { 7, 10, 6,12,5,8 };
	}

	@Test
	void testIlessthanJ() {

		ICBruteForce bf = new ICBruteForce();
		int n = bf.getNoOfPairs(returnArray());
		assertEquals(8, n);

	}


}
