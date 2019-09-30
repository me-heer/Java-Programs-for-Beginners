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
            System.out.println("Enter phone number to search for a name:");
            Scanner input = new Scanner(System.in);
            String searchString = input.nextLine();
            System.out.println(phoneBook.getProperty(searchString));
        }
    }
}