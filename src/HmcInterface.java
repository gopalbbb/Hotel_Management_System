import java.sql.SQLException;

public interface  HmcInterface {

    public CheckIn checkInGuest(CheckIn checkIn) throws ClassNotFoundException, SQLException;
    public void checkOut();
    public void InHouse();
    public void AdminPortal();  
   // getAllReservationSortedByDate();
}
