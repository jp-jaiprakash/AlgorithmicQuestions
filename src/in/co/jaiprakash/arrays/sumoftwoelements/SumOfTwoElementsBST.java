package in.co.jaiprakash.arrays.sumoftwoelements;
/*
 * Sorting the array : nlogn
 * Search if an element exists: logn
 * We will do search for all the 'n' elements. 
 * Hence complexity: nlogn + nlogn
 */
public class SumOfTwoElementsBST {

	public int [] sort(int [] arr, int left, int right, int [] temp) {
		if(left < right) {
			int mid = (left + right)/2;
			sort(arr,left, mid, temp);
			sort(arr, mid+1, right, temp);
			
			return mergeTheArray(arr, left, right, temp, mid+1);
		}
		return null;
		
	}
	
	private int [] mergeTheArray(int[] arr, int left, int right, int[] temp, int mid) {
		// TODO Auto-generated method stub
		int i= left;
		int j = mid;
		int k= left;
		
		while( i < mid && j <= right) {
			if(arr[i] <= arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]= arr[j++];
		}
		
		while( i <= mid-1)
			temp[k++]= arr[i++];
		
		while(j <= right)
			temp[k++]= arr[j++];
		
		for(i = left; i <= right; i++)
			arr[i]= temp[i];
		
		return arr;
	}

	public int findNumberOfPairs(int[] arr, int sum) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		SumOfTwoElementsBST n = new SumOfTwoElementsBST();
		int [] arr = {4,1,9,11,2};
		int [] temp = new int[arr.length -1];
		n.sort(arr, 0, arr.length -1, temp);
		for(int i: arr)
			System.out.println(i);
	}

}
