package com.fpp.lesson8;

public class NodeTest {

	public static void main(String[] args) {
		Node n1 = new Node(10,null,null);
		//System.out.println(n1);
		
		Node n2 = new  Node(20,n1,null);
		n1.next = n2;
		//System.out.println(n1 + " " + n2);
		
		Node n3 = new Node(30,n2,null);
		n2.next = n3;
		
		//System.out.println(n1 + "-->" + n2 + "-->" + n3);
		Node n11 = new Node(15,n1,n2);
		n1.next =n11;
		n2.prev= n11;
		//System.out.println(n1 + "-->" + n2 + "-->" + n3);
		//System.out.println(n1.next);
		//System.out.println(n2.next);
		//System.out.println(n1 + "-->" + n2 + "-->" + n3 + "-->" + n11);
		int sum =0;
		for(Node i=n1; i != null; i = i.next)
		{
			sum+= i.data;
			System.out.println(i);
		}
		System.out.println("sum:" + sum);

	}

}
