package controller;

import java.util.Scanner;
import model.DataInit;

public class Transaction{
    public static void checkBalance()
    {
        System.out.println("Enter userID: ");
        Scanner userInput = new Scanner(System.in);
        int userID = userInput.nextInt();
        int i;
        boolean found = false;
        for(i = 0; i < DataInit.students.length; i++)
        {
            if(DataInit.students[i] != null)
            if(DataInit.students[i].id == userID)
            {
                found = true;
                break;
            }
        }
        if (i == DataInit.students.length)
        {
            System.out.println("User not found, please try again.");
        }
        else if(found)
        {
            System.out.println("User found.");
            System.out.println("Balance: " + DataInit.students[i].balance);
        }
            
    }
}