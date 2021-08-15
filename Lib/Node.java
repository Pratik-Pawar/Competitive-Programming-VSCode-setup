package Lib;

import java.util.LinkedList;

class Node {

    LinkedList<Node> adj = new LinkedList<>();
    int id;
    boolean lock = false;

    public Node(int id) {
        this.id = id;
    }

    public Node() {
        this.id = 0;
    }

    void addAdj1D(Node n) {
        this.adj.add(n);

    }

    void addAdj2D(Node n) {
        this.adj.add(n);
        n.adj.add(this);

    }

    static void DFS(Node node) {
        if (node == null || node.lock) {
            return;
        }
        node.lock = true;
        for (Node adj : node.adj) {

            DFS(adj);
        }

        //Write Task Here
    }

}
