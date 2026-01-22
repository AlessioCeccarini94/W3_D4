package alessioceccarini;

import alessioceccarini.dao.EventDao;
import alessioceccarini.dao.LocationDao;
import alessioceccarini.dao.PartecipationDao;
import alessioceccarini.dao.PersonDao;
import alessioceccarini.entities.EventType;
import alessioceccarini.entities.FootbalGames;
import alessioceccarini.entities.Location;
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


		Location olimpico = new Location("Stadio Olimpico", "Rome");

		ld.saveLocation(olimpico);

		FootbalGames fg = new FootbalGames(
				"Roma-Stoccarda",
				LocalDate.of(2026, 01, 22),
				EventType.PUBBLIC,
				olimpico, "Roma", "Stoccarda"
		);
		fg.setHomeTeamOfGoals(3);
		fg.setAwayTeamGoals(0);
		fg.setWinnerTeam("Roma");

		ed.saveEvent(fg);

		emf.close();
		em.close();
		System.out.println("Hello World!");
	}
}
