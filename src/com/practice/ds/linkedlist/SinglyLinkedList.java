package com.practice.ds.linkedlist;

public class SinglyLinkedList {
	
	
	private Node first;

	public SinglyLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Boolean isEmpty() {
		return first==null;
	}
	
	
	public void insertFirst(int data) {
		
		Node node=new Node();
		
		node.setData(data);
		node.setNext(first);
		first=node;
		
	}
	
	
	public Node deleteFirst() {
		
		Node temp=first;
		
		first=first.getNext();
		
		return temp;
	}
	
	
	
	
	public void display() {
		
		System.out.println("List (first --> Last)");
		
		Node current=first;
		
		while(current!=null) {
			
			current.displayNode();
			
			current=current.getNext();		}
	}
	
	
	public void insertLast(int data) {
		
		Node current=first;
		
		while(current.getNext()!=null) {
			
			current=current.getNext();
		}
		
		Node newNode=new Node();
		newNode.setData(data);
		current.setNext(newNode);
	}
}
