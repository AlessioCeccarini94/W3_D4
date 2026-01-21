package alessioceccarini.dao;

import alessioceccarini.NotFoundException;
import alessioceccarini.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

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

	public Event findById(String eventId) {
		Event found = em.find(Event.class, UUID.fromString(eventId));
		if (found == null) throw new NotFoundException(eventId);
		return found;
	}
}
