package starSquarePattern;

class Pattern{
	public void show(int n) {
		for(int i =0; i<n;i++) {
			if(i==0 || i==n-1) {
				for(int j = 0; j<n;j++) {
					System.out.print("*");
				}
		}
			else {
				System.out.print("*");
				for(int k =1;k<n-1;k++ ) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
			}
				
				
	}
	}
	
public class SquarePattern {

	public static void main(String[] args) {
		Pattern obj = new Pattern();
		int n=5;
		obj.show(n);
	

	}

}
