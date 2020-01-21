package com.practice.ds;

public class Earth {
	
	
	
	public static void main(String args[]) {
		
		Human tom=new Human();
		tom.name="Tom";
		
		tom.speak();
		
		tom.walk();
		
		Human.Inner in=new  Human().new Inner();
		
		in.show();
		
		
	}

}
