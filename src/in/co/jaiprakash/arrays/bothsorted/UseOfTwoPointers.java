package in.co.jaiprakash.arrays.bothsorted;
/*
 * Algorithm:
 * 1. Use two pointers, one pointing to arrayA and other pointing to arrayB
 * 2. if element in A is less than element in B :=> Copy the element from A to C and increment pointer of A
 * 3. Else copy B and increment B's pointer
 * 4. Copy all the remaining elements of A and B
 * 
 * Time complexity: N + M
 * Space complexity: N + M
 */
public class UseOfTwoPointers {

	public void printArray(int[] array) {
		// TODO Auto-generated method stub
		if (null != array)
			for (int i : array)
				System.out.print(i + " ");

		System.out.println();
	}

	public boolean isArraySorted(int[] array) {
		// TODO Auto-generated method stub
		if (null != array && array.length > 1)
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1])
					return false;
			}
		return true;
	}

	public int[] useTwoPointers(int[] arrA, int[] arrB) {
		// TODO Auto-generated method stub
		int p1 = 0, p2 = 0;
		int arrayLength = 0;
		if (null != arrA && arrA.length > 0)
			arrayLength = arrayLength + arrA.length;

		if (null != arrB && arrB.length > 0)
			arrayLength = arrayLength + arrB.length;

		int arrC[] = new int[arrayLength];
		int i = 0;

		while (p1 < arrA.length && p2 < arrB.length) {
			if (arrA[p1] <= arrB[p2]) {
				arrC[i] = arrA[p1];
				p1++;
			} else if (arrB[p2] < arrA[p1]) {
				arrC[i] = arrB[p2];
				p2++;
			}
			i++;
		}
		while (p1 < arrA.length) {
			arrC[i] = arrA[p1];
			p1++;
			i++;
		}

		while (p2 < arrB.length) {
			arrC[i] = arrB[p2];
			p2++;
			i++;
		}
		return arrC;
	}

	public static void main(String[] args) {
		int[] a = new int[] { -1, 10, 12, 18, 20, 25, 36 };
		int[] b = new int[] { -6, -3, 2, 10, 16 };

		UseOfTwoPointers ut = new UseOfTwoPointers();
		int[] c = ut.useTwoPointers(a, b);
		ut.printArray(c);
	}
}
