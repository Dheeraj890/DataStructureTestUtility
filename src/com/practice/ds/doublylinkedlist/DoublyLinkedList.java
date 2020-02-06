package com.practice.ds.doublylinkedlist;

public class DoublyLinkedList {
	
	
	private Node first;
	
	private Node last;

	
	
	public DoublyLinkedList() {
		
		first=null;
		last=null;
	}
	
	
	public Boolean isEmpty() {
		
		return first==null;
	}
	
	public void insertFirst(int data) {
		
		
		
		Node node =new Node();
		
		node.data=data;
		
		if(isEmpty()) {
			
			last=node;//if empty, last being refereed to the new node being created 
		}
		else {
			
			first.previous=node;
		}
		
	node.next=first;
	
	this.first=node;
		
	}
	
	
	
	public void insertLast(int data) {
		
		
		Node node = new Node();
		
		node.data=data;
		
		if(isEmpty()) {
			
			first=node;
		}
		
		else {
			
			last.next=node;
			node.previous=last;
			
		}
		
		last=node;

		
	}
	
	
	public Node deleteFirst() {
		
		Node temp=first;
		
		if(first.next==null) {
			
			
			
		}
		
		return null;
	}
}
