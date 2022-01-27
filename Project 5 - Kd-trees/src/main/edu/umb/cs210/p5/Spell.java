package edu.umb.cs210.p5;

import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

public class Spell {
    public static void main(String[] args) {
        In in = new In(args[0]);
        String[] lines = in.readAllLines();
        in.close();

        // Create an RefArrayST<String, String> object called st.
        ...

        // For each line in lines, split it into two tokens using
        // "," as delimiter; insert into st the key-value pair
        // (token 1, token 2).
        ...
            
        // Read from standard input one line at a time; increment
        // a line number counter; split the line into words using
        // "\\b" as the delimiter; for each word in words, if it
        // exists in st, write the (misspelled) word, its line number, and
        // corresponding value (correct spelling) from st.
        ...
    }
}
