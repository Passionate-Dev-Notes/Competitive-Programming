package calculatePower;

public class CalculatePowerLogic {
	public int calculatePowerLogic(int data,int pow) {
		int afterCalPow = powerLogic(data,pow);
		return afterCalPow;
	}
	public int powerLogic(int d,int e) {
		if(e==0) {
			return 1;
		}
		else {
			return d*powerLogic(d, e-1);
		}
		
	}

}
