package model;

public class DataInit{
    StudentUser[] students = new StudentUser[5];
    StaffUser[] staff = new StaffUser[2];
    HardMedia[] hardBooks = new HardMedia[5];
    public void initializeData(){
        students[0] = new StudentUser("Mihir","CE",1,"23",5);
        staff[0] = new StaffUser("GirishSir","CE",1,15);
        hardBooks[0] = new HardMedia("67","Tejas Rupani",5.5);
        System.out.println("Data Initialized.");
    }
}