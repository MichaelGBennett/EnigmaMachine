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
        this.reflectorPairs.put(13,12);
        this.reflectorPairs.put(14,11);
        this.reflectorPairs.put(15,10);
        this.reflectorPairs.put(16,9);
        this.reflectorPairs.put(17,8);
        this.reflectorPairs.put(18,7);
        this.reflectorPairs.put(19,6);
        this.reflectorPairs.put(20,5);
        this.reflectorPairs.put(21,4);
        this.reflectorPairs.put(22,3);
        this.reflectorPairs.put(23,2);
        this.reflectorPairs.put(24,1);
        this.reflectorPairs.put(25,0);
    }


    public int reflectSignal(int in) {
        return this.reflectorPairs.get(in);
    }
}
