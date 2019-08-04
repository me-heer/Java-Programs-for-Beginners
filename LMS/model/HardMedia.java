package model;

public class HardMedia extends Media{
    double weight;
    HardMedia(String isbn, String author,double weight){
        super(isbn,author);
        this.weight = weight;
    }
}