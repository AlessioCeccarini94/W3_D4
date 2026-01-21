package alessioceccarini.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "event_id", nullable = false)
	private UUID id;
	@Column(name = "event_name", nullable = false)
	private String name;
	@Column(name = "event_date", nullable = false)
	private LocalDate date;
	@Enumerated(EnumType.STRING)
	@Column(name = "event_type")
	private EventType type;

	public Event() {
	}

	public Event(String name, LocalDate date, EventType type) {
		this.name = name;
		this.date = date;
		this.type = type;
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Event{" +
				"id=" + id +
				", name='" + name + '\'' +
				", date=" + date +
				", type=" + type +
				'}';
	}
}

