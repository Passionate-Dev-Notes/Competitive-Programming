package sorting;

class MergeSortLogic{
	public void mergeSort(int[] arr, int l, int r) {
		/*Recursive method update the parameter when after the calling
		 * its was successfully execute.
	     */
		if(l<r) {
			//System.out.println(r);
			int mid = (l+r)/2;
			System.out.println("Before Recursion Mid:"+mid +" And R :"+r);
			mergeSort(arr, l, mid);
			System.out.println("recursion1 Mid:"+mid +" And R :"+r);
			mergeSort(arr, mid+1, r);
			System.out.println("Recursion 2 Mid:"+mid+" And R :"+r);
			mergeSortLogic(arr, l, mid, r );
		}
	}

	private void mergeSortLogic(int[] arr, int l, int mid, int r) {
		System.out.println("inLogic");
		int lArrSize = mid-l+1;
		int rArrSize = r-mid;
		int[] lArr = new int[lArrSize];
		int[] rArr = new int[rArrSize];
		
		for(int i=0; i<lArrSize; i++) {
			lArr[i] = arr[l+i];
		}
		for(int i =0; i<rArrSize; i++) {
			rArr[i] = arr[mid+1+i];
		}
		int x=0,y=0,k=l;
		
		while(x<lArrSize && y<rArrSize) {
			if(lArr[x] <= rArr[y]) {
				arr[k] = lArr[x];
				x++;
			}
			else {
				arr[k] = rArr[y];
				y++;
			}
			k++;
		}
		while(x<lArrSize) {
			arr[k] = lArr[x];
			x++;
			k++;
		}
		while(y<rArrSize) {
			arr[k] = rArr[y];
			y++;
			k++;
		}
		
	}
}
public class MergeSort {

	public static void main(String[] args) {
		int[] array = {21,33,4,1,58,10,22,3,91,12,93,11};
		/*
		 * System.out.println("Before Sorting"); for(int a :array) {
		 * System.out.print(a+" ");
		 * 
		 * }
		 */
		MergeSortLogic obj = new MergeSortLogic();
		obj.mergeSort(array, 0, array.length-1);
		
	    System.out.println();
	    System.out.println("After Sorting");
	    for(int a :array) {
	    	System.out.print(a+" ");
	    	
	    }
		
	}

}
