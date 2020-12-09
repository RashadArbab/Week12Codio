import java.util.HashMap ; 
import java.util.LinkedList; 
import java.util.Queue; 

public class BFSTree {
    // TODO: consider what fields you might want
    // Hint: probably not (just) a graph and source vertex
    
    // TODO: implement constructor
    
    // TODO: implement getDistanceTo method
	
    private IntGraph graph; 
    private int source ; 
    private HashMap<Integer , Integer> distances; 
    private HashMap<Integer, Integer> parents ; 
    
    public BFSTree(IntGraph graph, int source){
        this.graph = graph ;
        this.source = source; 
        
        initialize(); 
    }
    
    private void initialize() {
    	
    	for(Integer node : graph.getVertices()) {
    		distances.put(node, -1); 
    		parents.put(node, null); 
    		
    	}
    	
        Queue<Integer> q = new LinkedList<Integer>();
        distances.put(source, 0); 
        q.add(source) ; 
        
        
        while (!q.isEmpty()) {
        	//set source to u, 
        	//remove u from the queue 
        	//go through every connection that u has
        	int u = q.remove(); 
        	for(int v : graph.getAdjacencyList(u)) {
        		if(distances.get(v) == -1) {
        			distances.replace(v , distances.get(u) +1) ; 
        			parents.replace(v, u); 
        			q.add(v); 
        		}
        	}
        	
        }
    }
    
    
    
	
}
