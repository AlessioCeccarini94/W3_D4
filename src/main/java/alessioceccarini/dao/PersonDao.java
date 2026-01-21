package alessioceccarini.dao;

import alessioceccarini.NotFoundException;
import alessioceccarini.entities.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.UUID;

public class PersonDao {
	private final EntityManager em;

	public PersonDao(EntityManager em) {
		this.em = em;
	}

	public void savePerson(Person person) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		em.persist(person);

		transaction.commit();

		System.out.println(person.getFirstName() + " " + person.getLastName() + " è stato salvato!");
	}

	public Person findById(String personId) {
		Person found = em.find(Person.class, UUID.fromString(personId));
		if (found == null) throw new NotFoundException(personId);
		return found;
	}
}
