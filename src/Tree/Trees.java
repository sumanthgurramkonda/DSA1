package Tree;

class Node<T>{
    T data;
	Node right;
	Node left;
	public Node(T data) {
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class Tree<T>{
	private Node root;
	boolean b=true;
	Node l = null;
	Node r = null;
	void add(T data) {
		if(root==null) {
			root = new Node<T>(data);
			l=root;
			r=root;
		}
		else {
			if(b) {
			l.left = new Node<T>(data);
			l=l.left;
			b=false;
			}
			else {
			    r.right = new Node<T>(data);
				r=r.right;
				b=true;
			}
		}
	}
	T get() {
		return (T) root.data;
	}
}

public class Trees {
	public static void main(String[] args) {
		
		Tree<Integer> t = new Tree<Integer>();
		t.add(10);
		t.add(11);
		t.add(12);
		t.add(13);
		t.add(14);
        System.out.println(t.get());
		
	}

}
