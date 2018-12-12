package ma.sqli.tests.itevent;

public class Attandee {
	String name;
	String registrationType;
	int roomNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReservationType() {
		return registrationType;
	}
	public void setReservationType(String reservationType) {
		this.registrationType = reservationType;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Attandee(String name, String reservationType, int roomNumber) {
		super();
		this.name = name;
		this.registrationType = reservationType;
		this.roomNumber = roomNumber;
	}
	@Override
	public String toString() {
		return "Attandee [name=" + name + ", registrationType=" + registrationType + ", roomNumber=" + roomNumber + "]";
	}
	
}
