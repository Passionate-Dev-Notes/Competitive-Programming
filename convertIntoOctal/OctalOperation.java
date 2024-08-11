package convertIntoOctal;
class Operation{
	public int operation(int[] n) {
		int size = n.length; 
		int[] sum = new int[(size+2)/3];
		int result = 0;
		int index= sum.length-1;
		int valueOfOctalDigit=0;
		for(int i = size; i>0; i -=3) {
			if(i>=3) {
				valueOfOctalDigit = (n[i-1]*1)+(n[i-2]*2)+(n[i-3]*4);
				sum[index--]=valueOfOctalDigit; 
			}
			if(i==2) {
				valueOfOctalDigit = (n[i-1]*1)+(n[i-2]*2);
				sum[index--]=valueOfOctalDigit; 
			}
			if(i==1) {
				valueOfOctalDigit = (n[i-1]*1);
				sum[index--]=valueOfOctalDigit; 
			}
			
		}
		for(int i = 0;i<sum.length; i++) {
			result = (result*10)+sum[i];
		}
		return result;
}
}
		
		


public class OctalOperation {

	public static void main(String[] args) {
		Operation obj = new Operation();
		int[] arr = {1,1,0,1,1,0,0};
		int n = obj.operation(arr);
		System.out.println(n);

	}

}
