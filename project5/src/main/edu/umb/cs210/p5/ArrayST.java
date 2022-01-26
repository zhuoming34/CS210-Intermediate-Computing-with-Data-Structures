package edu.umb.cs210.p5;

import dsa.LinkedQueue;
import stdlib.StdIn;
import stdlib.StdOut;

public class ArrayST<Key, Value> {
    private static final int INIT_CAPACITY = 2;
    private Key[] keys;
    private Value[] values;
    private int N;

    // Create a symbol table with INIT_CAPACITY.
    public ArrayST() {
        ...
    }

    // Create a symbol table with given capacity.
    public ArrayST(int capacity) {
        ...
    }

    // Return the number of key-value pairs in the table.
    public int size() {
        ...
    }

    // Return true if the table is empty and false otherwise.
    public boolean isEmpty() {
        ...
    }

    // Return true if the table contains key and false otherwise.
    public boolean contains(Key key) {
        ...
    }

    // Return the value associated with key, or null.
    public Value get(Key key) {
        ...
    }

    // Put the key-value pair into the table; remove key from table 
    // if value is null.
    public void put(Key key, Value value) {
        ...
    }

    // Remove key (and its value) from table.
    public void delete(Key key) {
        ...
    }

    // Return all the keys in the table.
    public Iterable<Key> keys()  {
        ...
    }

    // Resize the internal arrays to capacity.
    private void resize(int capacity) {
        Key[] tempk = (Key[]) new Object[capacity];
        Value[] tempv = (Value[]) new Object[capacity];
        for (int i = 0; i < N; i++) {
            tempk[i] = keys[i];
            tempv[i] = values[i];
        }
        values = tempv;
        keys = tempk;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        ArrayST<String, Integer> st = new ArrayST<String, Integer>();
        int count = 0;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            st.put(s, ++count);
        }
        for (String s : args) {
            st.delete(s);
        }
        for (String s : st.keys()) {
            StdOut.println(s + " " + st.get(s));
        }
    }
}
