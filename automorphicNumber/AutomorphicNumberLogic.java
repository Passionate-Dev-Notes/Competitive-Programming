package automorphicNumber;

public class AutomorphicNumberLogic {
	public boolean isautomorphicNumber(int data) {
		int sqrData= data*data;
		int checkPoint =0;
		if(sqrData <100) {
			checkPoint = sqrData%10;
		}
		else
		   checkPoint = sqrData%100;
		if(checkPoint == data) 
			return true;
		return false;
	}

}
