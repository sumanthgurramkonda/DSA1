package Queue;

import java.util.Scanner;

class Node{
	
	int  data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
class Queue{
	Node front;
	Node rear;
	int size;
	
	Queue(){
		this.front=null;
		this.rear=null;
		this.size = 0;
	}
	void enqueue(int ele) {
		Node temp = new Node(ele);
		if(front==null) {
			front = temp;
			rear = temp;
			size++;
		}
		else {
			rear.next=temp;
			rear=temp;
			size++;
		}
	}
	int dequeue() {
		if(size==0) {
			System.out.println("Que is empty");
			return -1;
		}
		else {
			Node temp = front;
			front=front.next;
			temp.next=null;
			size--;
			return temp.data;
		}
	}
	int getFront() {
		return front.data;
	}
	int getRear() {
		return rear.data;
	}
	boolean isEmpty() {
		return size==0;
	}
}

public class LQueue {
//	static void numberSeries(int n) {
//		Queue q = new Queue();
//		q.enqueue("5");
//		q.enqueue("6");
//		String temp ;
//		for(int i=0;i<n;i++) {
//			temp = q.dequeue();
//			System.out.print(temp+" ");
//			q.enqueue(temp+"5");
//			q.enqueue(temp+"6");
//		}
//	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
//		numberSeries(n);
		
		Queue q = new Queue();
		
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		System.out.println(q.isEmpty());
//		System.out.println(q.getFront());
//		System.out.println(q.getRear());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.isEmpty());
//		

		
		
	}

}



















