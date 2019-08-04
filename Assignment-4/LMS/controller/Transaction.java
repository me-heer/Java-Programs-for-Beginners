package controller;

import java.util.Scanner;
import model.DataInit;

public class Transaction{

    public static void displayUserDetails(){
        String message = "";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter User ID: ");
        int id = userInput.nextInt();
        boolean userFound = false;
        int i;
        for(i = 0; i < DataInit.students.length; i++)
        {
            if(DataInit.students[i] != null)
            if(id == DataInit.students[i].id)
            {
                userFound = true;
                message += "User Found.";
                break;
            }
        }
        if(i == DataInit.students.length)
            message += "Invalid user ID. Please try again.";
        System.out.println(message);
        if(userFound)
        {
            System.out.println("ID: " + DataInit.students[i].id);
            System.out.println("Name: " + DataInit.students[i].name);
            System.out.println("Branch: " + DataInit.students[i].branch);
            System.out.println("Enrollment No.: " + DataInit.students[i].enrollNo);
            System.out.println("Semester: " + DataInit.students[i].semester);
            System.out.println("Balance: " + DataInit.students[i].balance);

        }
    }

    public static void createAccount(){
        //name branch id enroll semester
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = userInput.nextLine();
        System.out.println("Enter your branch: ");
        String branch = userInput.nextLine();
        System.out.println("Enter your id: ");
        int id = Integer.parseInt(userInput.nextLine());
        System.out.println("Enter your enrollment no: ");
        String enrollNo = userInput.nextLine();
        System.out.println("Enter your semester: ");
        int semester = Integer.parseInt(userInput.nextLine());
        DataInit.createAccount(name, branch, id, enrollNo, semester);
    }

    public static void issueBook(){
        System.out.println("Enter userID: ");
        Scanner userInput = new Scanner(System.in);
        int userID = userInput.nextInt();
        int i,j;
        boolean userFound = false;
        String message = "";
        for(i = 0; i < DataInit.students.length; i++)
        {
            if(DataInit.students[i] != null)
            if(DataInit.students[i].id == userID)
            {
                userFound = true;
                break;
            }
        }
        if (i == DataInit.students.length)
        {
            message += "User not found, please try again.\n";
        }
        else if(userFound)
        {
            message += "User found.\n";
        }

        boolean bookFound = false;
        System.out.println("Enter bookID: ");
        int bookID = userInput.nextInt();
        for(j = 0; j < DataInit.hardBooks.length; j++)
        {
            if(DataInit.hardBooks[j] != null)
            if( Integer.parseInt(DataInit.hardBooks[j].isbn) == bookID)
            {
                bookFound = true;
                break;
            }
        }
        if (j == DataInit.hardBooks.length)
        {
            message += "Book not found, please try again.\n";
        }
        else if(bookFound)
        {
            message += "Book found.\n";
        }
        if(bookFound && userFound)
        {
            if(DataInit.students[i].balance > 0)
            {
                if(DataInit.hardBooks[j].quantity > 0)
                {
                    DataInit.students[i].balance--;
                    DataInit.hardBooks[j].quantity--;
                    message += "Successfully issued the book.\n";
                }
                else
                    message += "Sorry, the book is not available at the time.\n";
            }
            else
                message += "Insufficient User Balance.\n";
            
            System.out.println("User balance: " + DataInit.students[i].balance);
            System.out.println("Book quantity: " + DataInit.hardBooks[j].quantity);
        }
        
        System.out.println(message);
    }


    public static void returnBook(){
        System.out.println("Enter userID: ");
        Scanner userInput = new Scanner(System.in);
        int userID = userInput.nextInt();
        int i,j;
        boolean userFound = false;
        String message = "";
        for(i = 0; i < DataInit.students.length; i++)
        {
            if(DataInit.students[i] != null)
            if(DataInit.students[i].id == userID)
            {
                userFound = true;
                break;
            }
        }
        if (i == DataInit.students.length)
        {
            message += "User not found, please try again.\n";
        }
        else if(userFound)
        {
            message += "User found. \n";
        }

        boolean bookFound = false;
        System.out.println("Enter bookID: ");
        int bookID = userInput.nextInt();
        for(j = 0; j < DataInit.hardBooks.length; j++)
        {
            if(DataInit.hardBooks[j] != null)
            if( Integer.parseInt(DataInit.hardBooks[j].isbn) == bookID)
            {
                bookFound = true;
                break;
            }
        }
        if (j == DataInit.hardBooks.length)
        {
            message += "Book not found, please try again.\n";
        }
        else if(bookFound)
        {
            message += "Book found.\n";
        }
        if(bookFound && userFound)
        {
            DataInit.students[i].balance++;
            DataInit.hardBooks[j].quantity++;
            message += "Successfully returned the book.\n";
            System.out.println("User balance: " + DataInit.students[i].balance);
            System.out.println("Book quantity: " + DataInit.hardBooks[j].quantity);
        }
        
        System.out.println(message);
    }

    public static void searchBook(){
        Scanner userInput = new Scanner(System.in);
        int j;
        String message = "";
        boolean bookFound = false;
        System.out.println("Enter bookID: ");
        int bookID = userInput.nextInt();
        for(j = 0; j < DataInit.hardBooks.length; j++)
        {
            if(DataInit.hardBooks[j] != null)
            if( Integer.parseInt(DataInit.hardBooks[j].isbn) == bookID)
            {
                bookFound = true;
                break;
            }
        }
        if (j == DataInit.hardBooks.length)
        {
            message += "Book not found, please try again.\n";
        }
        else if(bookFound)
        {
            System.out.println("Book details: ");
            System.out.println("Title: " + DataInit.hardBooks[j].title);
            System.out.println("ISBN: " + DataInit.hardBooks[j].isbn);
            System.out.println("Author: " + DataInit.hardBooks[j].author);
            System.out.println("Available Quantity of Paperback: " + DataInit.hardBooks[j].quantity);
            System.out.println("Weight: " + DataInit.hardBooks[j].weight);
        }
        System.out.println(message);
    }

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