package datastructure.graph;

public class DegreeOfVertex {

	static class Graph {
		int v,e;
		int[][] dir;
	
		Graph(int v, int e) {
			this.v = v;
			this.e = e;
			dir = new int[v][];
			for (int i=0; i<v;i++) {
				dir[i] = new int[v];
			}
		}
	}
	
	static Graph createGraph(int v, int e) {
		
		Graph g = new Graph(v, e);
		
		/* 	0-----1 
        	| \   | 
        	|  \  | 
        	|   \ | 
        	2-----3 */
		
		//direction from 0 
		g.dir[0][1] =1;
		g.dir[0][2] =1;
		g.dir[0][3] =1;
		
		 //direction from 1 
		g.dir[1][0] =1;
		g.dir[1][3] =1;
		
		 //direction from 2
		g.dir[2][0] =1;
		g.dir[2][3] =1;
		
		 //direction from 3 
		g.dir[3][0] =1;
		g.dir[3][2] =1;
		g.dir[3][1] =1;
		
		return g;
	}

	public static int findDegree(Graph g , int ver) {
		int degree =0;
		for (int i=0;i<g.v;i++) {
			if  (g.dir[ver][i] == 1) {
				degree++;
			}
		}
		return degree; 
	}
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph(4,5);
		
		int ver = 0; 
        
        // Function calling 
        int degree = findDegree(g, ver); 
        System.out.println(degree); 
	}

}
