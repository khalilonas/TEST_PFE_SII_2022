package sii.maroc;

import java.util.ArrayList;

public class Meal {
	public ArrayList<String> commandToMeal;
	public static int salade = 6;
	public static int pizza = 10;
	public int servedDishes() {
		int somme =0;
		ArrayList<String> list = this.commandToMeal;
		for(String s : list) {
			if(s.contains("Salad")) {
			String[] array = s.split(" "); 
			int number = Integer.parseInt(array[0]);
			somme+= number;
			}
			if(s.contains("Pizza")) {
			String[] array = s.split(" "); 
			int number = Integer.parseInt(array[0]);
			somme+= number;
			}
		}
		return somme;
	}

	public int cookingDuration() {
		int temp =0;
		ArrayList<String> list = this.commandToMeal;
		for(String s : list) {
			if(s.contains("Salad")) {
				String[] array = s.split(" "); 
				int number = Integer.parseInt(array[0]);
				for(int i=0; i < number; i++ ) {
					if(i == 0) {
						temp+=6;
					}
					else {
						temp+=3;
					}
				}
			}
			if(s.contains("Pizza")) {
				String[] array = s.split(" "); 
				int number = Integer.parseInt(array[0]);
				for(int i=0; i < number; i++ ) {
					if(i == 0) {
						temp+=10;
					}
					else {
						temp+=5;
					}
				}
			}
		}
		return temp;
	}

}
