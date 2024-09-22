package Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BNode{
	int data;
	BNode left;
	BNode right;
	public BNode(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BinarySearchTree{ 
	BNode root;
	public void insert(int data) {
		root = add(root,data);
	}  
	public BNode add(BNode root,int data) {
		if(root==null) {
			root=new BNode(data);
			return root;
		}
		else if(data<root.data) {
			root.left = add(root.left,data);
		}
		else {
			root.right = add(root.right,data);
		}
		return root;
	}	
	void print() {
		BNode temp=root;
		inOrder(temp);
	}
    void inOrder(BNode root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
    boolean checkValidBST() {
    	BNode temp =root;
    	boolean b=true;;
    	return check(temp,b);
    }
    
    boolean check(BNode temp,boolean b) {
    	BNode root=temp;
    	if(temp.left==null||temp.right==null)return true;
    	if((temp.left.data>temp.data && root.data<temp.data )&&
    	   (root.data<temp.data && temp.right.data<temp.data))return false;
    	if(b)b = check(temp.left,b);
    	else return false;
    	if(b)b=check(temp.right, b);
    	else return false;
    	return b;
    }
    boolean searchKey(int key) {
    	BNode bn = search(root,key);
    	return bn.data==key;
    }
    BNode search(BNode temp,int key) {
    	
    	if(temp==null||temp.data==key)return temp;
    	if(key<temp.data)return search(temp.left, key);
    	else return search(temp.right, key);
    }
}

public class BST {
	public static void main(String[] args) {
		
	    BinarySearchTree bst = new BinarySearchTree();
	    bst.insert(6);
	    bst.insert(4);
	    bst.insert(2);
	    bst.insert(5);
	    bst.insert(8);
	    bst.insert(7);
	    bst.insert(9);
	    bst.insert(3);
//        System.out.println(bst.searchKey(5));
        System.out.println(bst.checkValidBST());
 
	}
}












