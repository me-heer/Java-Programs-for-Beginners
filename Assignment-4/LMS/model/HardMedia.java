package model;

public class HardMedia extends Media{
    public double weight;
    public int quantity;
    HardMedia(String isbn, String title, String author,double weight, int quantity){
        super(isbn,title,author);
        this.weight = weight;
        this.quantity = quantity;
    }
}