package com.practice.ds.stack;

public class Stack {
	
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	
	public Stack(int size) {
		
		maxSize=size;
		
		this.stackArray=new long[maxSize];
		
		this.top=-1;
		
		
	}
	
	
	public void push(long j) {
		
		if(!isFull()) {

			top++;
			stackArray[top]=j;
		}
		else {
			
			System.out.println("Stack is Full cannot add more element");
		}

	}
	
	
	public long pop() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is already Empty");
			return -1;
		}
		else {
		
			int old_top=top;
			top--;
			
			return stackArray[old_top];
			
		}
		
	}
	
	public long peek() {
		
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		
		return (top==-1);
	}

	
	public boolean isFull() {
		
		return (maxSize-1==top);
	}
}
