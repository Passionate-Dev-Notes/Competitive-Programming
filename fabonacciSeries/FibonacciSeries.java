package fabonacciSeries;

public class FibonacciSeries {

	public static void main(String[] args) {
		FabonacciSeriesLogic fbn = new FabonacciSeriesLogic();
		int result[] =fbn.fabonacciNumber(5);
		for(int n : result) {
			System.out.print(n+" ");
		}
	}
	

}
