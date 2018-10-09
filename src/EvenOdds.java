import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {

		// open scanner
		Scanner input = new Scanner(System.in);

		//
		int oneHundred;
		int evenOrOdd;
		String userName;
		String continueYN;

		System.out.println("Welcome to the Even or Odd program.");
		System.out.println("Please enter your name:");
		userName = input.next();
		System.out.println("Hello " + userName + ".");
		System.out.println("This will tell you different things about a number you input between 1-100.");
		
		
		do {
		System.out.println("Please enter a number between 1 and 100.");

		oneHundred = input.nextInt();

		evenOrOdd = (oneHundred % 2);
		
		
		if (evenOrOdd != 0 && oneHundred < 60) {

			System.out.println(userName + ", that number is odd.");

		} else if (evenOrOdd == 0 && oneHundred <= 25) {

			System.out.println(userName + ", that number is even and less than 25.");

		} else if (evenOrOdd == 0 && oneHundred >= 26 && oneHundred <= 60) {

			System.out.println(userName + ", that number is even.");

		} else if (evenOrOdd == 0 && oneHundred >= 61 && oneHundred <= 100) {

			System.out.println(userName + ", " + oneHundred + " is even.");

		} else if (evenOrOdd != 0 && oneHundred >= 60 && oneHundred <= 100) {

			System.out.println(userName + ", " + oneHundred + " is odd and over 60.");

		}
		else if (oneHundred < 1 || oneHundred > 100) {
			System.out.println(userName + "! That number is not between 1 and 100.");
		}

		System.out.println("Would you like to continue? You can type Yes (or y) or, No (or n).");
		continueYN = input.next();
		} while(continueYN.equalsIgnoreCase("Yes") || continueYN.equalsIgnoreCase("y"));

		System.out.println(userName + ", thank you for using this program!");
		
		System.exit(0);
		
		input.close();

	}

}
