package in.co.jaiprakash.arrays.subset;
/*
 * Check if bit is set, then find the subset sum and return true/false.
 * complexity: N x 2^N
 * space : O(1)
 */
public class SubSetAPI {

	public boolean existsASubSet(int[] arr, int k) {
		// TODO Auto-generated method stub
		int cnt = 0;
		for(int i=0; i < (1<< arr.length); i++) {
			int sum =0;
			for(int j=0; j< arr.length ; j++) {
				if(checkbit(i,j)) {
					sum = sum + arr[j];
				}
				
				if(sum == k)
					cnt++;
			}
		}
		
		if(cnt > 0)
			return true;
		return false;
	}

	private boolean checkbit(int n, int j) {
		// TODO Auto-generated method stub
		return (n & (1<<j)) >= 1 ? true : false;
	}
public static void main(String[] args) {
	
	int arr[] = {-1,10,3};
	SubSetAPI s = new SubSetAPI();
	boolean b = s.existsASubSet(arr, 12);
	System.out.println(b);
}
}
