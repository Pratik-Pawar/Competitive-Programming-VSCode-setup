package Lib;

import java.util.LinkedList;

class Node {

    LinkedList<Node> adjList = new LinkedList<>();
    int id;
    boolean lock = false;

    public Node(int id) {
        this.id = id;
    }

    public Node() {
        this.id = 0;
    }

    void addAdj1D(Node n) {
        this.adjList.add(n);

    }

    void addAdj2D(Node n) {
        this.adjList.add(n);
        n.adjList.add(this);

    }

    static void DFS(Node node) {
        if (node == null || node.lock) {
            return;
        }
        node.lock = true;
        for (Node adj : node.adjList) {

            DFS(adj);
        }

        //Write Task Here
    }

}
