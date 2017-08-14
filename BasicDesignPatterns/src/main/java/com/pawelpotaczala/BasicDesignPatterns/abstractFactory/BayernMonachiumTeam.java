package com.pawelpotaczala.BasicDesignPatterns.abstractFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BayernMonachiumTeam implements Team {

	public List<String> getPlayers() {
		String [] players = {"Manuel Neuer", "David Alaba", "Jérôme Boateng",
				"Philipp Lahm", "Felix Götze", "Kingsley Coman", "Douglas Costa",
				"Arturo Vidal", "Robert Lewandowski", "Thomas Müller", "Arjen Robben"};
		List<String> listOfPlayers = new ArrayList<String>(Arrays.asList(players));
		return listOfPlayers;
	}

}
