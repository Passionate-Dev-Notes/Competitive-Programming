package sorting;

class InsertionSortLogic{
	public int[] insertionSortLogic(int arr[]) {
		int temp =0,j;
		for(int i =1; i<arr.length;i++) {
			temp = arr[i];
			j=i-1;
			while(j>=0 && arr[j]>=temp) {
				arr[j+1] = arr[j];
				j--;
				//System.out.println(j);
			}
			System.out.print(j+" ");
			arr[j+1]= temp;
		}
		
		return arr;
	}
}
public class InsertionSort {

	public static void main(String[] args) {
		InsertionSortLogic obj = new InsertionSortLogic();
		int arr[] = {4,1,3,4,5,7,8,2};
		int result[] = obj.insertionSortLogic(arr);
		System.out.println();
		for(int a : result) {
			System.out.print(a+" ");
		}

	}

}
