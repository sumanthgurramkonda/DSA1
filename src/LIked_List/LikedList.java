package LIked_List;

class LinkedList {
	private class Node{
		int data;
		Node next;
		Node bottom;
		Node(int data){
			this.data= data;
			this.next=null;
			this.bottom=null;
		}
	}
	private Node head;
 
	void add(int e) {
		Node  temp = new Node(e); 
		if(head==null)head=temp;
		else {
			Node curr = head;
			while(curr.next!=null) curr = curr.next;
			curr.next=temp;
		}	
	}
	void print() {
		Node curr = this.head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}
	void addBottom(int e,int i) {
		Node temp = new Node(e);
		Node head=this.head;
		if(head==null)throw new NullPointerException();
		while(i-->0) head=head.next;
		while(head.bottom!=null)	head=head.bottom;
		head.bottom=temp;
	}
	void printAll() {
		Node head = this.head;
		while(head!=null) {
			Node head1=head;
			while(head1!=null) {
				System.out.print(head1.data+" ");
				head1=head1.bottom;
			}
			System.out.println();
			head=head.next;
		}
	}
	void addFirst(int e) {
	     Node temp = new Node(e);
	     if(head == null) {
	    	 head = temp;
	     }
	     else {
	    	 temp.next=head;
	    	 head = temp;
	     }
	}
	void add(int e,int i) {
		try {
			if(i==0) {
				addFirst(e);
			}
			else {
			Node temp = new Node(e);
			Node curr=this.head;
			int j=0;
			while(j<i-1) {
				curr = curr.next;
				j++;
			}
			temp.next=curr.next;
			curr.next=temp;
			
			}
		}
		catch(NullPointerException n) {
			throw new IndexOutOfBoundsException();
//			System.err.println(new IndexOutOfBoundsException().toString());
			}
	}
	void addAll(int ar[]) {
	    	for(int ele:ar) {
	    		add(ele);
	    	}
    }
	void addAll(LinkedList ll) {
	    	Node curr = this.head;
	    	while(curr.next!=null) {
	    		curr=curr.next;
	    	}
	    	curr.next=ll.getNode();
	}
	private Node getNode() {
	    	return this.head;
	}
	void removeLastElement() {

		if(head==null);
		else if(head.next==null) {
			head =null;
		}
		else if(head.next!=null) {
			Node curr=head.next;
			while(curr.next.next!=null) {
				curr = curr.next;
			}
			curr.next=null;
		}
	}
 
    int indexOf(int e) {
    	int i=0;
    	Node curr=head;
    	while(curr!=null) {
    		if(curr.data==e)return i-1;
    		curr=curr.next;
    		i++;
    	}
    	return -1;
    }
    void removeFirst() {
    	if(head==null);
    	else if(head.next==null)head=null;
    	else head=head.next;
    }
    int lastIndexOf() {
    	Node curr=head;
    	if(head==null)return -1;
    	int lastindex=0;
    	while(curr!=null) {
    		lastindex++;
    		curr=curr.next;
    	}
    	return lastindex-1;
    }
    int sizeOf() {
    	return lastIndexOf()+1;
    }
    public boolean linkedListIntersection(LinkedList l2) {
    	Node n1 = this.getNode();
    	Node n2 = l2.getNode();
    	while(true) {
    		if(n1==null)n1=getNode();
    		if(n2==null)n2=l2.getNode();
    		if(n1==n2)return true;
    		n1=n1.next;
    		n2=n2.next;
    	}
    }
    public boolean isCyclic() {
    	Node n1 = this.getNode();
    	Node n2 = n1;
    	while(n2!=null) {
    		n1=n1.next;
    		n2=n2.next.next;
    		if(n1==n2)return true;
    	}
    	return false;
    }
    public void linkNode(int i) {
    	Node node=null;
    	Node temp=this.getNode();
    	while(temp.next!=null) {
    		if(i-->0) {
    			node=temp;	
    		}
    		temp=temp.next;
    	}
    	temp.next=node;
    }
    public int getNodeLink() {
    	Node n1 = this.getNode();
    	Node n2=n1;
    	Node temp=n1;
    	if(isCyclic()) {
    	    while(true) {
    	    	n1=n1.next;
        		n2=n2.next.next;
        		if(n1==n2)break;
    	    }
    	    while(true) {
    	     	n1=n1.next;
    	     	temp=temp.next;
    	     	if(n1==temp)return n1.data;
    	    }
    	}
    	return temp.data;
    }
    public void reverse() {
    	Node curr = this.getNode();
    	Node head=curr;
    	Node n1=curr.next;
    	Node n2=n1.next;
    	while(true) {
    		  n1.next=curr;
    		  curr=n1;
    		  n1=n2;
    		  if(n1==null)break;
    		  n2=n2.next;
    	}
        this.head=curr;
        head.next=null;
    }
    public void reverse(int i) {
    	Node curr=this.head;
    	if(i==0) {
    		reverse();
    		return;
    	}
        while(i-->1)curr=curr.next;
        if(curr==null||curr.next==null)throw new ArrayIndexOutOfBoundsException();
        Node temp=curr;
        curr=curr.next;
        Node n1=curr.next;
        if(n1==null)return;
        Node n2=n1.next;
        temp.next=null;
        curr.next=null;
        while(true) {
        	n1.next=curr;
        	curr=n1;
        	n1=n2;
        	if(n1==null)break;
        	n2=n2.next;
        }
    	temp.next=curr;
    	
    }
    public boolean isPalimdrome() {
    	
    	Node head1=this.head;
    	Node head2=head1.next;
    	Node prev=null;
    	if(head2==null)return true;
    	else if(head2.next==null) {
    		return head1.data==head2.data;
    	}
    	else if(head2.next.next==null) {
    		return head1.data==head2.next.data;
    	}
    	while(true) {
    		if(head1==null)break;
    		prev=head1;
    		head1=head1.next;
    		if(head2==null||head2.next==null)break;
    		head2=head2.next.next;
    	}
    	prev.next=null;
    	Node n1=head1.next;
    	head1.next=null;
    	Node n2=n1.next;
    	while(true) {
    		n1.next=head1;
    		head1=n1;
    		n1=n2;
    		if(n1==null)break;
    		n2=n2.next;
    	}
    	Node head=this.head;
    	while(head!=null&&head1!=null) {
    		if(head.data!=head1.data)return false;
    		head=head.next;
    		head1=head1.next;
    	}
    	return true;
    }
    
    public Node mergeSortedLists(Node head,Node head1) {
    	
    	Node temp = new Node(0);
    	head.next=null;
    	Node res=temp;
    	while(head1!=null&&head!=null) {
    		if(head.data<head1.data){
    			temp.bottom=head;
    			temp=temp.bottom;
    			head=head.bottom;
    		}
    		else {
    			temp.bottom=head1;
    			temp=temp.bottom;
    			head1=head1.bottom;
    		}
    	}
    	if(head!=null)temp.bottom=head;
    	else temp.bottom=head1;
    	return res.bottom;
    }
    public void flatList() {
    	flat(this.head);
    	return;
    }
    public void flat(Node head) {
    	Node temp=head;
    	if(head.next==null) return;
    	    flat(head.next);
    	    temp = mergeSortedLists(temp,temp.next);
    	
    }
    public void rotateList(int k) {
    	
    	Node head=this.head;
    	int count=0;
    	while(head.next!=null) {
    		head=head.next;
    		count++;
    	}
    	head.next=this.head;
    	count-=k;
    	head=this.head;
    	while(count-->0) {
    		head=head.next;
    	}
    	this.head=head.next;
    	head.next=null;
    }
}

public class LikedList {
	public static void main(String[] args) {
		
	    LinkedList ll = new LinkedList();
	    LinkedList l2 = new LinkedList();
	    LinkedList l3 = new LinkedList();
	    ll.add(1);
	    ll.add(2);
	    ll.add(3);
	    ll.add(3);
	    ll.add(2);
	    ll.add(1);
	    
	    l2.add(6);
	    l2.add(7);
	    l2.add(8);
	    l2.add(9);
	    
	    l3.add(10);
	    l3.add(11);
	    l3.add(12);
	    
//	    ll.addAll(l3);
//	    l2.addAll(l3);
//	    ll.print();
//	    l2.print();
	    
//	    System.out.println(ll.linkedListIntersection(l2));
//	    ll.print();
//	    ll.linkNode(5);
//	    System.out.println(ll.getNodeLink());
	    
//	    ll.reverse(3);
//	    ll.print();
	    
//	    ll.print();
//	    System.out.println(ll.isPalimdrome());  
	    
	    LinkedList fl = new LinkedList();
	    
	    fl.add(5);
	    fl.addBottom(7, 0);
	    fl.addBottom(8, 0);
	    fl.addBottom(30, 0);
	    
	    fl.add(10);
	    fl.addBottom(20, 1);
	    
	    fl.add(19);
	    fl.addBottom(22, 2);
	    fl.addBottom(50, 2);
	    
	    fl.add(28);
	    fl.addBottom(35, 3);
	    fl.addBottom(40, 3);
	    fl.addBottom(45, 3);
	    
//	    fl.print();
//	    fl.printAll();
//	    fl.flatList();
//	    System.out.println("List is flatenned");
//	    fl.printAll();
	    
	    LinkedList li = new LinkedList();
	    li.add(1);
	    li.add(2);
	    li.add(3);
	    li.add(4);
	    li.add(5);
	    li.print();
	    li.rotateList(2);
	    li.print();
	    
	}
}










