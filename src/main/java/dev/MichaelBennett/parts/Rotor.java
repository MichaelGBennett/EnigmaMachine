package dev.MichaelBennett.parts;

import java.util.ArrayList;

public class Rotor {

    int step;
    ArrayList<Integer> front;
    ArrayList<Integer> back;
    Rotor nextRotor;
    Rotor previousRotor;
    Reflector reflector;

    public Rotor() {

    }

    public Rotor(int step, ArrayList<Integer> front, ArrayList<Integer> back) {
        this.step = step;
        this.front = front;
        this.back = back;
    }

    public void setNextRotor(Rotor nextRotor) {
        this.nextRotor = nextRotor;
        this.reflector = null;
    }

    public void setPreviousRotor(Rotor previousRotor) {
        this.previousRotor = previousRotor;
    }

    public void setReflector(Reflector reflector) {
        this.reflector = reflector;
        this.nextRotor = null;
    }
}
