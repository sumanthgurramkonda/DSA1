package Queue;

class DeNode{
	int data;
	DeNode next;
	DeNode prev;
	public DeNode(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
class DeQue{
	
	DeNode front;
	DeNode rear;
	int size=0;
	
	void offerFirst(int ele) {
		DeNode temp = new DeNode(ele);
		if(front==null) {
			front=temp;
			rear=temp;
			size++;
		}
		else {
			temp.next=front;
			front.prev=temp;
			front=temp;
			size++;
		}	
	}
	void offerLast(int ele) {
		DeNode temp = new DeNode(ele);
		
		if(rear==null) {
			rear=temp;
			front=temp;
			size++;
		}
		else {
			rear.next=temp;
			temp.prev=rear;
			rear=temp;
			size++;
		}
	}
	int pollFirst() {
		
		if(front==null)System.out.println("Que is empty");
		else if(front.next==null) {
			int a = front.data;
			front=null;
			rear=null;
			size--;
			return a;
		}
		else {
		DeNode curr = front;
	    int ele = front.data;
	    front = front.next;
	    curr.next=null;
	    front.prev=null;
	    size--;
		return ele;
		}
		return -1;
	}
	int pollLast() {
		if(rear==null)System.out.println("Que is empty");
		else if(rear.prev==null) {
			int a = rear.data;
			rear=null;
			size--;
			return a;
		}
		else {
		DeNode curr = rear;
		int ele = rear.data;
		rear = rear.prev;
		curr.prev=null;
		rear.next=null;
		size--;
		return ele;
		}
		return -1;
	}
	int peekFirst() {
		return front.data;
	}
	int peekLast() {
		return rear.data;
	}
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	
}

public class DobleEndedQueue {
	public static void main(String[] args) {
		
		DeQue dq = new DeQue();
		dq.offerFirst(1);
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(30);
		System.out.println(dq.size());
//		System.out.println(dq.peekFirst());
//		System.out.println(dq.peekLast());		
		
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollFirst());
		System.out.println("    ");

		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());

//		System.out.println(dq.pollLast());
		System.out.println(dq.size());
		
	}

}
