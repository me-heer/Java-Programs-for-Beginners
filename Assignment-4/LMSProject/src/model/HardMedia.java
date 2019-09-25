<<<<<<< HEAD
package model;

import java.util.Arrays;

public class HardMedia extends Media{
    public double weight;
    public int quantity;
    public int currentUsers[];
    HardMedia(String isbn, String title, String author,double weight, int quantity){
        super(isbn,title,author);
        this.weight = weight;
        this.quantity = quantity;
        currentUsers = new int[quantity];
        Arrays.fill(currentUsers, -1);
    }
=======
package model;

import java.util.Arrays;

public class HardMedia extends Media{
    public double weight;
    public int quantity;
    public int currentUsers[];
    HardMedia(String isbn, String title, String author,double weight, int quantity){
        super(isbn,title,author);
        this.weight = weight;
        this.quantity = quantity;
        currentUsers = new int[quantity];
        Arrays.fill(currentUsers, -1);
    }
>>>>>>> b6f7356a6ffff5268d36a793b5fa2676e821cd2a
}