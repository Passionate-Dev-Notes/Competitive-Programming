package sorting;
class LogicOfSelectionSort{
	public int[] logicOfSelectionSort(int arr[]) {
		int temp=0;
		int index = -1;
		int size = arr.length;
		for(int i = 0; i<size-1;i++) {
			index=i;
			for(int j = i+1; j<size;j++) {
				if(arr[index]<arr[j]) {
					index =j;
				}
			}
			temp = arr[i];
			arr[i]=arr[index];
			arr[index] =temp;
		}
		return arr;
		
	}
    
}

public class SelectionSort {

	public static void main(String[] args) {
		LogicOfSelectionSort obj = new LogicOfSelectionSort();
		int arr[] = {4,1,2,8,5,9,10,3};
		int result[] = obj.logicOfSelectionSort(arr);
		for(int a :result) {
			System.out.print(a+" ");
		}
		
	}

}
