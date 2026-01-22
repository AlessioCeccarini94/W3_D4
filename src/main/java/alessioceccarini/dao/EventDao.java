package alessioceccarini.dao;

import alessioceccarini.entities.Event;
import alessioceccarini.entities.FootbalGames;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;


public class EventDao {
	private final EntityManager em;

	public EventDao(EntityManager em) {
		this.em = em;
	}

	public void saveEvent(Event event) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(event);

		transaction.commit();

		System.out.println(event.getName() + " è stato salvato!");
	}

	public List<FootbalGames> findFootballEvents() {
		return em.createQuery("SELECT e FROM FootbalGames e", FootbalGames.class).getResultList();
	}
}
