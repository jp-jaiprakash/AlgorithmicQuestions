package in.co.jaiprakash.arrays.bothsorted;

public class BruteForce {

	public int[] readArrayInput() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * check if the elements are in sorted order
	 * */
	public boolean checkIfArrayIsSorted(int[] arrayA) {
		// TODO Auto-generated method stub
		if(null == arrayA || arrayA.length < 2)
			return true;
		boolean sorted= false;
		for(int i=arrayA.length -1; i>0 ;i--) {
			if(arrayA[i] < arrayA[i-1])
				return sorted;
		}
		return !sorted;
	}

	/*
	 * This method will be used to print the Array
	 * */
	public void printArray(int[] arrayA) {
		// TODO Auto-generated method stub
		if(null != arrayA && arrayA.length > 0) {
			for(int i: arrayA) {
				System.out.print(i+ " ");
			}
		}
		System.out.println();
	}

	/*
	 * This method will copy the elements of two arrays in one
	 * */
	public int[] copyInArrayC(int[] arrayA, int[] arrayB) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		int length = 0;
		if(null!= arrayA)
			length = length + arrayA.length;
		
		if(null!= arrayB)
			length = length + arrayB.length;
		
		int [] arrayC = new int[length];
		while(null!=arrayA && i < arrayA.length ) {
			arrayC[i] = arrayA[i];
			i++;
		}
		
		while(null!=arrayB && j < arrayB.length ) {
			arrayC[i] = arrayB[j];
			i++;
			j++;
		}
		
		return arrayC;
	}

}
