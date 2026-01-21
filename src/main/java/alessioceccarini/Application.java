package alessioceccarini;

import alessioceccarini.dao.EventDao;
import alessioceccarini.dao.LocationDao;
import alessioceccarini.dao.PartecipationDao;
import alessioceccarini.dao.PersonDao;
import alessioceccarini.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventmngmtpu");

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		PersonDao pd = new PersonDao(em);
		EventDao ed = new EventDao(em);
		LocationDao ld = new LocationDao(em);
		PartecipationDao partd = new PartecipationDao(em);

		Person person1 = new Person("Mario", "Rossi", "mario@mm.it", LocalDate.of(1990, 7, 9), Gender.MALE);
		Person person2 = new Person("Marta", "Bianchi", "marta@mm.it", LocalDate.of(1991, 6, 3), Gender.FEMALE);
		Person person3 = new Person("Fausto", "Leali", "fausto@mm.it", LocalDate.of(1968, 2, 29), Gender.MALE);
		Person person4 = new Person("Maria", "Rossi", "maria@mm.it", LocalDate.of(1988, 5, 9), Gender.FEMALE);
		Person person5 = new Person("Alberto", "Angela", "alberto@mm.it", LocalDate.of(1970, 7, 9), Gender.MALE);
//		pd.savePerson(person1);
//		pd.savePerson(person2);
//		pd.savePerson(person3);
//		pd.savePerson(person4);
//		pd.savePerson(person5);

//		Event event = new Event("beach party", LocalDate.of(2026, 7, 10), EventType.PUBBLIC);
		Event event1 = new Event("graduate party", LocalDate.of(2026, 9, 20), EventType.PRIVATE);
		Event event2 = new Event("sagra della castagna", LocalDate.of(2026, 11, 10), EventType.PUBBLIC);
//		ed.saveEvent(event);
//		ed.saveEvent(event1);
//		ed.saveEvent(event2);

		Location location = new Location("villa lago dei cigni", "Roma");
		Location location1 = new Location("Via del Corso", "Roma");
		Location location2 = new Location("Da Peppe Bar", "Aosta");

//		ld.saveLocation(location);
//		ld.saveLocation(location1);
//		ld.saveLocation(location2);
		try {
			Person person = pd.findById("fff90edd-2daf-43a3-8e35-ce5c013a4bfe");
			Event event = ed.findById("b2ce9ee7-9849-40cc-af88-c1d472256baa");
			Partecipation partecipation = new Partecipation(person, event, PartecipationState.CONFERMATO);
			partd.savePartecipation(partecipation);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		System.out.println("Hello World!");
	}
}
