package com.practice.ds.queue;

public class Queue {
	
	
	private int maxSize;//initialize the set of number slot
	
	private long[] queueArray;//slot to maintain data
	
	private int front;//this will be the index position for the element in front
	
	private int rear;//going to be the index element for the element at back of the line 
	
	private int nItems;//counter to maintain the number of items in our queue
	
	public Queue(int size) {
		
		this.maxSize=size;
		this.queueArray=new long[maxSize];
		front=0;//index position of the first slot
		rear=-1;//there is no item in the array yet to be considered last item.
		
		nItems=0;
	}
	
	
	public void insert(long j) {
		
		
		if(rear==maxSize-1)
			rear=-1;
		
		rear++;
		queueArray[rear]=j;
		nItems++;
		
	
	}
	
	public void view() {
		
		
		System.out.print("[ ");
		
		for(long i:queueArray) {
			
			
			System.out.print(i+ " ");
			
		}
		
		System.out.print(" ]");
	}
	
	
	
	public long remove() {
		
		long temp=queueArray[front];
		front++;
		
		nItems--;
		
		if(front==maxSize) {
		
			front=0;
			
		}
		
		return temp;
		
	}
	
	
	public long peekFront() {
		
		return queueArray[front];
		
	}
	
	public Boolean isEmpty() {
		
		
		return (nItems==0);
	}
	
	
	public Boolean isFull() {
		
		
		return(nItems==maxSize);
	}

}
