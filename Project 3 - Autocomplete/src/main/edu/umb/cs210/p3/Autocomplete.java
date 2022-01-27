package edu.umb.cs210.p3;

import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

import java.util.Arrays;
import java.util.Comparator;

// A data type that provides autocomplete functionality for a given set of 
// string and weights, using Term and BinarySearchDeluxe. 
public class Autocomplete {
    private Term[] terms;   // The set of terms

    // Initialize the data structure from the given array of terms.
    public Autocomplete(Term[] terms) {
        ...
    }

    // All terms that start with the given prefix, in descending order of
    // weight.
    public Term[] allMatches(String prefix) {
        ...
    }

    // The number of terms that start with the given prefix.
    public int numberOfMatches(String prefix) {
        ...
    }

    // Entry point. [DO NOT EDIT]
    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);
        int N = in.readInt();
        Term[] terms = new Term[N];
        for (int i = 0; i < N; i++) {
            long weight = in.readLong(); 
            in.readChar(); 
            String query = in.readLine(); 
            terms[i] = new Term(query.trim(), weight); 
        }
        int k = Integer.parseInt(args[1]);
        Autocomplete autocomplete = new Autocomplete(terms);
        StdOut.print("Enter a prefix: ");
        boolean firstLoop = true;
        while (StdIn.hasNextLine()) {
            String prefix = StdIn.readLine();
            Term[] results = autocomplete.allMatches(prefix);
            String msg = " matches, in descending order by weight:";
            if (results.length == 0) msg = "No matches";
            else if (results.length > k) msg = "First " + k + msg;
            else msg = "All" + msg;
            StdOut.printf("%s\n", msg);
            for (int i = 0; i < Math.min(k, results.length); i++) {
                StdOut.println(results[i]);
            }
            StdOut.print("\nEnter a prefix, or press <ctrl-d> to quit : ");
            if (firstLoop) {
                StdOut.print("\n(Unless you're using IntelliJ to run. Then the "
                        + "stop button will quit)\nThat prefix, please: ");
                firstLoop = false;
            }
        }
    }
}
