package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection {

	public static void main(String[] args) {
		//Queue<String> p=new PriorityQueue<>();

		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("Ashwini");
		pq.add("neha");
		pq.add("kamal");
		pq.add("sanchita");
		pq.add("neha");
		System.out.println("Element in Priority Queue is: " +pq);
		System.out.println("First Element in Priority Queue is: " +pq.peek());
		System.out.println("remove Element in Priority Queue is: " +pq.remove("neha"));
		System.out.println("Element in Priority Queue is: " +pq);
		System.out.println("remove Element in Priority Queue is: " +pq.remove("neha"));
		System.out.println("Element in Priority Queue is: " +pq);
		System.out.println("poll means remove first Element in Priority Queue is: " +pq.poll());
		System.out.println("Element in Priority Queue is: " +pq);



	}

}
