package edu.umb.cs210.p6;

import dsa.DiGraph;
import dsa.LinkedQueue;
import stdlib.In;
import stdlib.StdOut;

public class Degrees {
    private DiGraph G;
    private int[] outdegree;
    private int[] indegree;

    // Construct a Degrees object from a digraph G.
    public Degrees(DiGraph G) {
        setDegrees(G);
        ...
    }
    
    // Sources of G.
    public Iterable<Integer> sources() {
        ...
    }

    // Sinks of G.
    public Iterable<Integer> sinks() {
        ...
    }

    // Is G a map?
    public boolean isMap() {
        ...
    }

    // helper method calculates the in and out degrees of each vertex
    private void setDegrees(DiGraph g) {
        outdegree = new int[g.V()];
        indegree = new int[g.V()];
        for (int from = 0; from < g.V(); from++) {
            for (int to : g.adj(from)) {
                outdegree[from]++;
                indegree[to]++;
            }
        }
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        In in = new In(args[0]);
        DiGraph G = new DiGraph(in);
        Degrees degrees = new Degrees(G);

        StringBuilder sources = new StringBuilder();
        StringBuilder   sinks = new StringBuilder();
        for (int v : degrees.sources()) sources.append(v).append(" ");
        for (int v : degrees.sinks())     sinks.append(v).append(" ");

        StdOut.println("Sources = " + sources.toString());
        StdOut.println("Sinks   = " + sinks.toString());
        StdOut.println("Is Map  = " + degrees.isMap());
    }
}
