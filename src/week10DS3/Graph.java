package week10DS3;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph <N>{
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }

    private void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    @Override
    public String toString(){
        return this.adjacencyList.toString();
    }

    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge("BUF","WDC");
        graph.addEdge("TOR","BUF");
        graph.addEdge("BUF","TOR");
        graph.addEdge("JFK","BUF");
        graph.addEdge("WDC","JFK");
        graph.addEdge("WDC","BUF");
        System.out.println(graph);
    }
}
