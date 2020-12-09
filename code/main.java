
public class main {
	public static void main(String args[]) {
		IntGraphList graph = new IntGraphList() ; 
		
		graph.addVertex(0) ; 
		graph.addVertex(1);
		graph.addVertex(2); 
		graph.addVertex(3);
		graph.addVertex(4); 
		graph.addVertex(5);
		graph.addVertex(6);
		graph.addVertex(7);
		graph.addVertex(8);
		graph.addVertex(9);
		graph.addVertex(10);
		graph.addVertex(11);
		
		
		graph.addEdge(0,1) ; 
		graph.addEdge(0,2) ;
		graph.addEdge(1,2) ;
		graph.addEdge(1,3) ;
		graph.addEdge(2,3) ;
		graph.addEdge(4,5);
		graph.addEdge(4,6);
		graph.addEdge(4,7);
		graph.addEdge(4,11);
		graph.addEdge(5,6);
		graph.addEdge(5,8);
		graph.addEdge(6,8);
		graph.addEdge(4,11);
		graph.addEdge(6,10);
		graph.addEdge(7,10);
		graph.addEdge(7,11);
		graph.addEdge(7,10);
		graph.addEdge(9,11);
		
		
		
		BFSTree bs = new BFSTree(graph , 2); 
		
		System.out.println("to 0 " +bs.getDistanceTo(0)) ;
		System.out.println("to 1 " +bs.getDistanceTo(1)) ;
		System.out.println("to 2 " +bs.getDistanceTo(2)) ; 
		System.out.println("to 3 " +bs.getDistanceTo(3)) ; 
		System.out.println("to 4 " +bs.getDistanceTo(4)) ;
		System.out.println("to 5 " +bs.getDistanceTo(5)) ;
		System.out.println("to 6 " +bs.getDistanceTo(6)) ; 
		System.out.println("to 7 " +bs.getDistanceTo(7)) ; 
		System.out.println("to 8 " +bs.getDistanceTo(8)) ;
		System.out.println("to 9 " +bs.getDistanceTo(9)) ;
		System.out.println("to 10 " +bs.getDistanceTo(10)) ; 
		System.out.println("to 11 " +bs.getDistanceTo(11)) ; 
		
		IntGraphList graph2 = new IntGraphList() ;
		graph2.addVertex(0);
		graph2.addVertex(1);
		graph2.addVertex(2);
		graph2.addVertex(3);
		
		graph2.addEdge(0, 1);
		graph2.addEdge(0, 2);
		graph2.addEdge(0, 3);
		graph2.addEdge(1, 2);
		graph2.addEdge(1, 3);
		graph2.addEdge(2, 3);
		
		BFSTree bs2 = new BFSTree(graph2 , 0) ;
		System.out.println("to 0 " +bs2.getDistanceTo(0)) ;
		System.out.println("to 1 " +bs2.getDistanceTo(1)) ;
		System.out.println("to 2 " +bs2.getDistanceTo(2)) ; 
		System.out.println("to 3 " +bs2.getDistanceTo(3)) ; 
			
		
		
	}
}
