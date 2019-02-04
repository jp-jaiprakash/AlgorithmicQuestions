package in.co.jaiprakash.algo.binarysearch;

public class BinarySearchIterative {

	public boolean search(int[] arr, int search) {
		// TODO Auto-generated method stub
		int low = 0; int high = arr.length -1;
		int mid ;
		while(low <= high) {
			mid = (low + high)/2;
			
			if( arr[mid] == search)
				return true;
			else if( arr[mid] < search)
				low = mid +1;
			else
				high = mid -1;
		}
		return false;
	}

	public static void main(String[] args) {
		int [] arr ={2,3,5,9,20 };
		
		BinarySearchIterative bst = new BinarySearchIterative();
		boolean b = bst.search(arr, 15);
		System.out.println(b);
	}
	
}
