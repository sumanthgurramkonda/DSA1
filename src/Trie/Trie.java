package Trie;


public class Trie {
	private TrieNode root;
	public Trie() {
		root = new TrieNode();
	}
	class TrieNode{
		private TrieNode[] children;
		private boolean isWord;
		public  TrieNode() {
			this.children = new TrieNode[26];
			this.isWord = false;
		}
	}
	public void isert(String word) {
		word = word.toLowerCase();
		TrieNode curr = root;
		for(int i=0;i<word.length();i++) {
			int index = word.charAt(i)-'a';
			if(curr.children[index]==null) {
				TrieNode node = new TrieNode();
				curr.children[index]=node;
				curr=node;
			}
			else curr=curr.children[index];
		}
		root.isWord=true;
	}
	public boolean search(String word) {
		TrieNode curr = root;
		word = word.toLowerCase();
		for(int i=0;i<word.length();i++) {
			int index = word.charAt(i)-'a';
			if(curr.children[index]!=null)curr=curr.children[index];
			else return false;
		}
		return true;
	}
	public void print() {
		TrieNode curr = root;
		printAll(curr);
	}
	public void printAll(TrieNode curr) {
		if(curr==null)return;
		int i=0;
		while(curr.children[i]==null&&i<26)i++;
		System.out.print((char)('a'+i)+" ");
		printAll(curr.children[i]);
	}

}









