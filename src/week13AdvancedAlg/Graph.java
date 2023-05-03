package week13AdvancedAlg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N>{
    private HashMap<N, ArrayList<Edge<N>>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    public boolean areConnected(N from,N to){
        if(this.adjacencyList.containsKey(from)){
            for (Edge edge :this.adjacencyList.get(from)){
                if (edge.getEnd().equals(to)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean validPath(ArrayList<N> path){
        for (int x=0;x<path.size()-1;x++){
            if (!areConnected(path.get(x),path.get(x+1))){
                return false;
            }
        }
        return true;
    }

    private void addNode(N a){
        if (!this.adjacencyList.containsKey(a)){
            this.adjacencyList.put(a,new ArrayList<>());
        }
    }
    public void addEdge(Edge<N> edge){
        N from= edge.getStart();
        N to= edge.getEnd();
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(edge);
    }
    @Override
    public String toString(){
        return this.adjacencyList.toString();
    }
    public N mostIncomingConnections(){
        HashMap<N, Integer> incoming=new HashMap<>();
        for (ArrayList<Edge<N>> destinations: this.adjacencyList.values()){
            for (Edge<N> to: destinations){
                if(!incoming.containsKey(to.getEnd())){
                    incoming.put(to.getEnd(),1);
                } else {
                    incoming.put(to.getEnd(), incoming.get(to.getEnd())+1);
                }
            }
        }
        int max=-1;
        N best=null;
        for (N node: incoming.keySet()){
            int count=incoming.get(node);
            if(count>max){
                max=count;
                best=node;
            }
        }
        return best;
    }
    public double costOfPath(ArrayList<N> path,Cost findCost){
        if(validPath(path)){
            double cost=0;
            for (int i=0; i<path.size()-1; i++){
                N from=path.get(i);
                N to=path.get(i+1);
                for (Edge edge : this.adjacencyList.get(from)){
                    if(edge.getEnd().equals(to)){
                        cost+= findCost.cost(edge);
                    }
                }
            }
            return cost;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge(new Flight("BUF","WDC",199,350,3.5));
        graph.addEdge(new Flight("TOR","BUF",329,380,3.0));
        graph.addEdge(new Flight("BUF","TOR",495,220,2.5));
        graph.addEdge(new Flight("JFK","BUF",129,450,7.5));
        graph.addEdge(new Flight("WDC","JFK",147,500,3.2));
        graph.addEdge(new Flight("WDC","BUF",592,370,3.5));
        System.out.println(graph);

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","WDC","JFK"));
        System.out.println(graph.validPath(path1));
        FlightDistance dist=new FlightDistance();
        FlightPrice price=new FlightPrice();
        double distance=graph.costOfPath(path1,dist);
        System.out.println("distance: "+distance);
        double priceF= graph.costOfPath(path1,price);
        System.out.println("cost: $"+priceF);

        ArrayList<String> path2=new ArrayList<>(Arrays.asList("BUF","WDC","JFK","TOR"));
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3=new ArrayList<>(Arrays.asList("BUFFALO","WDC","JFK","TOR"));
        System.out.println(graph.validPath(path3));

        System.out.println(graph.mostIncomingConnections());
    }
}
