package in.co.jaiprakash.algo.sortedwithduplicates;

/*
 * Time complecity : N
 * Space complexity: 1
 */
public class SortedWithDupBF {

	public Integer findUniqueElement(int[] arr) {
		// TODO Auto-generated method stub
		Integer ans = null;
		for(int i=0;i< arr.length; ) {
			int curr = arr[i++];
			int next = arr[i++];
			if(curr != next)
				return curr;
		}
		return ans;
	}

}
