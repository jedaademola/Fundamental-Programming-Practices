package com.fpp.lesson8;

import com.fpp.lesson8and9.ArrayQueueImpl;

public class ArrayQueueMain {

	public static void main(String[] args) {
		ArrayQueueImpl queue = new ArrayQueueImpl();
		queue.enqueue(9);
		queue.enqueue(8);
		queue.enqueue(7);
		queue.enqueue(6);
		queue.enqueue(5);

		System.out.print("Queue Elements:");
		queue.pint();
		System.out.println();
		System.out.println("Queue size:" + queue.size());
		
		System.out.println("Dequeue element:" + queue.dequeue());
		System.out.print("Queue Elements:");
		queue.pint();
		
		System.out.println();
		System.out.println("Queue size:" + queue.size());
		
		System.out.println("Peek element:" + queue.peek());
		System.out.print("Queue Elements:");
		queue.pint();
		
		System.out.println();
		System.out.println("Dequeue element:" + queue.dequeue());
		System.out.print("Queue Elements:");
		queue.pint();
		System.out.println();
		System.out.println("Queue size:" + queue.size());
	
	
	
	}

}

/*
OUTPUT
------------
Queue Elements:98765
Queue size:5
Dequeue element:9
Queue Elements:8765
Queue size:4
Peek element:8
Queue Elements:8765
Dequeue element:8
Queue Elements:765
Queue size:3

 */
