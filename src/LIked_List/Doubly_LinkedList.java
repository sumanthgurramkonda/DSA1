package LIked_List;

class dNode{
	int data;
	dNode prev;
	dNode next;
	dNode(){
	}
	public dNode(int data) {
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}

class DoublyLinkedList{
	dNode head;
	dNode tail;
	void add(int e) {
		dNode temp = new dNode(e);
		if(head==null) {
			head = temp;
			tail = temp;
		}
		else {
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
    void print() {
    	dNode curr=head;
    	while(curr!=null) {
    		System.out.print(curr.data + " ");	
    		curr = curr.next;
    	}
    	System.out.println();
    }
    void printReverse() {
    	dNode curr=tail;
    	while(curr!=null) {
    		System.out.print(curr.data+" ");
    		curr=curr.prev;
    	}
    	System.out.println();
    }
    void addFirst(int e) {
    	dNode temp = new dNode(e);
    	if(head == null) {
    		head = temp;
    		tail = temp;
    	}
    	else {
    		head.prev= temp;
    		temp.next=head;
    		head = temp;
    	}
    }
    void add(int e,int i) {
    	if(i==0) {
    		addFirst(e);
    	}
    	else {
    	int index=0;
    	dNode temp = new dNode(e);
    	dNode curr = this.head;
    	while(index<(i-1)) {
    	curr = curr.next;	
    	index++;
    	}
        curr.next.prev=temp;
        temp.next=curr.next;
        curr.next=temp;
        temp.prev=curr;
    	}
    }
    void addAll(int ar[]) {
    	for(int e:ar)this.add(e);
    }
    void removeFirst() {
    	if(head==null);
    	else if(head.next==null) {
    		head=null;
    		tail=null;
    	}
    	dNode curr=head;
    	head=head.next;
    	curr.next = null;
    	head.prev=null;
    }
    void removeLast() {
    	if(head==null);
    	else if(head.next==null) {
    		head=tail=null;
    	}
    	tail=tail.prev;
    	tail.next=null;
    }
    public void reverse() {
    	dNode curr=this.head;
    	dNode temp=curr.next;
    	curr.next=null;
    	curr.prev=temp;
    	while(temp!=null) {
    		temp.prev=temp.next;
    		temp.next=curr;;
    		curr=temp;
    		temp=temp.prev;
    	}
    	this.head=curr;
    	
    }

}

public class Doubly_LinkedList {
	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(25,2);
		
		dl.print();
		dl.reverse();
		dl.print();
		
//		int ar[]= {1,2,3,4,5};
//		dl.addAll(ar);
//		dl.removeFirst();
//		dl.removeLast();
//		dl.print();
//		dl.printReverse();
		
	}

}
