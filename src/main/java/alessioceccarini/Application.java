package alessioceccarini;

import alessioceccarini.dao.EventDao;
import alessioceccarini.dao.LocationDao;
import alessioceccarini.dao.PartecipationDao;
import alessioceccarini.dao.PersonDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventmngmtpu");

	public static void main(String[] args) {
		EntityManager em = emf.createEntityManager();
		PersonDao pd = new PersonDao(em);
		EventDao ed = new EventDao(em);
		LocationDao ld = new LocationDao(em);
		PartecipationDao partd = new PartecipationDao(em);


		emf.close();
		em.close();
		System.out.println("Hello World!");
	}
}
