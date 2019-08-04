package model;

public class StudentUser extends User{
    public String enrollNo;
    public int semester;
    StudentUser(String name, String branch, int id, String enrollNo, int semester, int balance){
        super(name, branch, id);
        this.enrollNo = enrollNo;
        this.semester = semester;
        this.balance = balance;
    }
}