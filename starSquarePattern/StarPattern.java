package starSquarePattern;

class StarPatternLogic{
	public void logicStar(int n) {
		int n1=n;
		for(int i =1; i<=n; i++) {
			if(i==1 || i==n) {
				while(n1>0) {
					System.out.print("*");
					n1--;
				}
				System.out.println();
				n1=n;
			}
			
			else if(i>0 || i<n-1) {
				System.out.print("*");
				for(int j=1; j<n-1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}
}

public class StarPattern {

	public static void main(String[] args) {
		StarPatternLogic obj = new StarPatternLogic();
		obj.logicStar(4);
		

	}

}
