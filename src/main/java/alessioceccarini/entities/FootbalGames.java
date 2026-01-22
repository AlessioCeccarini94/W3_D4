package alessioceccarini.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;


@Entity
@DiscriminatorValue("football_game")
public class FootbalGames extends Event {
	private String homeTeam;
	private String awayTeam;
	private String winnerTeam;
	private int homeTeamOfGoals;
	private int awayTeamOfGoals;


	public FootbalGames() {
	}

	public FootbalGames(String name, LocalDate matchDay, Location location, String homeTeam, String awayTeam, String winnerTeam) {
		super();
	}


	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getWinnerTeam() {
		return winnerTeam;
	}

	public void setWinnerTeam(String winnerTeam) {
		this.winnerTeam = winnerTeam;
	}

	public int getHomeTeamOfGoals() {
		return homeTeamOfGoals;
	}

	public void setHomeTeamOfGoals(int homeTeamOfGoals) {
		this.homeTeamOfGoals = homeTeamOfGoals;
	}

	public int getAwayTeamOfGoals() {
		return awayTeamOfGoals;
	}

	public void setAwayTeamOfGoals(int awayTeamOfGoals) {
		this.awayTeamOfGoals = awayTeamOfGoals;
	}

	@Override
	public String toString() {
		return "FootbalGames{" +
				"homeTeam='" + homeTeam + '\'' +
				", awayTeam='" + awayTeam + '\'' +
				", winnerTeam='" + winnerTeam + '\'' +
				", homeTeamOfGoals=" + homeTeamOfGoals +
				", awayTeamOfGoals=" + awayTeamOfGoals +
				'}';
	}
}
