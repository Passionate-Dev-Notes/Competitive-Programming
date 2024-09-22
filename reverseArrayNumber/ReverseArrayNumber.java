package reverseArrayNumber;

public class ReverseArrayNumber {

	public static void main(String[] args) {
		ArrayReverseLogic obj = new ArrayReverseLogic();
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		Integer arr1[] = {10,9,8,7,6,5,4,3,2,1};
		//obj.arrayReverseLogicUsingLibrary(arr1);
		//obj.arrayReverseUsingLoop(arr);
		int n = arr.length;
		obj.reverseUsingRecursion(arr, 0, n-1);

	}

}
