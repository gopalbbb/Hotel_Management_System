import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *created room sold record  method,  search  by Check in  date,  its helps admin to find total room sold record .
 *pass method to main class
 *
 *
 *
 */
public class ViewRoomNumber {


    private final static String USERNAME = "root";

    private final static String PASSWORD = "RootPassword";

    private final static String URL = "jdbc:mysql://localhost:3306/hms";





    public CheckIn roomSoldRecord( LocalDate check_in) throws ClassNotFoundException, SQLException {

        CheckIn roomsold = new CheckIn(check_in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        Statement stmt1 = con.createStatement();

        ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) room_no FROM guestlist where check_in ='" + roomsold.getCheckInDate()+ "'");

        while (rs1.next()) {
            System.out.println("The Total Number of Room sold :: " + rs1.getInt(1));
        }

        stmt1.close();
        con.close();
        return null;
    }
// if case of using  view all sold room history is in here
    public List<ViewRoomNumber> viewAllRoom() throws IOException {
        Connection con = null;
        Statement statement = null;
        List<ViewRoomNumber>roomlist=new ArrayList<>();


        ViewRoomNumber admin = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String query = "select room_no from hms.guestlist";
            System.out.println(query);


            statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                admin = new ViewRoomNumber();
                System.out.println(results.getInt(1));


                roomlist.add(admin);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return roomlist;
    }
    public CheckIn roomList(Integer roomNum) throws ClassNotFoundException, SQLException {

        CheckIn roomlist = new CheckIn();
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        Statement stmt1 = con.createStatement();

        ResultSet rs1 = stmt1.executeQuery("SELECT * FROM guestlist where room_no ='" + roomlist.getRoomNum()+ "'");

        while (rs1.next())
            stmt1.close();
        con.close();
        return null;
    }



}





