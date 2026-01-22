package alessioceccarini.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "location")
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "location_id", nullable = false)
	private UUID id;
	@Column(name = "location_name", nullable = false)
	private String name;
	@Column(name = "city", nullable = false)
	private String city;

	@OneToMany(mappedBy = "location")
	private List<Event> events = new ArrayList<>();

	public Location() {

	}

	public Location(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public void addEvent(Event event) {
		events.add(event);
		event.setLocation(this);
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Location{" +
				"id=" + id +
				", name='" + name + '\'' +
				", city='" + city + '\'' +
				'}';
	}
}
