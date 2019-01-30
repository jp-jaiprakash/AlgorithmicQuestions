package in.co.jaiprakash.arrays.inversioncount;

public class ICMergeTwist {

	int[] mergeSort(int[] arr, int left, int right) {
		if (left < right) {

			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			return merge(arr, left, mid, right);
		}
		return null;

	}

	private int[] merge(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		int leftArr[] = new int[mid - left + 1];
		int rightArr[] = new int[right - mid];
		System.out.println("left is " + left);
		System.out.println("right is " + right);
		for (int y : arr)
			System.out.print(y + " ");
		System.out.println();
		for (int i = 0; i < leftArr.length; i++)
			leftArr[i] = arr[left + i];

		for (int j = 0; j < rightArr.length; j++)
			rightArr[j] = arr[mid + 1 + j];

//		for (int y : leftArr)
//			System.out.print(y + " ");
//		System.out.println();
//
//		for (int y : rightArr)
//			System.out.print(y + " ");
//		System.out.println();
		System.out.println("******************8");
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftArr.length && j < rightArr.length) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else if (rightArr[j] < leftArr[i]) {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < leftArr.length) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < rightArr.length) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}

		return arr;
	}

	public int getNoOfPairs(int[] array) {
		// TODO Auto-generated method stub
		int p1 = 0;
		int p2 = array.length - 1;
		while (p1 < p2) {

		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 10, 6, 5, 11 };
		ICMergeTwist ic = new ICMergeTwist();
		int[] arr1 = ic.mergeSort(arr, 0, arr.length - 1);

	}
}
