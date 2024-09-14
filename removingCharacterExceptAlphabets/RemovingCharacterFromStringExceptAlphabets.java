package removingCharacterExceptAlphabets;

public class RemovingCharacterFromStringExceptAlphabets {

	public static void main(String[] args) {
		RemovingCharLogic rmvChar = new RemovingCharLogic();
		String str = rmvChar.removeCharLogic("take12% *&u ^$#forward");
		System.out.println(str);
	}

}
