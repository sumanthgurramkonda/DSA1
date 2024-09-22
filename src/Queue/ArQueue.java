package Queue;
class aQueue{
	int ar[];
	int front;
	int rear;
	int size;
	int capacity;
	aQueue(int capacity){
		this.capacity=capacity;
		this.ar = new int[capacity];
		this.front=0;
		this.rear=-1;
		this.size=0;
	}
	void enqueue(int ele) {
		if(size==capacity) {
			System.out.println("Queue is full");
		}
		else {
			rear=(rear+1)%capacity;
		    ar[rear]=ele;
		    size++;
	    }
	}
	int dequeue() {
		if(size==0) {
			System.out.println("Que is empty");
			return -1;
		}
		else {
			front = (front+1)%capacity;
			size--;
			return ar[front];
		}
	}
	int getFront() {
		if(size>0)
		return ar[front];
		else {
			System.out.println("Que is empty");
			return -1;
		}
	}
	int getRear() {
		if(size>0)
		 return ar[rear];
		else {
			System.out.println("Que is empty");
			return -1;
		}
		
	}
	boolean isEmpty() {
		return size==0;
	}
	boolean isFull() {
		return size==capacity;
	}
}
public class ArQueue {
	public static void main(String[] args) {
		
		aQueue q = new aQueue(6);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.size);
		System.out.println(q.dequeue());
		System.out.println(q.getFront());
		System.out.println(q.getRear());
		System.out.println(q.size);
		
	}

}
