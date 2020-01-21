package com.practice.ds.stack;

public class App {
	
	public static void main(String args[]) {
		
		Stack stack=new Stack(3);
		
		stack.push(1);
		stack.push(2);

		stack.push(3);

		stack.push(4);

		stack.push(5);


		stack.push(43);
		stack.push(43);

		
		while(!stack.isEmpty()) {
			
			long value=stack.pop();
			
			System.out.println(value);
		}
	}

}
