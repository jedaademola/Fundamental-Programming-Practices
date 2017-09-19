package com.fpp.lesson8;

public class Node {
	int data;
	Node prev;
	Node next;
	
	public Node(int data, Node prev, Node next) {
		super();
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	@Override
	public String toString() {
		return data  + "";
	}
	

}
