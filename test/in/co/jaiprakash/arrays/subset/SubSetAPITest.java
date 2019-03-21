package in.co.jaiprakash.arrays.subset;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SubSetAPITest {

	int[] returnArray() {
		return new int[] { -1, 10, 3, 12, -6, 25 };
	}

	@Test
	public void findNumberOfPairs() {
		SubSetAPI sbapi = new SubSetAPI();
		boolean exists = sbapi.existsASubSet(returnArray(), 21);
		assertEquals(true, exists);
	}
}
