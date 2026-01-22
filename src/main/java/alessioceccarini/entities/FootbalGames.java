package alessioceccarini.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;


@Entity
public class FootbalGames extends Event {
	private String homeTeam;
	private String awayTeam;
	private String winnerTeam;
	private Integer homeTeamGoals;
	private Integer awayTeamGoals;


	public FootbalGames() {
	}

	public FootbalGames(String name, LocalDate matchDay, EventType type, Location location, String homeTeam, String awayTeam) {
		super(name, matchDay, type, location);
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeTeamGoals = null;
		this.awayTeamGoals = null;
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

	public Integer getHomeTeamOfGoals() {
		return homeTeamGoals;
	}

	public void setHomeTeamOfGoals(int homeTeamGoals) {
		this.homeTeamGoals = homeTeamGoals;
	}

	public Integer getAwayTeamGoals() {
		return awayTeamGoals;
	}

	public void setAwayTeamGoals(int awayTeamGoals) {
		this.awayTeamGoals = awayTeamGoals;
	}

	@Override
	public String toString() {
		return "FootbalGames{" +
				"homeTeam='" + homeTeam + '\'' +
				", awayTeam='" + awayTeam + '\'' +
				", winnerTeam='" + winnerTeam + '\'' +
				", homeTeamOfGoals=" + homeTeamGoals +
				", awayTeamOfGoals=" + awayTeamGoals +
				'}' + super.toString();
	}
}

