package in.co.jaiprakash.arrays.twontoonen;

public class SortTheArrayInNIter {

	public int getNumberOfIterations(int[] arr) {
		// TODO Auto-generated method stub
		int p1=0; int p2= arr.length -1;
		int cnt = 0;
		while(p1 < p2) {
			while(p1 < arr.length && arr[p1] == 0)
				{p1++; }
			
			while(p2 > 0 && arr[p2] == 1)
				{p2--; }
			
			
			if(p2 > p1) {
				arr[p1] =0;
				arr[p2] = 1;
			}
			cnt++;
		}
		return cnt;
	}

}
