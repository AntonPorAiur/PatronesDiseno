package com.company.structural.bridge.fifo;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
		collection.offer(10);
		collection.offer(45);
		collection.offer(78);

		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());

	}

}
