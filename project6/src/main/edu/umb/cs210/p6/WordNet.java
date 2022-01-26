package edu.umb.cs210.p6;

import dsa.DiGraph;
import dsa.RedBlackBinarySearchTreeST;
import dsa.Set;
import stdlib.In;
import stdlib.StdOut;

// An immutable WordNet data type.
public class WordNet {
    ...
    
    // Construct a WordNet object given the names of the input (synset and
    // hypernym) files.
    public WordNet(String synsets, String hypernyms) {
        ...
    }

    // All WordNet nouns.
    public Iterable<String> nouns() {
        ...
    }

    // Is the word a WordNet noun?
    public boolean isNoun(String word) {
        ...
    }

    // A synset that is a shortest common ancestor of noun1 and noun2.
    public String sca(String noun1, String noun2) {
       ...
    }

    // Distance between noun1 and noun2.
    public int distance(String noun1, String noun2) {
        ...
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        WordNet wordnet = new WordNet(args[0], args[1]);
        String word1 = args[2];
        String word2 = args[3];        
        int nouns = 0;
        for (String noun : wordnet.nouns()) {
            nouns++;
        }
        StdOut.println("# of nouns = " + nouns);
        StdOut.println("isNoun(" + word1 + ") = " + wordnet.isNoun(word1));
        StdOut.println("isNoun(" + word2 + ") = " + wordnet.isNoun(word2));
        StdOut.println("isNoun(" + (word1 + " " + word2) + ") = "
                       + wordnet.isNoun(word1 + " " + word2));
        StdOut.println("sca(" + word1 + ", " + word2 + ") = "
                       + wordnet.sca(word1, word2));
        StdOut.println("distance(" + word1 + ", " + word2 + ") = "
                       + wordnet.distance(word1, word2));
    }
}
