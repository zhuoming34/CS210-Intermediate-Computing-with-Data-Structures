package edu.umb.cs210.p6;

import dsa.DiGraph;
import dsa.LinkedQueue;
import dsa.SeparateChainingHashST;
import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

// An immutable data type for computing shortest common ancestors.
public class ShortestCommonAncestor {
    ...

    // Construct a ShortestCommonAncestor object given a rooted DAG.
    public ShortestCommonAncestor(DiGraph G) {
        ...
    }

    // Length of the shortest ancestral path between v and w.
    public int length(int v, int w) {
        ...
    }

    // Shortest common ancestor of vertices v and w.
    public int ancestor(int v, int w) {
        ...
    }

    // Length of the shortest ancestral path of vertex subsets A and B.
    public int length(Iterable<Integer> A, Iterable<Integer> B) {
       ...
    }

    // A shortest common ancestor of vertex subsets A and B.
    public int ancestor(Iterable<Integer> A, Iterable<Integer> B) {
        ...
    }

    // Helper: Return a map of vertices reachable from v and their 
    // respective shortest distances from v.
    private SeparateChainingHashST<Integer, Integer> distFrom(int v) {
        ...
    }

    // Helper: Return an array consisting of a shortest common ancestor a 
    // of vertex subsets A and B, and vertex v from A and vertex w from B 
    // such that the path v-a-w is the shortest ancestral path of A and B.
    private int[] triad(Iterable<Integer> A, Iterable<Integer> B) {
        ...
    }

    // helper method that produces a defensive copy of G
    private DiGraph defensiveCopy(DiGraph g) {
        DiGraph copy = new DiGraph(g.V());
        for (int from = 0; from < g.V(); from++) {
            for (int to : g.adj(from)) {
                copy.addEdge(from, to);
            }
        }
        return copy;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        In in = new In(args[0]);
        DiGraph G = new DiGraph(in);
        in.close();
        ShortestCommonAncestor sca = new ShortestCommonAncestor(G);
        while (!StdIn.isEmpty()) {
            int v = StdIn.readInt();
            int w = StdIn.readInt();
            int length   = sca.length(v, w);
            int ancestor = sca.ancestor(v, w);
            StdOut.printf("length = %d, ancestor = %d\n", length, ancestor);
        }
    }
}
