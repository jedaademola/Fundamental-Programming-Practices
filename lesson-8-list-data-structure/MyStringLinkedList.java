package com.fpp.lesson8;



public class MyStringLinkedList {
	static Node header;

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
	public void removeFirst(){
     if (header == null)
    	 return;
     if(header.next == null)
    	 header = null;
     else
     {
    	 Node temp = header;
    	 temp.next.previous = null;
    	 header = temp.next;
     }
		
	}
	
	
	
	public void removeLast(){
		if (header == null)
			return;
		else {
			
			Node lastNode = header;
			while (lastNode.next != null)
			{
				lastNode = lastNode.next;
			}
			
			lastNode.previous.next = null;
			lastNode.previous = null;

		}
		
	}
	public void printMin(){
		
		if (header == null)
			System.out.println("List has no element,cannot find Minimun");
		else if (header.next == null)
			System.out.println("Minimum value:" + header.value);
		else
		{
			Node list = header;
			String minValue=list.value;
			
			while (list.next != null)
			{
				list = list.next;
				
				if(minValue.compareTo(list.value) >= 0 )
				{
					minValue = list.value;
				}
				
			}
			
			System.out.println("Minimum value:" + minValue);
		}
		
	}
	public void printMax(){
		
		if (header == null)
			System.out.println("List has no element,cannot find Minimun");
		else if (header.next == null)
			System.out.println("Maximum value:" + header.value);
		else
		{
			Node list = header;
			String maxValue="";
			
			while (list.next != null)
			{
				//String tempValue = list.value;
				//int test = maxValue.compareTo(tempValue);
			
				if(maxValue.compareTo(list.value) <= 0 )
				{
					maxValue = list.value;
				}
				
				list = list.next;
				
			}
			
			System.out.println("Maximum value:" + maxValue);
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

			Node lastNode = new Node(null, item, null);
			lastNode.previous = temp;
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

	public int size() {
		
		int count = 0;
		if (header == null)
			return 0;
		else {
			Node temp = header;
			while (temp != null)
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

	public void printList()
	{
		Node n = header;
		if (n == null)
		   System.out.println("No element in the list");
		else
		   print(n);
	}
	private void print(Node n) {
		
		if ( n != null)
		{
			System.out.println(n.value);
			print(n.next);
		}
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
		
		MyStringLinkedList mySL = new MyStringLinkedList();
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
		mySL.removeFirst();
		System.out.println(mySL);		
		mySL.removeLast();
		System.out.println(mySL);
		mySL.printList();
		
		mySL.deleteList();
		System.out.println(mySL);
		mySL.printReverse();
		
	}

}

/*
OUTPUT
----------------------- 
-->[NULL]
==>[NULL]
-->[Carrot Cake]-->[NULL]
==>[Carrot Cake]==>[NULL]
-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[NULL]
==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
I am here 2
-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
==>[Peach Sauce]==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
I am here 3
-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Carrot Cake]==>[Blueberry Muffin]==>[NULL]
I am here 4
-->[Blueberry Muffin]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Blueberry Muffin]==>[NULL]
-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Blueberry Muffin]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Carrot Cake]-->[Danish Delight]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]
==>[Orange Juice]==>[Mango Smoothie]==>[Blueberry Muffin]==>[Apple Pie]==>[NULL]
-->[Apple Pie]-->[Blueberry Muffin]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
-->[Blueberry Muffin]-->[Mango Smoothie]-->[Orange Juice]-->[Peach Sauce]-->[NULL]
-->[Blueberry Muffin]-->[Mango Smoothie]-->[Orange Juice]-->[NULL]
Blueberry Muffin
Mango Smoothie
Orange Juice
-->[NULL]
==>[NULL]

*/
