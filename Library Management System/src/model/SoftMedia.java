<<<<<<< HEAD
package model;

public class SoftMedia extends Media{
    double fileSize;
    String fileFormat;
    public int quantity;
    public int currentUsers[];
    SoftMedia(String isbn, String title, String author,double fileSize, int quantity,String fileFormat){
        super(isbn,title,author);
        this.quantity = quantity;
        this.fileFormat = fileFormat;
        currentUsers = new int[quantity];
        Arrays.fill(currentUsers, -1);
    }
=======
package model;

public class SoftMedia{
    double fileSize;
    String fileFormat;
>>>>>>> b6f7356a6ffff5268d36a793b5fa2676e821cd2a
}