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
        this.step = 0;
        this.front = new ArrayList<Integer>();
        this.back = new ArrayList<Integer>();
        this.nextRotor = null;
        this.previousRotor = null;
        this.reflector = null;
    }

    public Rotor(int step, ArrayList<Integer> front, ArrayList<Integer> back) {
        this.step = step;
        this.front = front;
        this.back = back;
        this.nextRotor = null;
        this.previousRotor = null;
        this.reflector = null;
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

    public int signalFrontToBack(int in) {
        in += this.step;
        if (in >= 26) in %= 26;

        int index = this.front.indexOf(in);
        return this.back.get(index);
    }

    public int signalBackToFront(int in){
        in += this.step;
        if (in >= 26) in %= 26;

        int index = this.back.indexOf(in);
        return this.front.get(index);
    }

    public int inputSignal(int in){
        int output;
        int shifted = this.signalFrontToBack(in);
        if (this.nextRotor != null){
            output = this.nextRotor.inputSignal(shifted);
        }
        else if (this.reflector != null){
            //TODO come back to this after reflector is implemented
            output = this.reflector.reflectSignal(shifted);
        }
        else {
            return Integer.MIN_VALUE;
        }
        return this.signalBackToFront(output);
    }
}
