package strongNumber;

public class StrongNumberLogic {
	int sum = 0;

	public boolean isStrongNUmber(int data) {
		int checkPar1 = 0;
		int dataCopy = data;
		while (data > 0) {
			int data1 = data % 10;
			data = data / 10;
			int checkPar = checkStrongNumberRec(data1);
			checkPar1 = checkPar1 + checkPar;
		}

		if (dataCopy == checkPar1)
			return true;
		else
			return false;
	}

	public int checkStrongNumberRec(int num1) {

		if (num1 == 0 || num1 == 1) {
			return 1;
		} else {
			return num1 * checkStrongNumberRec(num1 - 1);

		}

	}
}
