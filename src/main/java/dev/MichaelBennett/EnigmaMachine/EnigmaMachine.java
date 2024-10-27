package dev.MichaelBennett.EnigmaMachine;

import dev.MichaelBennett.parts.Reflector;
import dev.MichaelBennett.parts.Rotor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
        HashMap<Integer, Integer> reflectorSettings = new HashMap<>();
        int index = 0;
        for (char c: reflectorUKWCValues.toCharArray()){
            reflectorSettings.put(index, c-65);
            index++;
        }
        Reflector reflector = new Reflector(reflectorSettings);
        connectRotors(firstRotor, secondRotor);
        connectRotors(secondRotor, thirdRotor);
        thirdRotor.setReflector(reflector);

        Scanner in = new Scanner(System.in);

        System.out.println("please write your message");
        String input = in.nextLine();
        StringBuilder ciphertext = new StringBuilder();
        for (char c: input.toUpperCase().toCharArray()){
            if (c >= 65 && c <= 90) {
                firstRotor.stepUp();
                char nextLetter = (char) (firstRotor.inputSignal(c - 65) + 65);
                ciphertext.append(nextLetter);
            }
            else if (c == ' '){
                ciphertext.append(' ');
            }
        }
        System.out.println(ciphertext);
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

            firstRotor = new Rotor(0, 0, frontPositions, rotor1Positions);
            secondRotor = new Rotor(0, 0, frontPositions, rotor2Positions);
            thirdRotor = new Rotor(0, 0, frontPositions, rotor3Positions);
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

            firstRotor = new Rotor(rotorStep1, getRotorTurnoverPositions(rotorNum1), frontPositions, rotor1Positions);
            secondRotor = new Rotor(rotorStep2, getRotorTurnoverPositions(rotorNum2), frontPositions, rotor2Positions);
            thirdRotor = new Rotor(rotorStep3, getRotorTurnoverPositions(rotorNum3), frontPositions, rotor3Positions);
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

    private static int getRotorTurnoverPositions(int rotorNum){
        switch (rotorNum){
            case 1:
                return 16;
            case 2:
                return 4;
            case 3:
                return 21;
            case 4:
                return 9;
            case 5:
                return 25;
        }
        return 0;
    }

    private static void connectRotors (Rotor firstRotor, Rotor secondRotor){
        firstRotor.setNextRotor(secondRotor);
        secondRotor.setPreviousRotor(firstRotor);
    }

}
