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
		
		
		System.out.println("Please enter your favorite ROYBGIV color: \n(Enter help if you do not know what ROYBGIV is.)");
		String favoriteColor = result.nextLine();
		
		while(favoriteColor.toLowerCase().equals("help")) {
			System.out.println("Red, Orange, Yellow, Green, Indigo, Violet\n");
			System.out.println("Please enter your favorite ROYBGIV color: \n(Enter help if you do not know what ROYBGIV is.)");
			favoriteColor = result.nextLine();
		}
		
		
		System.out.println("Please enter the number of siblings that you have: ");
		String siblings = result.nextLine();

		
		if(userAge )
		
		
		
		
		
		
		
		
	}

}
