import java.net.*;
class NetworkBasic{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress address = InetAddress.getByName("www.google.com");
        System.out.println(address);  
    }
}