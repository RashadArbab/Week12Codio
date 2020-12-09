import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.lang.IllegalArgumentExeption ; 

/**
 * This class represents a graph stored using adjacency
 * lists for each vertex.
 * 
 * @author Mark Hancock
 * @author <your name can go here>
 */
public class IntGraphList extends IntGraph {
    /**
     * A map of adjacency lists for each vertex.
     */
    public Map<Integer, LinkedList<Integer>> adjacencyList;

    /**
     * Creates a new empty graph.
     */
    public IntGraphList() {
        // use a TreeMap to ensure adjacency lists are stored in
        // ascending order.
        adjacencyList = new TreeMap<Integer, LinkedList<Integer>>();
    }
    
    public int getDegree(int vertex) throws IllegalArgumentException{
        if (adjacencyList.containsKey(vertex)){
            LinkedList<Integer> vert = adjacencyList.get(vertex) ; 
            return vert.size();        
        }
        else {
           throw new IllegalArgumentException("does not contain the vertex") ; 
        
        }
    }
    
    public int getNumEdges(){
    	Collection <LinkedList<Integer>> values = adjacencyList.values(); 
    	int edges = 0; 
    	for (LinkedList<Integer> value : values) {
    		edges += value.size(); 
    	}
    	return edges/2; 
    }

    /**
     * Creates a new graph with vertices numbered 0 to
     * numVertices - 1.
     * 
     * @param numVertices the number of vertices to add to this
     *                    graph on creation
     */
    public IntGraphList(int numVertices) {
        this();
        for (int i = 0; i < numVertices; i++) {
            addVertex(i);
        }
    }

    /**
     * Adds a vertex with a value to this graph.
     * 
     * @param value the integer value of this vertex
     * @throws IllegalArgumentException if this vertex value has
     *                                  been added before
     */
    @Override
    public void addVertex(int value) {
        if (hasVertex(value)) {
            throw new IllegalArgumentException(
                    value + " is already in the graph");
        }
        adjacencyList.put(value, new LinkedList<Integer>());
    }

    /**
     * Adds an edge from first to second to this graph.
     * 
     * @param first  the first vertex in the edge
     * @param second the second vertex in the edge
     * 
     * @throws IllegalArgumentException if either first or
     *                                  second are not vertices
     *                                  in the graph.
     */
    @Override
    public void addEdge(int first, int second) {
        checkVertex(first);
        checkVertex(second);
        adjacencyList.get(first).add(second);
        adjacencyList.get(second).add(first);
    }

    /**
     * Returns the number of vertices in this graph.
     * 
     * @return the number of vertices in this graph.
     */
    @Override
    public int getNumVertices() {
        return adjacencyList.size();
    }

    /**
     * Returns an adjacency list for vertex v.
     * 
     * @param v the vertex for which to retrieve the adjacency
     *          list
     * @return an adjacency list for vertex v.
     */
    @Override
    public List<Integer> getAdjacencyList(int v) {
        checkVertex(v);
        return Collections.unmodifiableList(adjacencyList.get(v));
    }

    /**
     * Returns the set of vertices in this graph.
     * 
     * @return the set of vertices in this graph.
     */
    @Override
    public Set<Integer> getVertices() {
        return Collections.unmodifiableSet(adjacencyList.keySet());
    }

    /**
     * Checks if this vertex is in the graph and returns true if
     * it is, false if it is not.
     * 
     * @param v the vertex to check
     * @return true if vertex v is in the graph, false
     *         otherwise.
     */
    @Override
    public boolean hasVertex(int v) {
        return adjacencyList.containsKey(v);
    }

    /**
     * Helper function to check if this vertex is in the graph
     * and throw an error if not.
     * 
     * @param v the vertex to check.
     */
    private void checkVertex(int v) {
        if (!hasVertex(v)) {
            throw new IllegalArgumentException(
                    "vertex " + v + " is not in the graph");
        }
    }
    
 
}