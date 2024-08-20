package sorting;
class QuickSortLogic{
	public void quickSortlogic(int[] arr, int low, int high) {
		if(low<high) {
			int pi = partition(arr, low, high);
			quickSortlogic(arr, low, pi-1);
			quickSortlogic(arr, pi+1, high);
		}
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = high;
		int i =low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
}

public class Quicksort {

	public static void main(String[] args) {
		QuickSortLogic obj = new QuickSortLogic();
		int arr[] = {12,32,21,44,6,7,4,2,1,};
		obj.quickSortlogic(arr, 0, arr.length-1);
		for(int a :arr) {
			System.out.print(a+ " ");
		}
	}

}
