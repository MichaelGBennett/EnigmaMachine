package dev.MichaelBennett.EnigmaMachine;

import dev.MichaelBennett.parts.Rotor;

import java.util.ArrayList;

public class EnigmaMachine {

    public static String rotorIValues = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
    public static String rotorIIValues = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
    public static String rotorIIIValues = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
    public static String rotorIVValues = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
    public static String rotorVValues = "VZBRGITYUPSDNHLXAWMJQOFECK";
    public static String reflectorUKWCValues = "FVPJIAOYEDRZXWGCTKUQSBNMHL";

    private static Rotor firstRotor;
    private static Rotor secondRotor;
    private static Rotor thirdRotor;

    public static void main (String[] args){
        handleCommandLineArgs(args);
    }

    private static void handleCommandLineArgs(String[] args){
        ArrayList<Integer> frontPositions = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            frontPositions.add(i);
        }
        if (args.length < 6){
            System.err.println("not enough rotors specified. using default rotor settings");
            ArrayList<Integer> rotor1Positions = getRotorPositions(1);
            ArrayList<Integer> rotor2Positions = getRotorPositions(2);
            ArrayList<Integer> rotor3Positions = getRotorPositions(3);

            firstRotor = new Rotor(0, frontPositions, rotor1Positions);
            secondRotor = new Rotor(0, frontPositions, rotor2Positions);
            thirdRotor = new Rotor(0, frontPositions, rotor3Positions);
        }
        else {
            int rotorNum1 = Integer.parseInt(args[0]);
            int rotorStep1 = Integer.parseInt(args[1]);

            int rotorNum2 = Integer.parseInt(args[2]);
            int rotorStep2 = Integer.parseInt(args[3]);

            int rotorNum3 = Integer.parseInt(args[4]);
            int rotorStep3 = Integer.parseInt(args[5]);

            ArrayList<Integer> rotor1Positions = getRotorPositions(rotorNum1);
            ArrayList<Integer> rotor2Positions = getRotorPositions(rotorNum2);
            ArrayList<Integer> rotor3Positions = getRotorPositions(rotorNum3);

            firstRotor = new Rotor(rotorStep1, frontPositions, rotor1Positions);
            secondRotor = new Rotor(rotorStep2, frontPositions, rotor2Positions);
            thirdRotor = new Rotor(rotorStep3, frontPositions, rotor3Positions);
        }
    }

    private static ArrayList<Integer> getRotorPositions(int rotorNum){
        ArrayList<Integer> result = new ArrayList<>();
        switch (rotorNum){
            case 1:
                for (char c: rotorIValues.toCharArray()){
                    result.add(c-65);
                }
            break;
            case 2:
                for (char c: rotorIIValues.toCharArray()){
                    result.add(c-65);
                }
            break;
            case 3:
                for (char c: rotorIIIValues.toCharArray()){
                    result.add(c-65);
                }
            break;
            case 4:
                for (char c: rotorIVValues.toCharArray()){
                    result.add(c-65);
                }
            break;
            case 5:
                for (char c: rotorVValues.toCharArray()){
                    result.add(c-65);
                }
            break;
        }
        return result;
    }

}
