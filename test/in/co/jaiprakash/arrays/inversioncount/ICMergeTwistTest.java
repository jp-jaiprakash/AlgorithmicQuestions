package in.co.jaiprakash.arrays.inversioncount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ICMergeTwistTest {

	int[] returnArray() {
		return new int[] { 7, 10, 6 };
	}
	
	@Test
	void testIlessThanJ() {
		ICMergeTwist ict = new ICMergeTwist();
		int n = ict.getNoOfPairs(returnArray());
		assertEquals(2, n);
	}
}
