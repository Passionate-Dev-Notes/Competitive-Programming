package removingCharacterExceptAlphabets;

public class RemovingCharLogic {
	public String removeCharLogic (String str) {
		str= str.toLowerCase();
		int index=0;
		int n =0;
		char[] charArr = new char[str.length()];
 		for(int i =0; i<=str.length()-1;i++) {
			if(str.charAt(i) >='a' && str.charAt(i)<='z') {
				charArr[index] = str.charAt(i);
				index++;
				
			}
			else {
				continue;
			}
		}
		return String.valueOf(charArr);
	}

}
