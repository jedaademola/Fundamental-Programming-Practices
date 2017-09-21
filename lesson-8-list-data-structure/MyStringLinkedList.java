package com.fpp.lesson8;



public class MyStringLinkedList {
	double a,b,c,d,k,e;
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
	public void removeFirst(){//TODO NOT COMPLETED
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
				lastNode = lastNode.next;
			
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
				if(minValue.compareTo(list.value) >= 0 )
				{
					minValue = list.value;
				}
				list = list.next;
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
		
		MyStringLinkedList mySlked = new MyStringLinkedList();	
		System.out.println(mySlked);
		
		mySlked.addFront("Lukman");
		System.out.println(mySlked);
		
		mySlked.addLast("Farah");
		System.out.println(mySlked);
		
		Node postNode = header.next;
		mySlked.postAddNode(postNode,"Farhan");
		System.out.println(mySlked);
		
		Node postNode1 = header.next;
		mySlked.postAddNode(postNode1,"Anke");
		System.out.println(mySlked);
		
		Node postNode2 = header;
		mySlked.postAddNode(postNode2,"Mozeed");
		System.out.println(mySlked);
		
		System.out.println("Size of Linked List:" + mySlked.size());
		System.out.println("Linked List is empty:" + mySlked.isEmpty());
		System.out.println("Linked List first item:" + mySlked.getFirst());
		System.out.println("Linked List Last item:" + mySlked.getLast());
		
		mySlked.removeFirst();
		System.out.println(mySlked);
		mySlked.removeLast();
		System.out.println(mySlked);
		
		mySlked.printMax();
		System.out.println(mySlked);
		mySlked.printMin();
		System.out.println(mySlked);
		
		
		
	}

}

/*
OUTPUT
----------------------- 
  -->[NULL]
-->[Lukman]-->[NULL]
-->[Lukman]-->[Farah]-->[NULL]
-->[Lukman]-->[Farah]-->[Farhan]-->[NULL]
-->[Lukman]-->[Farah]-->[Anke]-->[Farhan]-->[NULL]
-->[Lukman]-->[Mozeed]-->[Farah]-->[Anke]-->[Farhan]-->[NULL]
Size of Linked List:5
Linked List is empty:false
Linked List first item:Lukman
Linked List Last item:Farhan
-->[Mozeed]-->[Farah]-->[Anke]-->[Farhan]-->[NULL]
-->[Mozeed]-->[Farah]-->[Anke]-->[Farhan]-->[NULL]
Maximum value:Mozeed
-->[Mozeed]-->[Farah]-->[Anke]-->[Farhan]-->[NULL]
Minimum value:Anke
-->[Mozeed]-->[Farah]-->[Anke]-->[Farhan]-->[NULL]

*/
