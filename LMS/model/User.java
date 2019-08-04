package model;

public class User{
	String name, branch;
	public int id, balance = 0;
	User(String name, String branch, int id)
	{
		this.name = name;
		this.branch = branch;
		this.id = id;
	}
}
