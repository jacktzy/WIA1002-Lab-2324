package Lab8;// WIA/WIB1002 Data Structures
// part of Graphs implementation using List

class Graph<T extends Comparable<T>> extends WeightedGraph<T, Integer> {

    public boolean addEdge(T source, T destination) {
        return super.addEdge(source, destination, 1);
    }

    public boolean addUndirectedEdge(T v1, T v2) {
        return addUndirectedEdge(v1, v2, 1);
    }
}

