package com.pawelpotaczala.BasicDesignPatterns.abstractFactory;

public class LiverpoolFactory implements FootballClubFactory {
	
	public LiverpoolFactory() {
	}

	public Stadium createStadium() {
		return new LiverpoolStadium();
	}

	public Manager createManager() {
		return new LiverpoolManager();
	}

	public Team createTeam() {
		return new LiverpoolTeam();
	}

}
