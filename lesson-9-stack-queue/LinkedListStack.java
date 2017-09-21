package com.fpp.lesson;

import java.util.LinkedList;

public class LinkedListStack implements Stack {
	private LinkedList<Integer> list;
	private Node top;
	private int size;

	LinkedListStack() {
		list = new LinkedList<Integer>();
		top = null;
		size = 0;
	}

	@Override
	public void push(Integer ob) {
		if (top == null) {
			top = new Node(null, ob, null);
		} else {
			Node temp = new Node(top, ob, null);
			top.next = temp;
			top = temp;
		}
		size++;

	}

	@Override
	public Integer pop() {
		if (top == null) {
			System.out.println("Empty Stack");
			return null;
		} else if (top.prev == null) {
			size--;
			Node ret = top;
			top = null;
			return ret.value;
		} else {
			Node ret = top;
			size--;
			Node temp = top.prev;
			top = null;
			top = temp;
		
			return ret.value;
		}

	}

	@Override
	public Integer peek() {
		return top.value;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		LinkedListStack stackList = new LinkedListStack();
		
		stackList.push(1); 
		stackList.push(2);
		stackList.push(3);
		stackList.push(4);

		Integer element;
		System.out.println("Stack size:" + stackList.size());
		element = stackList.pop(); 
		System.out.println(element + " is deleted");
		stackList.push(5); 
		stackList.push(6);
		System.out.println(stackList.pop() + " is deleted");
		stackList.push(7);
		element = stackList.peek(); 
		System.out.println("Element on top of the stack:" +element );
		System.out.println("Stack size: " + stackList.size());
	}

	class Node {
		Integer value;
		Node next;
		Node prev;

		public Node(Node prev, Integer value, Node next) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}

}
/*
 * OUTPUT
 * ----------------
Stack size:4
4 is deleted
6 is deleted
Element on top of the stack:7
Stack size: 5
*/
