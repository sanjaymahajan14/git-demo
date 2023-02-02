package com.parth;

public class App 
{
	
	public void addData(String data) {
		System.out.println("data ="+data);
		if(data.equals(Constants.Data_Type)) {
			System.out.println("Welcome!");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hi I am here!" );
    }
}
