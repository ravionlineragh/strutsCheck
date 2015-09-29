package com.strutcheck;

public class TestingAction {

	public static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Inside the main method");
	}
	
	public String execute()
	{
		return "success";
	}

	public void setName(String nameInput)
	{
		this.name=nameInput;
	}
	
	public String getName()
	{
		return name;
	}
}
