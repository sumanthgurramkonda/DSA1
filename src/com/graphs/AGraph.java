package com.graphs;
class AGraph{

	int matrix[][];
	public AGraph(int size) {
		this.matrix = new int[size][size];
	}
	public void addEdge(int n1,int n2) {
		this.matrix[n1][n2]=1;
		this.matrix[n2][n1]=1;
	}	
	
	public int noOfIslands(char ar[][]){
		int m=ar.length;
		int n=ar[0].length;
		boolean b[][] = new boolean[m][n];
		int noOfIslands =0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(!b[i][j]&&ar[i][j]=='1') {
				dfs(i,j,ar,b);
				noOfIslands++;
				}
			}
		}
    return noOfIslands;
	}
	public void dfs(int i,int j,char ar[][],boolean b[][]) {
		
		if(i<0||j<0||
		   i>=ar.length||j>=ar[0].length||
		   ar[i][j]=='0'||b[i][j])return;
		dfs(i,j-1,ar,b); //go left
		dfs(i-1,j,ar,b); //go up
		dfs(i,j+1,ar,b); //go right
		dfs(i+1,j,ar,b); //go down
		
	}
}













