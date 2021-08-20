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
