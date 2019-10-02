import java.util.*;

class PhoneBook{
    public static void main(String[] args){
        Properties phoneBook = new Properties();
        phoneBook.setProperty("Mihir","1111");
        phoneBook.setProperty("Rahul","2222");
        phoneBook.setProperty("Srujan","3333");
        phoneBook.setProperty("Harsh","4444");
        while(true)
        {
            System.out.println("Phone Book: ");
<<<<<<< HEAD
            System.out.println("Enter name to search for a phone number:");
=======
            System.out.println("Enter phone number to search for a name:");
>>>>>>> 4ff9355f2f1da76ca3de5fe4ef61cac94e2602c3
            Scanner input = new Scanner(System.in);
            String searchString = input.nextLine();
            System.out.println(phoneBook.getProperty(searchString));
        }
    }
}