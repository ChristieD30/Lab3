import java.util.Scanner;

public class EvenOdds {

	public static void main(String[] args) {

		// open scanner
		Scanner input = new Scanner(System.in);

		//these are the different variables I will be using in the program
		int oneHundred;
		int evenOrOdd;
		String userName;
		String continueYN;

		//this is just the system printing out the beginning the program
		System.out.println("Welcome to the Even or Odd program.");
		System.out.println("Please enter your name:");
		
		//this scanner will accept input for the user to input their name
		userName = input.next();
		
		//greeting the user using their name. 
		System.out.println("Hello " + userName + ".");
		System.out.println("This will tell you different things about a number you input between 1-100.");
		
		//the do while loop will continue until the user chooses no or n. 
		do {
		System.out.println("Please enter a number between 1 and 100.");
		
		//scanner for the number input
		oneHundred = input.nextInt();
		
		//math equation to figure out if even or odd, is the modulus output is 0, the number is even.
		evenOrOdd = (oneHundred % 2);
		
		//if else statment for the conditions. 
		//this one is for if the number is odd and less then 60. 
		if (evenOrOdd != 0 && oneHundred < 60) {

			System.out.println(userName + ", that number is odd.");
			
			//this is for even and less than 25
		} else if (evenOrOdd == 0 && oneHundred <= 25) {

			System.out.println(userName + ", that number is even and less than 25.");
			
			//will find even numbers over 26-60
		} else if (evenOrOdd == 0 && oneHundred >= 26 && oneHundred <= 60) {

			System.out.println(userName + ", that number is even.");
			
			//this conditional will apply to even numbers over 60 - 100
		} else if (evenOrOdd == 0 && oneHundred >= 61 && oneHundred <= 100) {

			System.out.println(userName + ", " + oneHundred + " is even.");

			//this finds odd numbers over 60-100.
		} else if (evenOrOdd != 0 && oneHundred >= 60 && oneHundred <= 100) {

			System.out.println(userName + ", " + oneHundred + " is odd and over 60.");

		}
		//this weeds out any number less than 1 or over 100
		else if (oneHundred < 1 || oneHundred > 100) {
			System.out.println(userName + "! That number is not between 1 and 100.");
		}

		/*
		 * This next part is what will make the loop continue.
		 * the user is prompter to type y or yes to continue.
		 * if they press y or yes the do while loop will continue.
		 * if they press n or no the program will exit the loop and thank them for using the program
		 * */
		System.out.println("Would you like to continue? You can type Yes (or y) or, No (or n).");
		continueYN = input.next();
		} while(continueYN.equalsIgnoreCase("Yes") || continueYN.equalsIgnoreCase("y"));

		System.out.println(userName + ", thank you for using this program!");
		
		System.exit(0);
		
		input.close();

	}

}
