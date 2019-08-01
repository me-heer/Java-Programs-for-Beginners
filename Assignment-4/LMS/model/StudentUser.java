package model;

public class StudentUser extends User{
    String enrollNo;
    int semester;
    StudentUser(String name, String branch, int id, String enrollNo, int semester){
        super(name, branch, id);
        this.enrollNo = enrollNo;
        this.semester = semester;
    }
}