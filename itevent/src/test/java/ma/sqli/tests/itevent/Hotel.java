package ma.sqli.tests.itevent;

public class Hotel {
	static int standardRooms;
	static int suites;
	static int apparts;

	public Hotel(int standardRooms, int suites, int apparts) {
		Hotel.standardRooms = standardRooms;
		Hotel.suites = suites;
		Hotel.apparts = apparts;
	}

	public String checkAvailibility() {
		return "Standard rooms: " + standardRooms + "|Suites: " + suites + "|Aparts: " + apparts;
	}

	public String getRoomFor(String who) {
		for (int i = 0; i < Event.attandees.size(); i++) {
			Attandee tmp = Event.attandees.get(i);
			if (tmp.getName().equals(who)) {
				switch (Event.attandees.get(i).getReservationType()) {
				case "TRINGA":
					if (tmp.getRoomNumber() < 200)
						return "Standard room N°" + tmp.getRoomNumber();
					else
						return "Apart N°" + tmp.getRoomNumber();
				case "STAFF":
					return "Standard room N°" + tmp.getRoomNumber();
				case "SPEAKER":
					return "Suite N°" + tmp.getRoomNumber();
				case "CONF":
					return "Standard room N°" + tmp.getRoomNumber();
				case "DEEP DIVE":
					return "Standard room N°" + tmp.getRoomNumber();
				default:
					break;
				}
			}
		}
		return who;
	}

}
