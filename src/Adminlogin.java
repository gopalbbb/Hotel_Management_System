

import java.util.Scanner;

public class Adminlogin {

	void login() {
		Scanner scan = new Scanner(System.in);
			System.out.println("Authorized person's Name");
			String name = scan.nextLine();
			System.out.println("Enter Authorize Id  ");
	        String Id = scan.next();
	        if ((Id.equalsIgnoreCase("1234"))&&(name.equalsIgnoreCase("Extended Stay America"))) {
	            System.out.println("Authorized login successfully ");
	        } else {
	            System.out.println("you are not authorize person ");
	            System.exit(1);
	        }	
	
	}
	}
