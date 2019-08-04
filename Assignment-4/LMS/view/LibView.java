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
			System.out.println("2. Issue Book");
			System.out.println("3. Return Book");
			System.out.println("4. Search books");
			System.out.println("5. Create User Account");
			System.out.println("6. Display User Details");
			System.out.println("7. Exit");
			int choice = input.nextInt();
			switch(choice)
			{
				case 1 : Transaction.checkBalance(); break;
				case 2 : Transaction.issueBook(); break;
				case 3 : Transaction.returnBook(); break;
				case 4 : Transaction.searchBook(); break;
				case 5 : Transaction.createAccount(); break;
				case 6 : Transaction.displayUserDetails();  break;
				case 7 : input.close();
				System.exit(0); break;
				default : System.out.println("Invalid Choice."); break;
			}
		}
		
	}

	public static void main(String args[]){
		DataInit.initializeData();
		mainActivity();
	}
}