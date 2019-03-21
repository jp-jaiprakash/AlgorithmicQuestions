package in.co.jaiprakash.arrays.twontoonen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SortTheArrayInNIterTest {

	int[] returnArray() {
		return new int[] {0,0,1,0,1,1,0,1,1,1 };
	}
	
	@Test
	public void countNoOfIterationTest() {
		SortTheArrayInNIter st = new SortTheArrayInNIter();
		int b =st.getNumberOfIterations(returnArray());
		assertEquals(5, b);
	}
}
