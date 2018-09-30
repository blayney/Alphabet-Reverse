package alphabetReverse;
import java.util.Scanner;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		System.out.println("Please enter a letter");
		String baseLetter = input.next();
		System.out.println("Please enter a number");
		int n = input.nextInt();
		
		
		int ordinal = -1;
		for (int i = 0; i < alpha.length; i++) {
			if (alpha[i].equals(baseLetter)) {
				ordinal = i;
			}
		}
		System.out.println(ordinal);
		for (int j=n; j > 0;j--) {
			
			System.out.print(alpha[ordinal]);
			ordinal--;
			if (ordinal < 0) {
				ordinal = 25;
			}
		}
		input.close();

	}

}
