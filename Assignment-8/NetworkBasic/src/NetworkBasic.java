import java.net.*;
import java.util.Scanner;
class NetworkBasic{
    public static void main(String[] args) throws UnknownHostException
    {
        System.out.println("Enter domain name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        InetAddress address = InetAddress.getByName(name);
        System.out.println(address);  
    }
}