package sii.maroc;

import java.util.ArrayList;

public class Meal implements IMeal {
	public ArrayList<String> commandToMeal;
	public static int salade = 6;
	public static int pizza = 10;
	public int servedDishes() {
		int somme =0;
		ArrayList<String> list = this.commandToMeal;
		for(String s : list) {
			String[] array = s.split(" "); 
			int number = Integer.parseInt(array[0]);
			somme+= number;
		}
		return somme;
	}

	public int cookingDuration() {
		int temp =0;
		ArrayList<String> list = this.commandToMeal;
		for(String s : list) {
			if(s.contains("Salad")) {
				temp += calculDuration(salade,s);
			}
			if(s.contains("Pizza")) {
				temp+= calculDuration(pizza,s);
			}
		}
		return temp;
	}
	public int  calculDuration(int category,String s) {
		int temp =0;
		String[] array = s.split(" "); 
		int number = Integer.parseInt(array[0]);
		for(int i=0; i < number; i++ ) {
			if(i == 0) {
				temp+=category;
			}
			else {
				temp+=category/2;
			}
		}
		return temp;
	}

}
