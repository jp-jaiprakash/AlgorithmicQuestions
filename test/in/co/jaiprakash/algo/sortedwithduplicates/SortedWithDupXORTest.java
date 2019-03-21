package in.co.jaiprakash.algo.sortedwithduplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SortedWithDupXORTest {

	int[] returnArray() {
		return new int[] {-2,-2,3,3,10,12,12,18,18 };
	}
	
	@Test
	public void testXORCase() {
		SortedWithDupXOR sxor = new SortedWithDupXOR();
		int i = sxor.findNotDuplicate(returnArray());
		assertEquals(10, i);
	}
}
