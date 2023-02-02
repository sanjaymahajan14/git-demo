package com.parth;

public class App 
{
	
	public void addData(String data) {
		System.out.println("data ="+data);
		if(data.equals(Constants.Data_Type)) {
			System.out.println("Welcome!");
		}
	}
	//Sanjay.Mahajan 02/02/2023
	public void addMethod(){
		System.out.println("New method added!");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
