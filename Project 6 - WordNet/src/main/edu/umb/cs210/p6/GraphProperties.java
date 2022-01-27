package edu.umb.cs210.p6;

import dsa.BreadthFirstPaths;
import dsa.Graph;
import dsa.LinkedQueue;
import stdlib.In;
import stdlib.StdOut;
import stdlib.StdStats;

public class GraphProperties {
    private int[] eccentricities;
    private int diameter;
    private int radius;
    private LinkedQueue<Integer> centers;

    // Calculate graph properties for the graph G.
    public GraphProperties(Graph G) {
// *******YOU DO NOT NEED TO CHECK THIS CORNER CASE:
//      throw new IllegalArgumentException("G is not connected");
// ****** Ignore the corner case requirement for this problem ***************

        ...
    }
    
    // Eccentricity of v.
    public int eccentricity(int v) {
        ...
    }

    // Diameter of G.
    public int diameter() {
        ...
    }

    // Radius of G.
    public int radius() {
        ...
    }

    // Centers of G.
    public Iterable<Integer> centers() {
        ...
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        In in = new In(args[0]);
        Graph G = new Graph(in);
        GraphProperties gp = new GraphProperties(G);
        StdOut.println("Diameter = " + gp.diameter());
        StdOut.println("Radius   = " + gp.radius());
        StringBuilder centers = new StringBuilder();
        for (int v : gp.centers()) centers.append(v).append(" ");
        StdOut.println("Centers  = " + centers.toString());
    }
}
