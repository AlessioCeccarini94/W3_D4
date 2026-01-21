package alessioceccarini.dao;

import alessioceccarini.NotFoundException;
import alessioceccarini.entities.Event;
import alessioceccarini.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class LocationDao {
	private final EntityManager em;

	public LocationDao(EntityManager em) {
		this.em = em;
	}

	public void saveLocation(Location location) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(location);

		transaction.commit();

		System.out.println(location.getName() + " di " + location.getCity() + " è stato salvato!");
	}

	public Event findById(String locationId) {
		Event found = em.find(Event.class, UUID.fromString(locationId));
		if (found == null) throw new NotFoundException(locationId);
		return found;
	}
}
