package ma.sqli.tests.itevent;

import java.util.ArrayList;

public class Event {
	Hotel hotel;
	static ArrayList<Attandee> attandees;
	static int countStandardRooms;
	static int countSuites;
	static int countApparts;

	public Event(Hotel hotel) {
		this.hotel = hotel;
		Event.countStandardRooms = 0;
		Event.countSuites = 100;
		Event.countApparts = 200;
		Event.attandees = new ArrayList<>();
	}

	public Boolean register(String registrationType, String name) {
		if (Hotel.standardRooms == 0) {
			Event.countApparts++;
			Hotel.apparts--;
			attandees.add(new Attandee(name, registrationType, Event.countApparts));
			return true;
		}
		for (int i = 0; i < attandees.size(); i++) {
			if (attandees.get(i).getName().equals(name))
				return false;
		}
		switch (registrationType) {
		case "TRINGA":
			Event.countStandardRooms++;
			Hotel.standardRooms--;
			attandees.add(new Attandee(name, registrationType, Event.countStandardRooms));
			break;
		case "STAFF":
			Event.countStandardRooms++;
			Hotel.standardRooms--;
			attandees.add(new Attandee(name, registrationType, Event.countStandardRooms));
			break;
		case "SPEAKER":
			Event.countSuites++;
			Hotel.suites--;
			attandees.add(new Attandee(name, registrationType, Event.countSuites));
			break;
		case "CONF":
			Event.countStandardRooms++;
			Hotel.standardRooms--;
			attandees.add(new Attandee(name, registrationType, Event.countStandardRooms));
			break;
		case "DEEP DIVE":
			attandees.add(new Attandee(name, registrationType, Event.countStandardRooms));
			break;
		default:
			break;
		}

		return true;

	}

	public Object register(String registrationType, String a1, String a2) {
		Event.countStandardRooms++;
		Hotel.standardRooms--;
		attandees.add(new Attandee(a1, registrationType, Event.countStandardRooms));
		Event.countStandardRooms++;
		Hotel.standardRooms--;
		attandees.add(new Attandee(a2, registrationType, Event.countStandardRooms));
		return true;
	}

	public Object register(String registrationType, String a1, String a2, String a3) {
		Event.countApparts++;
		Hotel.apparts--;
		attandees.add(new Attandee(a1, registrationType, Event.countApparts));
		Event.countApparts++;
		Hotel.apparts--;
		attandees.add(new Attandee(a2, registrationType, Event.countApparts));
		Event.countApparts++;
		Hotel.apparts--;
		attandees.add(new Attandee(a3, registrationType, Event.countApparts));
		return true;
	}

}
