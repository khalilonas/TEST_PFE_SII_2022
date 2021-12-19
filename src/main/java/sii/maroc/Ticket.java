package sii.maroc;

import java.util.ArrayList;

public class Ticket {
	
	public  ArrayList<String> list;

	public ArrayList<String> getList() {
		return list;
	}
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public Ticket and(String string) {
		ArrayList<String> listAnd = this.getList();
		listAnd.add(string);
		this.setList(listAnd);
		return this;
	}

}
