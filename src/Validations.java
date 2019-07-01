import java.util.Scanner;

public class Validations {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println(getValidName(scnr, "Please enter a valid name: "));
		System.out.println(getValidEmail(scnr, "Please enter a valid email: "));
		System.out.println(getValidPhoneNumber(scnr, "Enter a valid phone number: "));
		System.out.println(getValidDate(scnr, "Enter a valid date: "));
		System.out.println(getValidHTML(scnr, "Enter a valid set of HTML elements: "));
	}

	public static String getValidName(Scanner scnr, String prompt) {
		String name;
		String valid = "Name is Valid!";
		
		System.out.println(prompt);
		name = scnr.nextLine();
		while(!name.matches("[A-Z][a-zA-Z]{1,29}")) {
			System.out.println("Sorry name is not valid");
			System.out.println(prompt);
			name = scnr.nextLine();
		}
		
//		do {
//			System.out.println("Please enter a valid name: ");
//			name = scnr.nextLine();
//		} while(!name.matches("[A-Z][a-z]{1,30}"));
		
		return valid;
	}
	
	public static String getValidEmail(Scanner scnr, String prompt) {
		String valid = "Email is Valid!";
		String email;
		System.out.println(prompt);
		email = scnr.nextLine();
		
		while(!email.matches("[a-zA-Z0-9]{5,30}[@][a-zA-z]{5,10}[.][a-zA-Z]{2,3}")) {
			System.out.println("Sorry that email is not valid.");
			System.out.println(prompt);
			email = scnr.nextLine();
		}
		return valid;
	}
	
	public static String getValidPhoneNumber(Scanner scnr, String prompt) {
		String valid = "Phone number is Valid!";
		String number;
		
		System.out.println(prompt);
		number = scnr.nextLine();
		
		while(!number.matches("\\d{3}-\\d{3}-\\d{4}")) {
			System.out.println("Sorry that is phone number is not valid.");
			System.out.println(prompt);
			number = scnr.nextLine();
		}
		return valid;
	}
	
	public static String getValidDate(Scanner scnr, String prompt) {
		String valid = "Date is valid!";
		String date;
		
		System.out.println(prompt);
		date = scnr.nextLine();
		
		while(!date.matches("\\d{2}[/]\\d{2}[/]\\d{4}")) {
			System.out.println("Sorry that date is not valid");
			System.out.println(prompt);
			date = scnr.nextLine();
		}
		return valid;
	}
	
	public static String getValidHTML(Scanner scnr, String prompt) {
		String valid = "HTML elements are valid";
		String html;
		
		System.out.println(prompt);
		html = scnr.nextLine();
		
		while(!html.matches("[<][a-zA-Z0-9]+[>] [<][/][a-zA-Z0-9]+[>]")) {
			System.out.println("Sorry, that HTML is not valid");
			System.out.println(prompt);
			html = scnr.nextLine();
		}
		
		return valid;
	}
	
}
