
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // print main page

//        System.out.println("Welcome To Extended Stay America");
//        System.out.println("Please choose your option");
//        System.out.println("1. House\t (In House Guest List)\t(Departures List)");
//        System.out.println("2.Reservation\t (CheckIn) ");
//        System.out.println("3.Admin Portal\t(Employees)\t(report)");
//        System.out.println("4.");

     // choose option
        // implement option ( create method in another class
        Scanner scan = new Scanner(System.in);
       int choice=0;
       System.out.println("\n\n\t\t\t\t Welcome To Extended Stay America \t\t\n\n");
		//login.login();
       while (true) {
			
		   System.out.println("1.GuestList");
           System.out.println("2. CheckInList");
           System.out.println("3. InHouse");
           System.out.println("4. Reservation ");
           System.out.println("5.Employees Report ");
           System.out.println("6. Logout");
           System.out.println("Enter your choice::");
           
           choice = scan.nextInt();
       
        choice = scan.nextInt();
        // when user choose number inside some function
        if (choice == 1) {
        	 System.out.println("Enter first name::");
             String firstName = scan.next();       
             System.out.println("Enter last name::");
             String lastName = scan.next();
        	
        } else if (choice == 2) {


        } else if (choice == 3) {


        }
    }}
