import java.io.*;
import java.util.Arrays;

class CopyFile{
    public static void main(String[] args)
    {
            FileInputStream inFile;
            FileOutputStream outFile;
        try{
            inFile  = new FileInputStream("testFile");
            outFile = new FileOutputStream("copyFile");
            byte[] dataChunk = new byte[1];
            while(inFile.read(dataChunk) != -1)
            {
                outFile.write(dataChunk);
            }
            inFile.close();
            outFile.close();
        }catch(IOException io)
        {
            io.printStackTrace();
        }
        
    }
}