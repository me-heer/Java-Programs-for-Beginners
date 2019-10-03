
import java.util.ArrayList;
import java.util.Scanner;

class ArrayListMover{
    static void addItem(ArrayList al,Object item)
    {
        al.add(item);
    }

    static void displayList(ArrayList al)
    {
        System.out.println(al);
    }
    static void transferItem(ArrayList al1, ArrayList al2, Object transferItem,int indexOfTransferItem)
    {
        al1.remove(indexOfTransferItem);
        al2.add(transferItem);
    }
    public static void main(String[] args)
    {
        ArrayList al1 = new ArrayList();
        ArrayList al2 = new ArrayList();
        while(true)
        {
            System.out.println("1. Add items to List-1");
            System.out.println("2. Transfer items from List-1 to List-2");
            System.out.println("3. Display both the lists");
            System.out.println("4. Exit");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the item you want to add: "); 
                    input.nextLine();
                    String item = input.nextLine();
                    addItem(al1, item);
                    break;
                case 2:
                    System.out.print("Enter the item you want to transfer: ");
                    input.nextLine();
                    String transferItem = input.nextLine();
                    int indexOfTransferItem = al1.indexOf(transferItem);
                    if(indexOfTransferItem != -1)
                    {
                        transferItem(al1, al2, transferItem, indexOfTransferItem);
                    }
                    else
                    {
                        System.out.println("Sorry, couldn't find the specified item.");
                    }
                case 3:
                    System.out.println("Data in ArrayLists:");
                    System.out.println("List - 1:");
                    displayList(al1);
                    System.out.println("List - 2:");
                    displayList(al2);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}