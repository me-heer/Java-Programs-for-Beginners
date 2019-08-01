package model;

public class Media{
    String isbn, author, publication, version, title, category;
    double bookPrice;
    int pages;
    Media(String isbn, String author){
        this.isbn = isbn;
        this.author = author;
    }
}