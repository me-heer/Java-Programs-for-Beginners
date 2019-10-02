import java.net.*;
import java.io.*;
import java.util.Scanner;

class NetworkInput {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input URL: ");
        URL google = new URL(input.nextLine());
        URLConnection gc = google.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(gc.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}