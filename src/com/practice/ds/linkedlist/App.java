package com.practice.ds.linkedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Node nodeA=new Node();
//		nodeA.setData(4);
//		
//		
//
//		Node nodeB=new Node();
//		nodeB.setData(7);
//		nodeA.setNext(nodeB);
//		
//
//		Node nodeC=new Node();
//		nodeC.setData(11);
//		nodeB.setNext(nodeC);
//
//
//		Node nodeD=new Node();
//		nodeD.setData(13);		
//		nodeC.setNext(nodeD);
//
//		
//		System.out.println(listLength(nodeA));
//		System.out.println(listLength(nodeB));
		
		
		
		
		SinglyLinkedList linkedList=new SinglyLinkedList();
		
		linkedList.insertFirst(10);
		linkedList.insertFirst(20);
		linkedList.insertFirst(30);
		linkedList.insertFirst(40);
		linkedList.insertFirst(50);
		linkedList.insertFirst(60);
		linkedList.insertLast(900);

	
		linkedList.display();
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
