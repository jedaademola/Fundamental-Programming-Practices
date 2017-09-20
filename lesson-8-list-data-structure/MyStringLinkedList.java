package com.fpp.lesson8;

public class MyStringLinkedList {
	double a,b,c,d,k,e;
	Node header;

	MyStringLinkedList() {
		header = null;
	}

	
	public Object getFirst(){
		
		return header !=null ? header : null;
	}
	public Object getLast(){
		
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}
	public void removeFirst(){//TODO NOT COMPLETED
     if (header == null)
    	 return;
     if(header.next == null)
    	 header = null;
     else
     {
    	 Node temp = header;
    	 temp.next.previous = null;
    	 temp = null;
    	 header = temp.next;
     }
		
	}
	public void removeLast(){
		if (header == null)
			return;
		else {
			
			Node lastNode = header;
			while (lastNode.next != null)
				lastNode = lastNode.next;
			
			lastNode = null;
		}
		
	}
	public void printMin(){
		
		if (header == null)
			System.out.println("List has no element,cannot find Minimun");
		else if (header.next == null)
			System.out.println("Minimun value:" + header.value);
		else
		{
			Node list = header;
			String minValue=list.value;
			
			while (list.next != null)
			{
				if(minValue.compareTo(list.value) == 1 )
				{
					minValue = list.value;
				}
				list = list.next;
			}
			
			System.out.println("Minimun value:" + minValue);
		}
		
	}
	public void printMax(){
		
		
		
		if (header == null)
			System.out.println("List has no element,cannot find Minimun");
		else if (header.next == null)
			System.out.println("Maximun value:" + header.value);
		else
		{
			Node list = header;
			String maxValue=list.value;
			
			while (list.next != null)
			{
				if(maxValue.compareTo(list.value) == -1 )
				{
					maxValue = list.value;
				}
				list = list.next;
			}
			
			System.out.println("Maximun value:" + maxValue);
		}
		
	}
	
	
	public void addFront(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node n = new Node(null, item, header);
			header.previous = n;
			header = n;
		}
	}

	// Implement the code

	public void addLast(String item) {
		if (header == null)
			header = new Node(null, item, null);
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;

			Node lastNode = new Node(temp.previous, item, null);
			temp.next = lastNode;

		}
	}

	// implement the code
	public void postAddNode(Node n, String value) {
		if(n == null)
		{
			return;
		}
		else
		{
			Node temp = new Node(n,value,n.next);
			n.next = temp;
		}
	}

	// implement the code

	public int Size() {
		
		int count = 0;
		if (header == null)
			return 0;
		else {
			Node temp = header;
			while (header.next != null)
			{
				++count;
				temp = temp.next;
			}
		
		}
		
		return count;
	}

	// implement code
	public boolean isEmpty()
	{
		if (header != null)
		  return false;
		
		return true;
	}

	public void preAddNode(Node n, String value) {
		Node newNode;
		if (n == null) {
			// List is empty
			newNode = new Node(null, value, null);
		} else if (n.previous == null) {
			// n is the first node
			addFront(value);
		} else {
			newNode = new Node(n.previous, value, n);
			n.previous.next = newNode;
			n.previous = newNode;
		}

	}

	public Node findLast() {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp.next != null)
				temp = temp.next;
			return temp;
		}
	}

	public Node findItem(String str) {
		if (header == null)
			return null;
		else {
			Node temp = header;
			while (temp != null)
				if (str.equals(temp.value))
					return temp;
				else
					temp = temp.next;
			return null;
		}
	}

	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}

	public void deleteList() {
		Node tempOne = header;
		Node tempTwo = header;
		while (tempOne != null) {
			tempOne = tempOne.next;
			tempTwo = null;
			tempTwo = tempOne;
		}
		header = null;
	}

	public String toString() {
		String str = "";
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	
	public void print(Node n) {
		if (header == null)
			System.out.println("No element in the list");
		else
			print(n.next);
	}
	//Write a recursive print method to display
	//the elements in the list. Start with the First Node(Head)
	public void printReverse() {
		String str = "";
		Node temp = findLast();
		while (temp != null) {
			str = str + "==>[" + temp.value.toString() + "]";
			temp = temp.previous;
		}
		str = str + "==>[" + "NULL" + "]";
		System.out.println(str);
	}

	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
/*		MyStringLinkedList mySL = new MyStringLinkedList();
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Blueberry Muffin");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addFront("Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Orange Juice");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.addLast("Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Apple Pie"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Peach Sauce"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteNode(mySL.findItem("Carrot Cake"));
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Blueberry Muffin"), "Carrot Cake");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Blueberry Muffin"), "Apple Pie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Carrot Cake"), "Danish Delight");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.preAddNode(mySL.findItem("Orange Juice"), "Mango Smoothie");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.postAddNode(mySL.findItem("Orange Juice"), "Peach Sauce");
		System.out.println(mySL);
		mySL.printReverse();
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();*/
	}

}
