package fabonacciSeries;

public class FabonacciSeriesRec {
	public int fabonacciSeriesUsingRec(int data) {
		if(data == 0) {
			return 0;
		}
		else if(data ==2 || data==1) {
			return 1;
		}
		else {
			return fabonacciSeriesUsingRec(data-1)+fabonacciSeriesUsingRec( data-2);
		}
	}

}
