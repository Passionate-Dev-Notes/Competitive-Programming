package permutation;

public class NPeopleCanSeatOnRSeats {
	public int permutationNofR(int n , int r) {
		int factN = factorialOfNUsingRec(n);
		int factN_R = factorialN_R_Rec(n-r);
		return factN/factN_R;
	}

	private int factorialN_R_Rec(int i) {
		if(i==0 || i == 1) {
			return 1;
		}
		else
			return i*factorialN_R_Rec(i-1);
	}

	private int factorialOfNUsingRec(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else {
			return n*factorialOfNUsingRec(n-1);		}
	
	}

}
