package harshardNumber;
/*
 * Example :
Input: 378
Output: Yes it is a Harshad number.
Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a
 harshad number
 */

public class HarshadOrNivenNumber {

	public static void main(String[] args) {
		HarshadNumberLogic hrshard = new HarshadNumberLogic();
		boolean result = hrshard.isHarshadNumber(378);
		if(result)
			System.out.println("Yes, It's Harshad Number");
		else
			System.out.println("No");
	}

}
