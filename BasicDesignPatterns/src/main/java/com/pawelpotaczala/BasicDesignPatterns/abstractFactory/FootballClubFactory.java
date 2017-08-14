package com.pawelpotaczala.BasicDesignPatterns.abstractFactory;

public interface FootballClubFactory {
	public Stadium createStadium();
	public Manager createManager();
	public Team createTeam();
}
