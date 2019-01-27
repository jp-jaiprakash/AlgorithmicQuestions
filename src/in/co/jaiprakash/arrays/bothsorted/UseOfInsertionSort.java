package in.co.jaiprakash.arrays.bothsorted;

public class UseOfInsertionSort {

	/*
	 * Algorithm:
	 * 	1.Copy arrayA in new array C (Time N )
	 *  2. insert elements of array B in array C (N * M)
	 *  3. space complexity: 
	 *  Time complexity = N + (N*M)
	 *  Space complexity: (N + M) for arrayC
	 * */
	public void printArray(int[] array) {
		// TODO Auto-generated method stub
		if(null != array )
			for(int i: array)
				System.out.print(i + " ");
		
		System.out.println();
		
	}

	/*
	 * Please check that we use same logic for checking if array is sorted and in sorting method i.e.
	 * if increasing order followed here and then same should be used while sorting
	 */
	public boolean isArraySorted(int[] array) {
		// TODO Auto-generated method stub
		if(null != array && array.length > 1)
			for(int i=0;i< array.length -1; i++) {
				if(array[i] > array[i+1])
					return false;
			}
		return true;
	}

	public int[] insertBinA(int[] arrayA, int[] arrayB) {
		// TODO Auto-generated method stub
		int arrayLength = 0;
		if(null != arrayA && arrayA.length > 0)
			arrayLength = arrayLength + arrayA.length;
		
		if(null != arrayB && arrayB.length > 0)
			arrayLength = arrayLength + arrayB.length;
		
		int arrC [] = new int[arrayLength];
		int i =0;
		
		if(null != arrayA && arrayA.length > 0)
			for(i=0;i<arrayA.length; i++)
				arrC[i] = arrayA[i];
		
		
		if(null != arrayB && arrayB.length > 0) {
			for(int j =0; j< arrayB.length ; j++) {
				int temp = arrayB[j];
				int hole = i;
				arrC[i] = arrayB[j];
				while( hole > 0 && arrC[hole -1] > temp) {
					arrC[hole] = arrC[hole-1];
					hole--;
				}
				arrC[hole] = temp;
				i++;
			}
		}
		
		return arrC;
	}

}
