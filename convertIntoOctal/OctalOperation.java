package convertIntoOctal;
class Logic{
	public int operationOctal(int[] n) {
		int size = n.length;
		int sum[] = new int[(size+2)/3];
		int index = sum.length-1;
		int temValue=0;
		int result=0;
		 for (int i = size - 1; i >= 0; i -=3) {
		        if (i >= 2) {
		            temValue = (n[i] * 1) + (n[i - 1] * 2) + (n[i - 2] * 4);
		            sum[index--] = temValue;
		        } else if (i == 1) {
		            temValue = (n[i] * 1) + (n[i - 1] * 2);
		            sum[index--] = temValue;
		        } else if (i == 0) {
		            temValue = (n[i] * 1);
		            sum[index--] = temValue;
		        }
		    }
		for(int i =0; i< sum.length; i++) {
			result = result*10+(sum[i]);
		}
		return result;
	}
}
public class OctalOperation {

	public static void main(String[] args) {
		Logic obj = new Logic();
		int[] n= {1,1,1,1,1,1,1};
		System.out.println(obj.operationOctal(n));
	}

}
