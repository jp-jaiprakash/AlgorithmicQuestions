package in.co.jaiprakash.algo.sortedwithduplicates;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SortedWithDupBFTest {

	int[] returnArray() {
		return new int[] {-2,-2,3,3,10,12,12,18,18 };
	}
	
	@Test
	public void testcase1() {
		SortedWithDupBF sfd = new SortedWithDupBF();
		int i = sfd.findUniqueElement(returnArray());
		assertEquals(10, i);
	}
}
