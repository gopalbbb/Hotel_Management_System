
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Scanner;

import HotelMgmtSys.CheckIn;
import HotelMgmtSys.HMServices;

public class Main {


    public static void main(String[] args) {
      
    	// Extended CheckIn Class
    	
    	CheckIn checkin = null;
    	
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
        
        // GuestCheckIn Method
        
        if (choice == 1) {
        	 System.out.println("Enter first name::");
             String firstName = scan.next();       
             System.out.println("Enter last name::");
             String lastName = scan.next();
             
             String username = scan.next();
             System.out.println("Enter password::");
                String password = scan.next();

                CheckIn checkIn = new CheckIn(firstName, lastName,username,password);
                try {
                    try {
                       HMServices.checkInRegistration(checkIn);

                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                } catch (IOException e) {
                    System.out.println(" Please try again later.");
                    e.printStackTrace();
                }


        } else if (choice == 2) {
             try {
                 HMServices.viewAllEmployee();
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
        	

        } else if (choice == 3) {
        	
        	System.out.println("Enter First Name");
            String firstName=scan.next();
            System.out.println("Enter Last Name");
            String lastName=scan.next();
            Gender g = null;
            while (true) {
                System.out.println("1.Male\t 2.Female\t 3.Others");
                System.out.println("Choose the gender.");
                int genderChoice = scan.nextInt();
                if (genderChoice == 1) {
                    g = Gender.MALE;
                } else if (genderChoice == 2) {
                    g = Gender.FEMALE;
                } else if (genderChoice == 3) {
                    g = Gender.OTHERS;
                } else {
                    System.out.println("Invalid option.");
                    continue;
                }
                break;}
                System.out.println("Address");
                String address=scan.next();
                RoomType r=null;
                while (true) {
                    System.out.println("1.STANDARD\t 2.DELUX\t 3.SUPERDELUX");
                    System.out.println("Choose Room Type.");
                    int roomchoice = scan.nextInt();
                    if (roomchoice == 1) {
                        r = RoomType.STANDARD;
                    } else if (roomchoice == 2) {
                        r = RoomType.DELUX;
                    } else if (roomchoice == 3) {
                        r = RoomType.SUPERDELUX;
                    } else {
                        System.out.println("Invalid option.");
                        continue;
                    }
                    break;
                }
                System.out.println("Room No.");
                int roomNum=scan.nextInt();
            System.out.println("payment :- Standard $300,Deluxe $500,SuperDeluxe $700");
            int payment = scan.nextInt();

        }
        
       }




   
