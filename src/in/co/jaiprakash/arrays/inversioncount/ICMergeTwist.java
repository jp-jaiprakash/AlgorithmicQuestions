package in.co.jaiprakash.arrays.inversioncount;

public class ICMergeTwist {

	int mergeSort(int[] arr, int left, int right, int [] temp) {
		int inversionCcnt = 0;
		if (left < right) {

			int mid = (left + right) / 2;

			inversionCcnt = mergeSort(arr, left, mid, temp);
			inversionCcnt += mergeSort(arr, mid + 1, right, temp);

			inversionCcnt += merge(arr, left, mid+1, right, temp);
		}
		return inversionCcnt;

	}

	public int merge(int[] arr, int left, int mid, int right, int [] temp) {
		// TODO Auto-generated method stub
		
		int inversionCcnt = 0;

		int i = left;
		int j = mid;
		int k = left;

		while (i <= mid-1 && j <= right) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else if (arr[j] < arr[i]) {
				temp[k++] = arr[j++];
				inversionCcnt = inversionCcnt + (mid-i);
			}
		}
		while (i <= mid-1) {
			temp[k++] = arr[i++];
		}

		while (j <= right) 
			temp[k++] = arr[j++];

		for(i = left; i<=right; i++)
			arr[i] = temp[i];
		return inversionCcnt;
	}

	public int getNoOfPairs(int[] array) {
		// TODO Auto-generated method stub
		int temp[] = new int[array.length];
		int cnt = mergeSort(array, 0, array.length - 1, temp);
		return cnt;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 10, 6 };
		int temp[] = new int[arr.length];
		ICMergeTwist ic = new ICMergeTwist();
		int arr1 = ic.mergeSort(arr, 0, arr.length - 1, temp);
		System.out.println(arr1);
		

	}
}
