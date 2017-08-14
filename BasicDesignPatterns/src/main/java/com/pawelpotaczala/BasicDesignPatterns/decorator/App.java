package com.pawelpotaczala.BasicDesignPatterns.decorator;

public class App {
		
	public static void main(String[] args) {
		
		Footballer footballer = new InjuryDecorator(new SimpleFootballer(40, 30, 10));		
		System.out.println("Is footballer able to play? " + footballer.canPlay());		
		System.out.println();
		
		Footballer footballer1 = new RedCardDecorator(new SimpleFootballer(40, 30, 10));	
		System.out.println("Is footballer able to play? " + footballer1.canPlay());
		System.out.println();
		
		Footballer footballer2 = new StrikerDecorator(new SimpleFootballer(40, 30, 10));	
		System.out.println("Is footballer able to play? " + footballer2.canPlay());
		
	}

}
