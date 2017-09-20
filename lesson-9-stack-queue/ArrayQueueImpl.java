package com.fpp.lesson8;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	private int size = 0;

	public int peek() 
	{
		if (isEmpty())
		{
			System.out.println("Queue is Empty");
		    return -1;
		}
		else
		{
			int topElement = arr[front];
			return topElement;
			
		}
	}

	public void pint()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
		for(int k=front;k<rear;++k)
		{
			System.out.print(arr[k]);
		}
		
	}
	public void enqueue(int obj) {
		if(size == arr.length) resize();
		if (size == 0) ++front;
		
		++size;
		arr[rear]= obj;
		++rear;
	}

	public int dequeue() {
		
		if (isEmpty())
		{
			System.out.println("Queue is Empty");
		    return -1;
		}
		else
		{
			int topElement = arr[front];
		    ++front;
			--size;
			return topElement;
			
		}
	
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	private void resize() {
		int len = arr.length;
		int newlen = 2*len;
		int[] temp = new int[newlen];
		System.arraycopy(arr,0,temp,0,len);
		arr = temp;
	}
	
	
}
