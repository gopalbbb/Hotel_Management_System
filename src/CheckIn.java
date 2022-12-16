
import java.time.LocalDateTime;
import java.util.Objects;

public class CheckIn {
	
	private int GuestId;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String address;
	private RoomType roomtype;
	private int roomNo;
	private int payment;
	private LocalDateTime checkInDate;
	private LocalDateTime checkOutDate;
	
    /**
	 * @param guestId
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param address
	 * @param roomtype
	 * @param roomNo
	 * @param payment
	 * @param checkInDate
	 * @param checkOutDate
	 */
	public CheckIn(int guestId, String firstName, String lastName, Gender gender, String address, RoomType roomtype,
			int roomNo, int payment, LocalDateTime checkInDate, LocalDateTime checkOutDate) {
		super();
		GuestId = guestId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.address = address;
		this.roomtype = roomtype;
		this.roomNo = roomNo;
		this.payment = payment;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		
	}
		/**
		 * 
		 */
		public CheckIn() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
	public int getGuestId() {
		return GuestId;
	}

	public void setGuestId(int guestId) {
		GuestId = guestId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public RoomType getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(RoomType roomtype) {
		this.roomtype = roomtype;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public LocalDateTime getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDateTime getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDateTime checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "CheckIn [GuestId=" + GuestId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", address=" + address + ", roomtype=" + roomtype + ", roomNo=" + roomNo + ", payment="
				+ payment + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(GuestId, address, checkInDate, checkOutDate, firstName, gender, lastName, payment, roomNo,
				roomtype);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckIn other = (CheckIn) obj;
		return GuestId == other.GuestId && Objects.equals(address, other.address)
				&& Objects.equals(checkInDate, other.checkInDate) && Objects.equals(checkOutDate, other.checkOutDate)
				&& Objects.equals(firstName, other.firstName) && gender == other.gender
				&& Objects.equals(lastName, other.lastName) && payment == other.payment && roomNo == other.roomNo
				&& roomtype == other.roomtype;
	}
	
	
	
}
	
	