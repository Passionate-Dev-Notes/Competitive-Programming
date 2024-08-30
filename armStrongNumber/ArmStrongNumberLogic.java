package armStrongNumber;

public class ArmStrongNumberLogic {
	int totalDigit =0;
	int totalDigit1 = totalDigit;
	int totalSum =0;
	int checkTotal;
	public int checkArmstrongNumber(int number) {
		checkTotal= number;
		int sum =0;
		int index =0;
		while(number>0) {
			number = number/10;
			totalDigit++;
			
		}
		totalDigit1 = totalDigit;
		int array[] = new int[totalDigit];
		while(totalDigit>0) {
			int temp = checkTotal%10;
			array[index] = temp;
			checkTotal = checkTotal/10;
			index++;
			totalDigit--;
		}
		for(int i =0; i<array.length; i++) {
			sum= (int)Math.pow(array[i], totalDigit1);
			totalSum += sum;
		}
		return sum;
	}
	
}
