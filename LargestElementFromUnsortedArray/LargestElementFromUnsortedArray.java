package LargestElementFromUnsortedArray;

public class LargestElementFromUnsortedArray {

	public static void main(String[] args) {
		int arr[] = {10,9,2,8,12,31,30,22,12};
		Bubble obj = new Bubble();
		
		int result = obj.BubbleSort(arr);
		if(result != -1)
		 System.out.println(result);
		else
			System.out.println("element not present");
		
	}

}
class Bubble{
	public int BubbleSort(int arr[]) {
		//{10,9,2,8,12,
		System.out.println("Before Sorting");
		for(int a:arr) {
		System.out.print(a+" ");}
		int size = arr.length;
	
		for(int i=0;i<size-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		}System.out.println();
		System.out.print("Lagest Number is :-");
		return arr[arr.length-1];
	}
}