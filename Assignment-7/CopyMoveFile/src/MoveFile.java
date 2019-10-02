import java.io.*;
import java.util.Scanner;


class MoveFile{
    public static void main(String[] args)
    {
            File inputFile, outputFile;
            FileInputStream inFile;
            FileOutputStream outFile;
            Scanner choice = new Scanner(System.in);
            System.out.println("1. Copy File");
            System.out.println("2. Move File");
            int ch = choice.nextInt();
            System.out.println("Enter file name: ");
            choice.nextLine();
            String inputFileName = choice.nextLine();
        try{
            inputFile = new File(inputFileName);
            inFile  = new FileInputStream(inputFile);
            outputFile = new File("NewFile");
            outFile = new FileOutputStream(outputFile);
            byte[] dataChunk = new byte[1];
            while(inFile.read(dataChunk) != -1)
            {
                outFile.write(dataChunk);
            }
            if(ch == 2)
            {
                inputFile.delete();
                inFile.close();
            }
            inFile.close();
            outFile.close();
            System.out.println("Operation Successful.");
        }catch(IOException io)
        {
            io.printStackTrace();
        }
        
    }
}