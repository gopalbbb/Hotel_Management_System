import java.io.IOException;
import java.sql.SQLException;

public interface  HmcInterface {

    public CheckIn checkInGuest(CheckIn checkIn) throws ClassNotFoundException, SQLException;
    public void checkOut();
    public void InHouse() throws Exception ;
    public void AdminPortal();  
    public void ViewAllEmployees() throws IOException;  
    
   // getAllReservationSortedByDate();
}
