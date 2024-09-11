package removinVowelConsonantWhiteFromString;

public class LogicOfRemovingVowelConAndWhiteSpace {
	public void removeVowelConsonantWhiteSpace(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		int vowel= 0;
		int consonant = 0;
		int whiteSpace = 0;
		for(int i =0 ; i<str.length()-1;i++) {
			if(charArray[i]=='a' ||charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u' )
				vowel++;
			else if(charArray[i]==' ')
				whiteSpace++;
			else
				consonant++;
		}
		
		
		System.out.println("Total number of vowel in String "+vowel);
		System.out.println("Total number of consonant in String  "+ consonant);
		System.out.println("Total white space "+whiteSpace);
		
	}

}
