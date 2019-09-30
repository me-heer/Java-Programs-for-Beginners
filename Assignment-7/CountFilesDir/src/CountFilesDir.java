import java.io.*;

class CountFilesDir{
    public static void main(String[] args)
    {
        File searchFile = new File(".");
        System.out.println("PWD: " + searchFile.getAbsolutePath());
        
        String[] objs = searchFile.list();
        System.out.println("List of files in Present Working Directory: ");
        int dirCount = 0, fileCount = 0;
        for(int i = 0; i < objs.length; i++)
        {
            System.out.println(objs[i]);
            File temp = new File(objs[i]);
            if(temp.isDirectory())
            {
                dirCount++;
            }
            else 
                fileCount++;
        }
        System.out.println("Total Files: " + fileCount);
        System.out.println("Total Directories: " + dirCount);
    }
}