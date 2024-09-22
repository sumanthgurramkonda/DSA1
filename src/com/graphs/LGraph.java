package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LGraph {
	
	LinkedList<Integer> []adj;
	int Vertices;
	public LGraph(int node) {
		this.Vertices=node;
		this.adj = new LinkedList[node];
		for(int i=0;i<node;i++) {
			this.adj[i]=new LinkedList<>();
		}
	}
	public void addEdge(int n1,int n2) {
		this.adj[n1].add(n2);
		this.adj[n2].add(n1);
	}
	public void bfs(int s) {
		boolean visited[]= new boolean[Vertices];
		Queue<Integer> q = new LinkedList<>();
		visited[s]=true;
		q.offer(s);
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.println(u+" ");
			for(int v : adj[u]) {
				if(!visited[v]) {
					visited[v]=true;
					q.offer(v);
				}
			}
		}		
	}
	public void dfs(int s) {
		boolean visited[]= new boolean[Vertices];
		Stack<Integer> st = new Stack<>();
		st.push(s);
		
		while(!st.isEmpty()) {
			int u = st.pop();
			if(!visited[u]) {
				visited[u]=true;
				System.out.println(u+" ");
				for(int v:adj[u]) {
					if(!visited[v])
					st.push(v);
				}
			}
		}
	}
	public void dfs() {
		boolean visited[]=new boolean[Vertices];
		int compid[]= new int[Vertices];
		int count=0;
		for(int i=0;i<Vertices;i++) {
			if(!visited[i]) {
				dfs(i,count,visited,compid);
				count++;
			}
		}
		System.out.println(count);
	}
	public void dfs(int v,int count,boolean visited[],int compid[]) {
		visited[v]=true;
		compid[v]=count;
	    System.out.println(v+" ");
		for(int w:adj[v]) {
			if(!visited[w])dfs(w,count, visited,compid);
		}
	}
	
	public void print() {
		for(int i=0;i<Vertices;i++) {
			System.out.print(i+" ");
			for(int j:adj[i]) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
//0 1 3 
//1 0 2 
//2 1 3 4 
//3 2 0 
//4 2 
//5 









