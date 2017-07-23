package com.designpattern.strategy.main;

public abstract class Team {
	
	private String teamName;
	private TeamStrategy teamStrategy;
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the teamStrategy
	 */
	public TeamStrategy getTeamStrategy() {
		return teamStrategy;
	}
	/**
	 * @param teamStrategy the teamStrategy to set
	 */
	public void setTeamStrategy(TeamStrategy teamStrategy) {
		this.teamStrategy = teamStrategy;
	}
	
	public abstract void teamInfo();
	
	public void playGame(){
		teamStrategy.play(teamName);
	}

}
