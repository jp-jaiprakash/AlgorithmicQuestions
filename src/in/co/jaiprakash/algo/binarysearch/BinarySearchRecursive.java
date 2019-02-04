package in.co.jaiprakash.algo.binarysearch;

public class BinarySearchRecursive {

	public boolean searchElement(int[] arr, int k, int high, int low) {
		// TODO Auto-generated method stub
		int mid = (high + low)/2;
		if(arr[mid] == k)
			return true;
		else if ( arr[mid] < k) {
			return searchElement(arr, k, high, mid+1);
		}else if( arr[mid] > k)
			return searchElement(arr, k, mid-1, low);
		else
			return false;
		
	}

}
