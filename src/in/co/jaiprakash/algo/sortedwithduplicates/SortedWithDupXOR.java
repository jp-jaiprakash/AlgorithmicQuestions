package in.co.jaiprakash.algo.sortedwithduplicates;

/*
 * Time complecity : N
 * Space complexity: 1
 */
public class SortedWithDupXOR {

	public int findNotDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++)
			ans = ans ^ arr[i];
		return ans;
	}

}
