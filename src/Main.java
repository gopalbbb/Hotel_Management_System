
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // print main page

        System.out.println("Welcome To Extended Stay America");
        System.out.println("Please choose your option");
        System.out.println("1. House\t (In House Guest List)\t(Departures List)");
        System.out.println("2.Reservation\t (CheckIn) ");
        System.out.println("3.Admin Portal\t(Employees)\t(report)");
        System.out.println("4.");


        Scanner scan = new Scanner(System.in);
       int choice=0;
        // choose option
        // implement option ( create method in another class
        choice = scan.nextInt();
        // when user choose number inside some funcation
        if (choice == 1) {

        } else if (choice == 2) {


        } else if (choice == 3) {


        }
    }}
