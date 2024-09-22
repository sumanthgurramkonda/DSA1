package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
	int data;
	Node right;
	Node left;
	Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class Tree{
	static void level(Node root) {
		if(root==null)return;
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null) q.offer(temp.left);
			if(temp.right!=null) q.offer(temp.right);
		}
		
	}
	static void inOrder(Node root) {
		
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	static void itrInOrder(Node root) {
		
		if(root==null)return;
		Stack<Node> st = new Stack<>();
		while(!st.isEmpty()||root!=null) {
			if(root!=null) {
				st.push(root);
				root=root.left;
			}
			else {
				root=st.pop();
				System.out.print(root.data+" ");
				root=root.right;
			}
		}
	}
	static void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	static void itrPreOrder(Node temp) {
		if(temp==null)return;
		Stack<Node> st = new Stack<>();	
		st.push(temp);
		while(!st.isEmpty()) {
			temp = st.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)st.push(temp.right);
			if(temp.left!=null)st.push(temp.left);
		}
		
	}
	static void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	static void itrPostOrder(Node root) {
		Node curr=root;
		Stack<Node> st = new Stack<>();
		while(!st.isEmpty()||curr!=null) {
		     if(curr!=null) {
			     st.push(curr);
			     curr=curr.left;
		     }
		     else{
		    	 Node temp = st.peek().right;
		    	 if(temp==null) {
		    		 temp=st.pop();
		    		 System.out.print(temp.data+" ");
		    		 while(!st.isEmpty() && temp==st.peek().right) {
		    			 temp=st.pop();
		    			 System.out.print(temp.data+" ");
		    		 }
		    	 }
		    	 else {
			    	 curr=temp;
			     }
		     }		    
		}
		 
	}
	static int lh=0;
	static int rh = 0;
	static int heightOfBin(Node root) {
		if(root==null)return 0;
		else {
			lh = heightOfBin(root.left);
			rh = heightOfBin(root.right);
			if(lh>rh)return lh+1;
			else return rh+1;
		}
	}
    static void printDist(Node root,int k) {
    	if(root!=null) {
    	if(k==0)System.out.print(root.data+" ");
    	else {
    		printDist(root.left,k-1);
    		printDist(root.right,k-1);
    		
    	}
    	}
    }
    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<Node>();
       
    	if(root!=null) {
    		 q.add(root);
    		while(q.size()>0) {
    		   Node curr = q.poll();
    	       System.out.print(curr.data+" ");
    	       if(curr.left!=null) q.add(curr.left);
    	       if(curr.right!=null) q.add(curr.right);
    		}
    	}  
    }

    static int size(Node root) {
    	if(root==null)return 0;
    	else {
    		int s1 = size(root.left);
    		int s2 = size(root.right);
    		return s1+s2+1;
    	}
    }
    static int max(Node root) {
    	
    	if(root==null)return Integer.MIN_VALUE;
    	else {
    		int leftmax = max(root.left);
    		int rightmax = max(root.right);
    		return Math.max(root.data,Math.max(leftmax, rightmax));
    	}
    }
    public static boolean checkSymmetry(Node root) {
    	if(root==null)return true;
    	Stack<Node> stack = new Stack<>();
    	stack.push(root.left);
    	stack.push(root.right);
    	while(!stack.isEmpty()) {
    		Node Left = stack.pop();
    		Node Right = stack.pop();
    		if(Left==null || Right==null) continue;
    		if(Left==null  || Right==null || 
    		   Left.data!=Right.data)return false;
    		stack.push(Left.left);
       		stack.push(Right.right);
       		stack.push(Left.right);
       		stack.push(Right.left);
    		}
    	return true;
    }
}

public class BinaryTree {
	 public static  void main(String[] args) {
		
		Node temp;
		temp = new Node(10);
		temp.left= new Node(20);
		temp.left.left = new Node(40);
		temp.right = new Node(30);
		temp.right.left = new Node(50);
		temp.right.right = new Node(100);
		
		System.out.println(Tree.max(temp));
		
		Node temp1;
		temp1 = new Node(10);
		temp1.left = new Node(20);
		temp1.left.left = new Node(25);
		temp1.left.right = new Node(35);
		temp1.left.right.left = new Node(55);
		temp1.left.right.right = new Node(60);
		temp1.right = new Node(30);
		temp1.right.left = new Node(45);
		temp1.right.left.right = new Node(65);
		temp1.right.right = new Node(50);
		temp1.right.right.left = new Node(80);
		
		Node temp2;
		temp2=new Node(1);
		temp2.right=new Node(2);
		temp2.left=new Node(2);
		temp2.right.right=new Node(3);
		temp2.right.left=new Node(4);
		temp2.left.right=new Node(4);
		temp2.left.left=new Node(3);
		System.out.println(Tree.checkSymmetry(temp2));
//		Tree.level(temp1);
//		Tree.postOrder(temp1);
//		System.out.println();
//		Tree.itrPostOrder(temp1);
		
		
		
//		Tree.inOrder(temp1);
//		System.out.println();
//		Tree.itrInOrder(temp1);
		
//		Tree.itrPreOrder(temp1);
//		System.out.println();
//		Tree.preOrder(temp1);


//		System.out.println(Tree.heightOfBin(temp1));
//		System.out.println();
//		Tree.printDist(temp1,3);
//		System.out.println();
//		Tree.levelOrder(temp1);
//		System.out.println();
//		System.out.println(Tree.size(temp1));
//		System.out.println(Tree.max(temp1));
	}

}
