package com.pawelpotaczala.BasicDesignPatterns.abstractFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LiverpoolTeam implements Team {

	public List<String> getPlayers() {
		String [] players = {"Loris Karius", "Alberto Moreno", "Trent Alexander-Arnold",
							"Nathaniel Clyne", "Joe Gomez", "Ragnar Klavan", "Emre Can",
							"Coutinho", "Ovie Ejaria", "Marko Grujić", "Jordan Henderson",
							"Kevin Stewart"};
		List<String> listOfPlayers = new ArrayList<String>(Arrays.asList(players));
		return listOfPlayers;
	}

}
