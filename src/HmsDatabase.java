import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import election.Gender;
import election.Voter;

public class HmsDatabase implements HmcInterface{

	
		private final static String USERNAME = "root";

	    private final static String PASSWORD = "RootPassword";

	    private final static String URL = "jdbc:mysql://localhost:3306/hms";
	    
	   
	    @Override
	    public CheckIn checkInGuest(CheckIn checkIn) throws ClassNotFoundException, SQLException {
        

     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
     String insertQuery = "INSERT INTO guestlist (first_name, last_name,gender,address,room_type,room_no,payment,check_in,check_out)"
             + "value ( '" + checkIn.getFirstName() + "', '" + checkIn.getLastName() + "','" + checkIn.getGender() + "'," +
             "'" + checkIn.getAddress() + "','" + "'" + checkIn.getRoomtype() + "'" + checkIn.getRoomNo() + "','" + "','"  +
             "','"  + "','" + checkIn.getPayment();
     
     System.out.println(insertQuery);

     Statement statement = con.createStatement();
     int resultValue = statement.executeUpdate(insertQuery);


     if (resultValue == 2) {
         System.out.println("Failed to insert/update data. Check your data and try again.");
     }

     statement.close();
     con.close();

     return checkIn;

 }

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}


	
	@Override
	public void InHouse() throws Exception {
		
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Connection con = DriverManager.getConnection(URL, USERNAME,PASSWORD);
		 String Query = "SELECT*FROM checkInList";
		 System.out.println(Query);
		 
		 Statement statement = con.createStatement();
		 ResultSet results = statement.executeQuery(Query);
		
	     while (results.next()) {

	            System.out.println(results.getInt(1));
	            System.out.println(results.getString(2));
	            System.out.println(results.getString(3));

	        }
		
	}

	@Override
	public void AdminPortal() {
		 
		
	}

	@Override
	public void ViewAllEmployees () throws IOException {
		
		        Connection con = null;
		        Statement statement = null;
//		        Voter voter=null;
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		            // Need to create emplist in database
		           
		            String query = "SELECT * from emplist";

		            //			System.out.println(query);

		            statement = con.createStatement();

		            ResultSet results = statement.executeQuery(query);

		            while (results.next()) {
		               
		            	System.out.println(results.getInt(1));
//		                voter.setFirstName(results.getString(2));
//		                voter.setLastName(results.getString(3));
//		                voter.setGender(Gender.getByValue(results.getString(4)));
//		                LocalDate dob = LocalDate.parse(results.getString(5));
//		                voter.setDateOfBirth(dob);
//		                voter.setUsername(results.getString(6));
//		                voter.setPassword(results.getString(7));
//		                System.out.println(voter);
//		                return voter;

		            }

		        } catch (ClassNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } finally {
		            try {
		                statement.close();
		                con.close();
		            } catch (SQLException e) {
		                // TODO Auto-generated catch block
		                e.printStackTrace();
		            }

		        }

		        return voter;
		    }
		// TODO Auto-generated method stub
		
	}




	

	
}
