import java.util.Scanner;

public class LocationOfPerson {

	public static void main(String[] args) {
		char c = 'R';
		int x = 0, y = 0;
		int distance = 10;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the step that you want to move");
		int n = sc.nextInt();
		while (n > 0) {
			switch (c) {
			case 'R': {
				x = x + distance;
				distance = distance + 10;
				System.out.println(n);
				c = 'U';
				// System.out.println(n);
				break;
			}
			case 'U': {
				y = y + distance;
				distance = distance + 10;
				System.out.println(n);
				c = 'L';
				break;
			}
			case 'L': {

				x = x - distance;
				distance = distance + 10;
				System.out.println(n);
				c = 'D';
				break;
			}

			case 'D': {

				y = y - distance;
				distance += 10;
				System.out.println(n);
				c = 'A';
				break;
			}

			case 'A': {
				x += distance;
				distance += 10;
				System.out.println(n);
				c = 'R';
				break;
			}
			}
			n--;
		}
		System.out.print(x);
		System.out.print(y);
	}

}
