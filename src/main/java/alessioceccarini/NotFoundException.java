package alessioceccarini;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String id) {
		super("Could not find person with id: " + id);
	}
}
