package seriesSum;
// using loop 
public class ApSumLogicUsingLoop {
	public int apSum(int a, int d , int n) {
		int sum =0;
		for(int i = 0; i<n; i++) {
			sum = sum +a;
			a= a+d;
		}
		return sum;
	}

}
