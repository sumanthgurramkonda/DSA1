package com.graphs;

public class Graphs  {

	public static void main(String[] args) {
		
		AGraph Ag = new AGraph(4);
		Ag.addEdge(0,1);
		Ag.addEdge(1,2);
		Ag.addEdge(2,3);
		Ag.addEdge(3,0);
		LGraph lg = new LGraph(6);
		lg.addEdge(0,1);
		lg.addEdge(1,2);
		lg.addEdge(2,3);
		lg.addEdge(3,0);
		lg.addEdge(2,4);
//		lg.bfs(0);
		
//		lg.dfs(0);
//		lg.dfs();
		LGraph lg1 = new LGraph(6);
		lg1.addEdge(0,1);
		lg1.addEdge(0,3);
		lg1.addEdge(2,4);
//		lg1.dfs();
		
		char ar[][]= {
				{'1','1','0','0'},
				{'1','0','0','0'},
				{'0','0','1','0'},
				{'0','0','0','1'} };
		
		System.out.println(Ag.noOfIslands(ar));
			
		
		
	}
}
