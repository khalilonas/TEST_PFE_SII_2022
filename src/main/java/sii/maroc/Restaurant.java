package sii.maroc;

import java.util.ArrayList;

public class Restaurant {
	public String ballOfMozzarella;
	public String tomatoes;
	public String oliveOil;
	public String pepper;
	public String flour;
	public String seaSalt;
	public String water;

	public Restaurant(String string, String string2, String string3, String string4) {
		string = this.ballOfMozzarella;
		string2 = this.tomatoes;
		string3 = this.oliveOil;
		string4 = this.pepper;
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String string) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(string);
		Ticket ticket = new Ticket();
		ticket.setList(list);
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		ArrayList<String> listOfMeal = ticket.list;
		Meal meal = new Meal();
		meal.commandToMeal = listOfMeal;
		return meal;
	}


	
}
