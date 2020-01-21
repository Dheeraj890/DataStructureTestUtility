package com.practice.ds;

public class Human {
	
	
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	
	public void speak() {
		
		
		System.out.println("Hello my name is "+name);
		
	}
	
	public void eat() {
		
		System.out.println("Eating");
	}
	
	public void work() {
		
		System.out.println("Working....");
	}
	
	public void walk() {
		
		
		System.out.println("Walking......");
		
		class methodTest{
			
			public void displayFromMethod() {
				
				System.out.println("Display from inner method class");
			}
			
		}
	}
	
	class Inner { 
	      public void show() { 
	           System.out.println("In a nested class method and name is "+name); 
	      } 
	   } 

}
