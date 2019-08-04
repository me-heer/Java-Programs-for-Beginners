package model;

public class DataInit{
    public static StudentUser[] students = new StudentUser[5];
    public static StaffUser[] staff = new StaffUser[2];
    public static HardMedia[] hardBooks = new HardMedia[5];
    static public void initializeData(){
        students[0] = new StudentUser("Mihir","CE",2,"23",5);
        staff[0] = new StaffUser("GirishSir","CE",1,15);
        hardBooks[0] = new HardMedia("67","Tejas Rupani",5.5);
        System.out.println("Data Initialized.");
    }
}