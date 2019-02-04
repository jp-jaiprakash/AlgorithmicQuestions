package in.co.jaiprakash.arrays.sumoftwoelements;

public class SumOfTwoElementsII {

	public int[] mergeSort(int[] arr, int[] temp, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, temp, left, mid);
			mergeSort(arr, temp, mid + 1, right);

			return merge(arr, temp, left, right, mid + 1);
		}
		return null;
	}

	public int[] merge(int[] arr, int[] temp, int left, int right, int mid) {
		// TODO Auto-generated method stub
		int i = left;
		int j = mid;
		int k = left;

		while (i < mid && j <= right) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}

		while (i < mid)
			temp[k++] = arr[i++];

		while (j <= right)
			temp[k++] = arr[j++];

		for (i = left; i <= right; i++)
			arr[i] = temp[i];

		return arr;
	}

	public int getNumberOfpairs(int[] returnArray, int k) {
		// TODO Auto-generated method stub
		int[] temp = new int[returnArray.length];
		temp = mergeSort(returnArray, temp, 0, returnArray.length - 1);
		int p1 = 0;
		int p2 = temp.length - 1;
		int cnt = 0;
		while(p1<p2){
			int sum = temp[p1] + temp[p2];
			if (sum == k) {
				cnt++;
				p1++;
				p2--;
			} else if (sum < k)
				p1++;
			else
				p2--;
		}
		System.out.print(cnt + " ");
		System.out.println();
		return cnt;
	}

}
