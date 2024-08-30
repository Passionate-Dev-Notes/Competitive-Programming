package armStrongNumber;

public class ArmStrongNumberUsingSimpleLogic {
	public int checkArmstrongNumber(int data) {
		int length = String.valueOf(data).length();
		int check = data;
		int sum=0;
		int temp=0;
		int result =0;
		while(data > 0) {
			temp = data%10;
			result = (int)Math.pow(temp, length);
			sum += result;
			data = data/10;
		}
		if(sum== check)
			return sum;
		return 0;
	}

}
