package com.designpattern.strategy.main;

public class Driver {

	public static void main(String[] args) {

		// Create two football teams
		Team teamGermany = new TeamGermany();
		Team teamArgentina = new TeamArgentina();

		// Create the strategies
		TeamStrategy attack = new AttackStrategy();
		TeamStrategy defend = new DefendStrategy();

		// In first half, assign the team strategies
		teamGermany.setTeamStrategy(attack);
		teamArgentina.setTeamStrategy(defend);

		// Set team names
		teamGermany.setTeamName("Germany");
		teamArgentina.setTeamName("Argentina");

		// Display the team information
		teamGermany.teamInfo();
		teamArgentina.teamInfo();

		// Play the Game
		teamGermany.playGame();
		teamArgentina.playGame();

		// After half time, both team wants to change their strategy
		System.out.println("\nAfter half time..");
		teamGermany.setTeamStrategy(defend);
		teamArgentina.setTeamStrategy(attack);

		// Display the team information
		teamGermany.teamInfo();
		teamArgentina.teamInfo();

		// Play the Game
		teamGermany.playGame();
		teamArgentina.playGame();
	}

}
