package sii.maroc;

public interface IRestaurant {
	Ticket order(String string);
	Meal retrieve(Ticket ticket);
	boolean outOfStocksIngredients(Restaurant rest, Meal meal) throws Exception;
}
