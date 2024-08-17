package tcsNqtLocationOfPeople;

import java.util.Scanner;

class LogicForPrediction{
	public int logicOfLocationPrediction(int n) {
		int x=0,y=0;
		int distance =10;
		char c ='R';
		while(n>1) {
			switch(c) {
			case 'R':{
				x +=distance;
				distance += 10;
				c ='U';
				System.out.println(n);
				break;			
			}
			case 'U':{
				y += distance;
				distance += 10;
				c = 'L';
				System.out.println(n);
				break;
			}
			case 'L':{
				x -= distance;
				distance += 10;
				c= 'D';
				System.out.println(n);
				break;
			}
			case 'D': {
				y -= distance;
				distance += 10;
				c ='A';
				System.out.println(n);
				break;
			}
			case 'A':{
				x +=distance;
				distance +=10;
				c ='R';
				System.out.println(n);
			break;				
			}	
			
			}
			n--;
		}
		System.out.println(x+":"+y);
		return 0;	
	}
}

public class LocationOfPeople {

	public static void main(String[] args) {
	LogicForPrediction obj = new LogicForPrediction();
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	obj.logicOfLocationPrediction(n);
	System.out.println(obj.logicOfLocationPrediction(n));
	}

}
