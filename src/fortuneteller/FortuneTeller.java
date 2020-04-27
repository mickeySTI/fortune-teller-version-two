package fortuneteller;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner result = new Scanner(System.in);

		System.out.println("Please enter your first name: ");
		String firstName = result.nextLine();

		System.out.println("Please enter your last name: ");
		String lastName = result.nextLine();

		System.out.println("Please enter your age: ");
		int userAge = result.nextInt();

		System.out.println("Please enter your birth month using 1-12: ");
		int birthMonth = result.nextInt();

		System.out.println(
				"Please enter your favorite ROYBGIV color: \n(Enter help if you do not know what ROYBGIV is.)");
		String favoriteColor = result.next();

		while (favoriteColor.toLowerCase().equals("help")) {
			System.out.println("Red, Orange, Yellow, Blue, Green, Indigo, Violet\n");
			System.out.println(
					"Please enter your favorite ROYBGIV color: \n(Enter help if you do not know what ROYBGIV is.)");
			favoriteColor = result.next();
		}
		
		

		System.out.println("Please enter the number of siblings that you have: ");
		int siblings = result.nextInt();

		String retirement = "";

		if (userAge%2 == 0) {
			retirement = "10 years";
		}

		else {
			retirement = "15 years";
		}
		
		
		String vacationHome = "";
		
		if(siblings >= 5) {
			vacationHome = "Canada";
		}
		
		else if(siblings <= 0) {
			vacationHome = "Antartica";
		}
		
		else {
			vacationHome = "Florida";
		}
		
		
		
		String transportation = "";
		favoriteColor = favoriteColor.toLowerCase();
		
		switch(favoriteColor) {
		
		case "red":
			transportation = "WRX STI";
			break;
			
		case "orange":
			transportation = "Mustang";
			break;
		case "yellow":
			transportation = "Mazda 6";
			break;
		case "blue":
			transportation = "Civic";
			break;
		case "green":
			transportation = "Charger";
			break;
		case "indigo":
			transportation = "WRX";
			break;
		case "violet":
			transportation = "Evo";
			break;
		
		}
			
		
		String bankBalance = "";
		
		if(birthMonth <=4) {
			bankBalance = "$1,000,000.00";
		}
		if(birthMonth >= 5 && birthMonth <= 8) {
			bankBalance = "$1,000.00";
		}
		if(birthMonth >=9 && birthMonth <=12) {
			bankBalance = "$80";
		}
		
		
		
		
		System.out.println(firstName + " " + lastName + " will retire in " + retirement+ " with " + bankBalance + " in the bank, a vacation home in " + vacationHome + " , and travel by using a " + transportation +"." );
		
		
		

	}

}
