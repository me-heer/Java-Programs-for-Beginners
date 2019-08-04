package view;

import model.*;
import java.util.Scanner;
import controller.*;

class LibView{
	static void mainActivity(){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("Library Management System");
			System.out.println("1. Check Balance");
			System.out.println("2. Exit");
			int choice = input.nextInt();
			switch(choice)
			{
				case 1 : Transaction.checkBalance(); break;
				case 2 : System.exit(0); break;
				default : System.out.println("Invalid Choice."); break;
			}
		}
	}

	public static void main(String args[]){
		DataInit.initializeData();
		mainActivity();
	}
}