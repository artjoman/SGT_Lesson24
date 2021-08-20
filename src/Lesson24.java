import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson24 {

    public static void main(String[] args) {
        Graph myGraph = createGraph();

        // 1. Print all the vertices
        for (Vertex myVertex : myGraph.getAdjVertices().keySet()) {
            System.out.println(myVertex.label);
        }

        // 2. Create an Airport Graph
        Graph myAirportGraph = createAirportGraph();

        // 3. Print all the Airports
        for (Vertex myVertex : myAirportGraph.getAdjVertices().keySet()) {
            System.out.println(myVertex.label);
        }

        // 4. How many direct flights are there in Graph

        int flightCounter = 0;
        for (Vertex myVertex : myAirportGraph.getAdjVertices().keySet()) {
            for (Vertex flight : myAirportGraph.getAdjVertices(myVertex.label)
            ) {
                flightCounter++;
            }
        }
        System.out.println("There are " + flightCounter + " in total");

        // 5. Direct flights from Cape Town
        System.out.println("--- Direct Flights from Cape Town:");
        for (Vertex directFlight :
                myAirportGraph.getAdjVertices("Cape Town")) {
            System.out.println(directFlight.label);
        }

        // 6. Direct flights count from Jo'burg airport
        flightCounter = 0;
        System.out.println("--- Direct Flights count from Jo'Burg:");
        for (Vertex directFlight :
                myAirportGraph.getAdjVertices("Jo'Burg")) {
            flightCounter++;
        }

        System.out.println("Direct flights from Jo'Burg: " + flightCounter);

    }

    static Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }

    static Graph createAirportGraph() {
        Graph graph = new Graph();
        graph.addVertex("Jo'Burg");
        graph.addVertex("Livingstone");
        graph.addVertex("Victoria Falls");
        graph.addVertex("Harare");
        graph.addVertex("Windhoek");
        graph.addVertex("Mauritius");
        graph.addVertex("Durbs");
        graph.addVertex("East London");
        graph.addVertex("Cape Town");
        graph.addVertex("PE");
        graph.addEdge("Livingstone", "Jo'Burg");
        graph.addEdge("Victoria Falls", "Jo'Burg");
        graph.addEdge("Harare", "Jo'Burg");
        graph.addEdge("Mauritius", "Jo'Burg");
        graph.addEdge("Windhoek", "Jo'Burg");
        graph.addEdge("Durbs", "Jo'Burg");
        graph.addEdge("East London", "Jo'Burg");
        graph.addEdge("PE", "Jo'Burg");
        graph.addEdge("Cape Town", "Jo'Burg");
        graph.addEdge("Durbs", "Cape Town");
        graph.addEdge("Durbs", "PE");
        graph.addEdge("Cape Town", "East London");
        graph.addEdge("PE", "Cape Town");


        return graph;
    }

}
