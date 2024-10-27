package dev.MichaelBennett.parts;

import java.util.HashMap;

public class Reflector {

    HashMap<Integer, Integer> reflectorPairs;

    public Reflector(HashMap<Integer, Integer> reflectorPairs) {
        this.reflectorPairs = reflectorPairs;
    }

    public Reflector() {
        this.reflectorPairs = new HashMap<>();

        this.reflectorPairs.put(0,25);
        this.reflectorPairs.put(1,24);
        this.reflectorPairs.put(2,23);
        this.reflectorPairs.put(3,22);
        this.reflectorPairs.put(4,21);
        this.reflectorPairs.put(5,20);
        this.reflectorPairs.put(6,19);
        this.reflectorPairs.put(7,18);
        this.reflectorPairs.put(8,17);
        this.reflectorPairs.put(9,16);
        this.reflectorPairs.put(10,15);
        this.reflectorPairs.put(11,14);
        this.reflectorPairs.put(12,13);
    }
}
