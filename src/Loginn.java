import java.io.IOException;
import java.sql.*;

public class Loginn {
    private final static String USERNAME = "root";

    private final static String PASSWORD = "RootPassword";

    private final static String URL = "jdbc:mysql://localhost:3306/hms";
    public Adminportal  searchByUserNameandPassword(String username, String password) throws IOException {
        Connection con = null;
        Statement statement = null;
        Adminportal admin=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            String query = "select * from hms.employee where username ='" + username + "' and password='" + password + "'";
           // System.out.println(query);


            statement = con.createStatement();
            ResultSet results = statement.executeQuery(query);

            while (results.next()) {
                admin = new Adminportal();
                admin.setEmp_id(results.getInt(1));
                admin.setName(results.getString(2));
                admin.setAddress(results.getString(3));
                admin.setPost(results.getString(4));
                admin.setContact(results.getString(5));
                admin.setUsername(results.getString(6));
                admin.setPassword(results.getString(7));
                /*System.out.println(admin.getContact());
                System.out.println(admin.getName());
                System.out.println("hello");*/
                System.out.println(results.getString(2));
                System.out.println(results.getString(4));

               // System.out.println(admin);
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
        return admin;
    }


}
