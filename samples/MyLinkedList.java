package com.fpp;

public class MyLinkedList {

	Node header;

	// IMPLEMENT
	public void AddLast(String value) {
		if (header == null)
			header = new Node(null, value, null);
		else
		{		
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			
			Node lastNode= new Node(temp.previous, value, null);
			temp.next = lastNode;
			//lastNode.previous = temp;
			
		}
	}

	public void print() {
		Node temp = header;
		while (temp.next != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.print(temp.value);
	}

	class Node {
		Node previous;
		String value;
		Node next;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			if (value == null) {
				return "Null";
			}
			return value;
		}
	}

	public static void main(String a[]) {
		MyLinkedList list = new MyLinkedList();
		list.AddLast("Pepe");
		list.AddLast("Juan");
		list.AddLast("Pedro");
		list.print();
	}
}
