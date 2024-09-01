package seriesSum;

public class GpSeriesLogic {
	public void gpSeriesSumLogic(int a , int r, int n) {
		int sum =0;
		for(int i = 0; i <n;i++) {
			int pow = commonRationPower(r, i);
			sum = sum+(a*pow);
			
		}
		System.out.println("Sum of gp is = "+sum);
	}
	
	public int commonRationPower(int r,int i) {
		if(i==0) {
			return 1;
		}
		else {
			return r*(commonRationPower(r, i-1));
		}
		
	}
 

}
