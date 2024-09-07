package removeVowelFromString;

public class RemoveVowelFromStringLogic {
	public String removeVowelFromString(String str) {
		int count = 0;
		int index=0;
		char charstore[]=new char[str.length()];
		char[] charArr = str.toLowerCase().toCharArray();
		for(int i =0; i<charArr.length-1;i++) {
			if(charArr[i] == 'a' ||charArr[i] =='e'||charArr[i] == 'i'
					||charArr[i]=='o' || charArr[i]=='u') {
				count++;
			}
			else {
				
				charstore[index] = charArr[i];
				index++;
			}
		}
		return String.valueOf(charstore);
	}

}
