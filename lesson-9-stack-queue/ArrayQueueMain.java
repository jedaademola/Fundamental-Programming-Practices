package com.fpp.lesson8;

public class ArrayQueueMain {

	public static void main(String[] args) {
		ArrayQueueImpl queue = new ArrayQueueImpl();
		queue.enqueue(9);
		queue.enqueue(8);
		queue.enqueue(7);
		queue.enqueue(6);
		queue.enqueue(5);

		queue.pint();
		System.out.println();
		System.out.println("Queue size:" + queue.size());
		
		System.out.println("Dequeue element1:" + queue.dequeue());
		queue.pint();
		
		System.out.println();
		System.out.println("Queue size:" + queue.size());
		
		System.out.println("Peek element:" + queue.peek());
		queue.pint();
		
		System.out.println();
		System.out.println("Dequeue element2:" + queue.dequeue());
		queue.pint();
		System.out.println();
		System.out.println("Queue size:" + queue.size());
	
	
	
	}

}
