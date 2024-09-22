package LIked_List;


class cNode{
	
	int data;
	cNode next;
	cNode(int data){
		this.data=data;
		this.next=null;
	}
}
class CircularLinkedList{
	cNode head;
	
	void print() {
		
		if(head!=null) {
			cNode curr = head;
		do {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
		while(curr!=head);
		System.out.println();
	    }
	}
    void addFirst(int e) {
    	cNode temp = new cNode(e);
//    	cNode curr = head;
//    	temp.next = head;
//    	while(curr.next!=head) {
//    		curr= curr.next;
//    	}
//    	curr.next=temp;
//    	head = temp;
    	if(head==null) {
    		head = temp;
    		head.next=head;
    	}
    	else {
    	temp.next = head.next;
    	head.next = temp;
    	int a = head.data;
    	head.data = temp.data;
    	temp.data = a;
    	}
    }
    void addLast(int e) {
    	cNode temp = new cNode(e);
    	cNode curr=head;
    	if(head==null)addFirst(e);
    	else {
//    	while(curr.next!=head) {
//    		curr=curr.next;
//    	}
//    	curr.next=temp;
//    	temp.next=head; 	
        temp.next = head.next;
        head.next = temp;
        int a = temp.data;
        temp.data=head.data;
        head.data=a;
        head = temp;
    	}
    }
    void removeFirst() {
    	if(head==null);
    	else if(head.next==head)head=null;
    	else {
//    		cNode curr=head.next;
//    		while(curr.next!=head) {
//    			curr=curr.next;
//    		}
//    		head=head.next;
//    		curr.next=head;
    		int a = head.data;
    		head.data=head.next.data;
    		head.next.data = a;
    		head.next=head.next.next;
    	}
    }
    void removeLast() {
    	if(head==null);
    	else if(head.next==head)head=null;
    	else {
    		cNode curr=head.next;
    		while(curr.next.next!=head) {
    			curr=curr.next;
    		}
    		curr.next=head;
        }
        }


}

public class Circulat_LinkedList {
	
	public static void main(String[] args) {
		
		CircularLinkedList cl = new CircularLinkedList();
	    cl.head  = new cNode(10);
		cl.head.next = new cNode(20);
		cl.head.next.next = cl.head;
//		cl.addFirst(0);		cl.addLast(30);
		cl.print();
	    cl.removeLast();
		cl.print();
		
		
		
		
	}
}




















