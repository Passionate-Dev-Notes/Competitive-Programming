package fabonacciSeries;

public class FabonacciSeriesLogic {
	public int[] fabonacciNumber(int data) {
		int array[] = new int[(data+1)];
		int index=0;
		for(int i =0; i<(data+1) ; i++) {
			
			array[index]=fabonacciRecursion(i);
			index++;
					
		}
		return array;
	}
	
	public int fabonacciRecursion(int d) {
		if(d ==0) {
			return 0;
		}
		else if(d==1 || d==2){
			
			return 1;
		}
		else {
			return fabonacciRecursion(d-1)+fabonacciRecursion(d-2);
		}
		
		
	}

}
