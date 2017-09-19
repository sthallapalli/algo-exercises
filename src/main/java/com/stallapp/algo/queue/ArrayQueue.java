package com.stallapp.algo.queue;

import java.util.Arrays;

public class ArrayQueue {

	/**
	 * @param args
	 */

	private int front = 0;
	private int rear = -1;
	private int[] queue;
	private int size = 0;
	private int max = 0;

	public ArrayQueue(int max) {
		this.max = max;
		this.queue = new int[max];
		// this.size = this.size + 1;
	}

	public void enqueue(int x) {
		if (size < max) {
			size = size + 1;
			rear = rear + 1;
			queue[rear] = x;
		}
	}

	public int dequeue() {
		int x = -1;
		if (!isEmpty()) {
			size = size - 1;
			x = queue[front];
			front = front + 1;
		}

		return x;
	}

	public boolean isFull() {
		return size == max;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int[] getArray() {
		return queue;
	}

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);

		System.out.println("isEmpty ?? " + queue.isEmpty());

		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(8);
		queue.enqueue(1);

		System.out.println("Queue : " + Arrays.toString(queue.getArray()));
		System.out.println("first Element : " + queue.getArray()[0]);
		System.out.println("isEmpty ?? " + queue.isEmpty());
		System.out.println("isFull ?? " + queue.isFull());

		System.out.println("Dequeue operation : " + queue.dequeue());
		System.out.println("Dequeue operation : " + queue.dequeue());
	}

}
