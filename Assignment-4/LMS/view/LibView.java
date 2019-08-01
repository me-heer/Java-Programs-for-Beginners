package view;

import model.*;

class LibView{
	static void mainActivity(){
		System.out.println("Library Management System");
		System.out.println("These are the available books.");
	}
	
	public static void main(String args[]){
		DataInit data = new DataInit();
		data.initializeData();
		mainActivity();
	}
}