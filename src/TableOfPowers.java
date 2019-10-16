import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {


		// extended challenge - multiplication table

		Scanner scan = new Scanner(System.in);
		System.out.println("Learn your squares and cubes! Super fun!\n");
		
		String cont = "y";
		String number = "Number";
		String square = "Squared";
		String cube = "Cubed";
		String lineItem = "=====";
		int squared;
		int cubed;
		
		
		do {
			System.out.println("Please enter a number."); // prompt user to enter int and assume user will enter valid
															// data
			int userNum = scan.nextInt();
			System.out.printf("%1s %9s %8s%n", number, square, cube);
			System.out.printf("%1s %9s %9s%n", lineItem, lineItem, lineItem);
			
			for (int i = 1; i < userNum; i++) {
				squared = i * i;
				cubed = i * i * i;
				
				// display table of squares and cubes from 1 to the value entered
				System.out.printf("%3d %9d %9d%n", i, squared, cubed);
			}

			// loop - ask if user wants to continue and only continue if they agree to
			System.out.println("Would you like to enter another number? (y/n)");
			cont = scan.next();
			System.out.println();
			
		} while ((cont.equalsIgnoreCase("y")) || (cont.equalsIgnoreCase("yes")));

		
			

		System.out.println("I hope this was informative! Goodbye.");
		scan.close();

	}


}
