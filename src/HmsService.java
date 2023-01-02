import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * collected method from Hms database and pass for main Class
 *
 *
 *
 */
public class HmsService {
public  HmsService(){};



public CheckIn checkInGuest(CheckIn checkIn) throws SQLException, ClassNotFoundException {
HmcInterface data =new Hmsdatabase();
data.checkInGuest(checkIn);
    return checkIn;
}

public CheckIn searchByRoomAndName(String first_name,int room_no) throws SQLException, ClassNotFoundException, IOException {
    HmcInterface data=new Hmsdatabase();
    return data.searchByRoomNumberandGuestName(first_name,room_no);
}
public void inHouseGuestList() throws SQLException {

    HmcInterface data=new Hmsdatabase();
    data.inHouse();
}
public void viewAll() throws IOException {
    HmcInterface data=new Hmsdatabase();
  data.viewAllGuestRecord();
}
public CheckIn checkOut(int room_no, LocalDate check_out) throws IOException, SQLException, ClassNotFoundException {
    HmcInterface data=new Hmsdatabase();
    return data.CHECKOUT(room_no,check_out);


}
Adminportal logIn (String username, String password) throws IOException {
   Loginn log =new Loginn();
   Adminportal admin=null;
 admin= log.searchByUserNameandPassword(username,password);
 return admin;

}
public CheckIn checkRoom(Integer roomNumber) throws SQLException, ClassNotFoundException {
    ViewRoomNumber viewRoomNumber=new ViewRoomNumber();
    CheckIn roomexit=null;
    roomexit=viewRoomNumber.roomList(roomNumber);
    return roomexit;


}}
