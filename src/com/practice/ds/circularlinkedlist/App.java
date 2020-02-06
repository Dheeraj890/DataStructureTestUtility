package com.practice.ds.circularlinkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			
		
		CircularLinkedList linkedList=new CircularLinkedList();
		
		linkedList.insertFirst(10);
		linkedList.insertFirst(20);
		linkedList.insertFirst(30);
		linkedList.insertFirst(40);
		linkedList.insertFirst(50);
		linkedList.insertFirst(60);
		linkedList.insertLast(900);

	
		linkedList.displayList();
	}
	
	public static int listLength(Node node) {
		
		int counter=0;
		
		Node currentNode=node;
		while(currentNode!=null) {
			
			counter++;

			currentNode=currentNode.getNext();
		}
		
		return counter;
		
	}

}
