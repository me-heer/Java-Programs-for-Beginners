import java.io.*;
import java.net.*;

class NetworkInput{
    public static void main(String[] args){
        try
        {
            Socket ghomepage = new Socket("google.com",80);
            InputStream is = ghomepage.getInputStream();
            OutputStream os = ghomepage.getOutputStream();
            os.write("GET / HTTP/1.1\n\r\n\r".getBytes());
            BufferedReader in = new BufferedReader(new InputStreamReader(ghomepage.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}