package in.co.jaiprakash.arrays.inversioncount;
/*
 * Algorithm:
 * For each element in the array, compare with all the next elements and check
 * if they satisfy condition 2 :=> increment the counter
 * 
 * Time complexity: N^2
 * Space complexity = O(1)
 * 
 */
public class ICBruteForce {

	public int getNoOfPairs(int[] array) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i = 0;i < array.length; i++) {
			for(int j = i+1; j< array.length; j++) {
				if(array[i] > array[j])
					cnt++;
			}
		}
		return cnt;
	}

}
