
import java.time.LocalDateTime;
import java.util.Objects;

public class CheckIn {

	private String firstName;
	private String lastName;
	private String address;
	private String roomType;
	private LocalDateTime checkInDate;

	public CheckIn() {
	}

	public CheckIn(String firstName, String lastName, String address, String roomType, LocalDateTime checkInDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.roomType = roomType;
		this.checkInDate = checkInDate;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public LocalDateTime getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDateTime checkInDate) {
		this.checkInDate = checkInDate;
	}

	@Override
	public String toString() {
		return "CheckIn{" + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", address="
				+ address + ", roomType=" + roomType + ", checkInDate='" + checkInDate + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		CheckIn check = (CheckIn) o;
		return Objects.equals(getFirstName(), check.getFirstName())
				&& Objects.equals(getLastName(), check.getLastName()) && getAddress() == check.getAddress()
				&& Objects.equals(getRoomType(), check.getRoomType())
				&& Objects.equals(getCheckInDate(), check.getCheckInDate());
	}
}
