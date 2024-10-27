package dev.MichaelBennett.parts;

import java.util.ArrayList;

public class Rotor {

    int step;
    int turnover;
    ArrayList<Integer> front;
    ArrayList<Integer> back;
    Rotor nextRotor;
    Rotor previousRotor;
    Reflector reflector;

    public Rotor() {
        this.step = 0;
        this.turnover = 0;
        this.front = new ArrayList<Integer>();
        this.back = new ArrayList<Integer>();
        this.nextRotor = null;
        this.previousRotor = null;
        this.reflector = null;

        front.add(0);
        front.add(1);
        front.add(2);
        front.add(3);
        front.add(4);
        front.add(5);
        front.add(6);
        front.add(7);
        front.add(8);
        front.add(9);
        front.add(10);
        front.add(11);
        front.add(12);
        front.add(13);
        front.add(14);
        front.add(15);
        front.add(16);
        front.add(17);
        front.add(18);
        front.add(19);
        front.add(20);
        front.add(21);
        front.add(22);
        front.add(23);
        front.add(24);
        front.add(25);

        back.add(0);
        back.add(1);
        back.add(2);
        back.add(3);
        back.add(4);
        back.add(5);
        back.add(6);
        back.add(7);
        back.add(8);
        back.add(9);
        back.add(10);
        back.add(11);
        back.add(12);
        back.add(13);
        back.add(14);
        back.add(15);
        back.add(16);
        back.add(17);
        back.add(18);
        back.add(19);
        back.add(20);
        back.add(21);
        back.add(22);
        back.add(23);
        back.add(24);
        back.add(25);
    }

    public Rotor(int step, int turnover, ArrayList<Integer> front, ArrayList<Integer> back) {
        this.step = step;
        this.turnover = turnover;
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
        if (in < 0) return -1;
        int index = this.front.indexOf(in);
        if (index < 0) return -1;
        index += this.step;
        index %= 26;
        return this.back.get(index);
    }

    public int signalBackToFront(int in){
        if (in < 0) return -1;
        int index = this.back.indexOf(in);
        if (index < 0) return -1;
        index -= this.step;
        if (index < 0) index += 26;
        return this.front.get(index);
    }

    public int inputSignal(int in){
        int output;
        int shifted = this.signalFrontToBack(in);
        if (this.nextRotor != null){
            output = this.nextRotor.inputSignal(shifted);
        }
        else if (this.reflector != null){
            output = this.reflector.reflectSignal(shifted);
        }
        else {
            return shifted;
        }
        return this.signalBackToFront(output);
    }

    public int stepUp(){
        this.step++;
        if (this.step == this.turnover && this.nextRotor != null){
            this.nextRotor.stepUp();
        }
        return this.step;
    }

    public void setStep(int step){
        this.step = step;
    }
}
