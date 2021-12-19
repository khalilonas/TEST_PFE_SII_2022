package sii.maroc;

import java.util.ArrayList;

public class Restaurant implements IRestaurant {
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
	
	public String getBallOfMozzarella() {
		return ballOfMozzarella;
	}

	public void setBallOfMozzarella(String ballOfMozzarella) {
		this.ballOfMozzarella = ballOfMozzarella;
	}

	public String getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(String tomatoes) {
		this.tomatoes = tomatoes;
	}

	public boolean outOfStocksIngredients(Restaurant rest, Meal meal) throws UnavailableDishException{
			String stocksMozarella = rest.getBallOfMozzarella();
			String[] array = stocksMozarella.split(" "); 
			int number = Integer.parseInt(array[0]);
			String tomatoes = rest.getTomatoes();
			String[] array2 = tomatoes.split(" "); 
			int number2 = Integer.parseInt(array[0]);
			if(meal.servedDishes() > number || meal.servedDishes() > number2/2 ) {
				 throw new UnavailableDishException("out of stocks");
			}
            return false;
	}

	


	
}
