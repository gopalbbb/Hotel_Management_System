import java.util.List;
import java.util.Scanner;

/**
 *
 *
 */
public class RoomList {

    public int UserInput(List<Integer> rooms) {
        System.out.println("Please type room number to book: ");
        Scanner inp = new Scanner(System.in);
//        ArrayList<Integer> rooms = new ArrayList<Integer>();

        for (int i = 0; i <= 30; i++) {
            System.out.println("Please type room number to book: ");
            int userinp = inp.nextInt();
//            System.out.println(userinp);

            boolean check = rooms.contains(userinp);

            if (check) {
                System.out.println(rooms);
                continue;
            } else {
                rooms.add(userinp);
                System.out.println("Room Assigned");
                System.out.println(rooms);

            }
            }
        System.out.println("Please do another step from here");
        return 0;
    }
    }


