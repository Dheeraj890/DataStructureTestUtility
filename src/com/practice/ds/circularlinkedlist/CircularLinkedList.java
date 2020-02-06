package com.practice.ds.circularlinkedlist;

import com.practice.ds.linkedlist.Node;

public class CircularLinkedList {

	private Node first;

	private Node last;

	public CircularLinkedList() {

		first = null;
		last = null;

	}

	public void insertFirst(int data) {

		Node newNode = new Node();

		newNode.setData(data);

		if (isEmpty()) {

			last = newNode;
		}

		newNode.setNext(first);

		first = newNode;

	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}

	public void insertLast(int data) {

		Node node = new Node();

		node.setData(data);

		if (isEmpty()) {

			last = node;
		}

		else {

			last.setNext(node);// the next value of the last node will point to the new node
			last = node;// we make the new node we created be the last one in the list
		}

	}

	public int deleteFirst() {

		int temp = first.getData();

		if (first.getNext() == null) {

			last = null;
		}

		first = first.getNext();

		return temp;

	}
	
	
	public void displayList() {
		
		
System.out.println("List (first --> Last)");
		
		Node current=first;
		
		while(current!=null) {
			
			current.displayNode();
			
			current=current.getNext();	
	}
	}

}
