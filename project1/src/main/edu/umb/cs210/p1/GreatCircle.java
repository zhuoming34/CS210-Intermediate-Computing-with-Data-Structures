package edu.umb.cs210.p1;

import stdlib.StdOut;

public class GreatCircle {
    // calculates the great circle distance given two sets of coordinates
    protected static double calculateGreatCircleDistance(String[] args) {
        // Get angles lat1, lon1, lat2, and lon2 from command line as
        // doubles.
        ...

        // Convert the angles to radians.
        ...

        // Calculate great-circle distance d.
        ...

        // Return d.
        ...
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        StdOut.println(GreatCircle.calculateGreatCircleDistance(args));
    }
}
