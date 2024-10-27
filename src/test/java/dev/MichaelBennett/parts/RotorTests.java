package dev.MichaelBennett.parts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class RotorTests {

    Rotor testRotor = new Rotor();
    static Rotor testRotor2;
    static HashMap<Integer, Integer> reflectedPairs;

    @BeforeAll
    static void setUp(){
        ArrayList<Integer> frontArangement = new ArrayList<>();
        ArrayList<Integer> backArangement = new ArrayList<>();

        for (int i = 0; i < 26; i++){
            frontArangement.add(i);
        }
        String enigma1rotorI = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
        for (char c: enigma1rotorI.toCharArray()){
            backArangement.add(c - 65);
        }

        testRotor2 = new Rotor(0, frontArangement, backArangement);

        reflectedPairs = new HashMap<>();
        int index = 0;
        String reflectorValues = "FVPJIAOYEDRZXWGCTKUQSBNMHL";
        for (char c : reflectorValues.toCharArray()){
            reflectedPairs.put(index, c - 65);
            index++;
        }
    }

    @Test
    void testRotorConstructor(){
        Assertions.assertEquals(4, testRotor2.signalFrontToBack(0));
        Assertions.assertEquals(10, testRotor2.signalFrontToBack(1));
        Assertions.assertEquals(12, testRotor2.signalFrontToBack(2));
        Assertions.assertEquals(5, testRotor2.signalFrontToBack(3));
        Assertions.assertEquals(11, testRotor2.signalFrontToBack(4));
        Assertions.assertEquals(6, testRotor2.signalFrontToBack(5));
        Assertions.assertEquals(3, testRotor2.signalFrontToBack(6));
        Assertions.assertEquals(16, testRotor2.signalFrontToBack(7));
        Assertions.assertEquals(21, testRotor2.signalFrontToBack(8));
        Assertions.assertEquals(25, testRotor2.signalFrontToBack(9));
        Assertions.assertEquals(13, testRotor2.signalFrontToBack(10));
        Assertions.assertEquals(19, testRotor2.signalFrontToBack(11));
        Assertions.assertEquals(14, testRotor2.signalFrontToBack(12));
        Assertions.assertEquals(22, testRotor2.signalFrontToBack(13));
        Assertions.assertEquals(24, testRotor2.signalFrontToBack(14));
        Assertions.assertEquals(7, testRotor2.signalFrontToBack(15));
        Assertions.assertEquals(23, testRotor2.signalFrontToBack(16));
        Assertions.assertEquals(20, testRotor2.signalFrontToBack(17));
        Assertions.assertEquals(18, testRotor2.signalFrontToBack(18));
        Assertions.assertEquals(15, testRotor2.signalFrontToBack(19));
        Assertions.assertEquals(0, testRotor2.signalFrontToBack(20));
        Assertions.assertEquals(8, testRotor2.signalFrontToBack(21));
        Assertions.assertEquals(1, testRotor2.signalFrontToBack(22));
        Assertions.assertEquals(17, testRotor2.signalFrontToBack(23));
        Assertions.assertEquals(2, testRotor2.signalFrontToBack(24));
        Assertions.assertEquals(9, testRotor2.signalFrontToBack(25));
    }

    @Test
    void testSignalFrontToBackDefaultConstructorHappyValues() {
        Assertions.assertEquals(0, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(1, testRotor.signalFrontToBack(1));
        Assertions.assertEquals(2, testRotor.signalFrontToBack(2));
        Assertions.assertEquals(3, testRotor.signalFrontToBack(3));
        Assertions.assertEquals(4, testRotor.signalFrontToBack(4));
        Assertions.assertEquals(5, testRotor.signalFrontToBack(5));
        Assertions.assertEquals(6, testRotor.signalFrontToBack(6));
        Assertions.assertEquals(7, testRotor.signalFrontToBack(7));
        Assertions.assertEquals(8, testRotor.signalFrontToBack(8));
        Assertions.assertEquals(9, testRotor.signalFrontToBack(9));
        Assertions.assertEquals(10, testRotor.signalFrontToBack(10));
        Assertions.assertEquals(11, testRotor.signalFrontToBack(11));
        Assertions.assertEquals(12, testRotor.signalFrontToBack(12));
        Assertions.assertEquals(13, testRotor.signalFrontToBack(13));
        Assertions.assertEquals(14, testRotor.signalFrontToBack(14));
        Assertions.assertEquals(15, testRotor.signalFrontToBack(15));
        Assertions.assertEquals(16, testRotor.signalFrontToBack(16));
        Assertions.assertEquals(17, testRotor.signalFrontToBack(17));
        Assertions.assertEquals(18, testRotor.signalFrontToBack(18));
        Assertions.assertEquals(19, testRotor.signalFrontToBack(19));
        Assertions.assertEquals(20, testRotor.signalFrontToBack(20));
        Assertions.assertEquals(21, testRotor.signalFrontToBack(21));
        Assertions.assertEquals(22, testRotor.signalFrontToBack(22));
        Assertions.assertEquals(23, testRotor.signalFrontToBack(23));
        Assertions.assertEquals(24, testRotor.signalFrontToBack(24));
        Assertions.assertEquals(25, testRotor.signalFrontToBack(25));
    }

    @Test
    void testSignalBackToFrontDefaultConstructorHappyValues() {
        Assertions.assertEquals(0, testRotor.signalBackToFront(0));
        Assertions.assertEquals(1, testRotor.signalBackToFront(1));
        Assertions.assertEquals(2, testRotor.signalBackToFront(2));
        Assertions.assertEquals(3, testRotor.signalBackToFront(3));
        Assertions.assertEquals(4, testRotor.signalBackToFront(4));
        Assertions.assertEquals(5, testRotor.signalBackToFront(5));
        Assertions.assertEquals(6, testRotor.signalBackToFront(6));
        Assertions.assertEquals(7, testRotor.signalBackToFront(7));
        Assertions.assertEquals(8, testRotor.signalBackToFront(8));
        Assertions.assertEquals(9, testRotor.signalBackToFront(9));
        Assertions.assertEquals(10, testRotor.signalBackToFront(10));
        Assertions.assertEquals(11, testRotor.signalBackToFront(11));
        Assertions.assertEquals(12, testRotor.signalBackToFront(12));
        Assertions.assertEquals(13, testRotor.signalBackToFront(13));
        Assertions.assertEquals(14, testRotor.signalBackToFront(14));
        Assertions.assertEquals(15, testRotor.signalBackToFront(15));
        Assertions.assertEquals(16, testRotor.signalBackToFront(16));
        Assertions.assertEquals(17, testRotor.signalBackToFront(17));
        Assertions.assertEquals(18, testRotor.signalBackToFront(18));
        Assertions.assertEquals(19, testRotor.signalBackToFront(19));
        Assertions.assertEquals(20, testRotor.signalBackToFront(20));
        Assertions.assertEquals(21, testRotor.signalBackToFront(21));
        Assertions.assertEquals(22, testRotor.signalBackToFront(22));
        Assertions.assertEquals(23, testRotor.signalBackToFront(23));
        Assertions.assertEquals(24, testRotor.signalBackToFront(24));
        Assertions.assertEquals(25, testRotor.signalBackToFront(25));
    }

    @Test
    void testSignalFrontToBackDefaultConstructorNegativeValues() {
        Assertions.assertEquals(-1, testRotor.signalFrontToBack(-1));
        Assertions.assertEquals(-1, testRotor.signalFrontToBack(-999));
    }

    @Test
    void testSignalFrontToBackDefaultConstructorOutOfRangeValues() {
        Assertions.assertEquals(0, testRotor.signalFrontToBack(26));
        Assertions.assertEquals(4, testRotor.signalFrontToBack(30));
    }

    @Test
    void testSignalBackToFrontDefaultConstructorNegativeValues() {
        Assertions.assertEquals(-1, testRotor.signalBackToFront(-1));
        Assertions.assertEquals(-1, testRotor.signalBackToFront(-999));
    }

    @Test
    void testSignalBackToFrontDefaultConstructorOutOfRangeValues() {
        Assertions.assertEquals(0, testRotor.signalBackToFront(26));
        Assertions.assertEquals(4, testRotor.signalBackToFront(30));
    }

    @Test
    void testStepUpHappyPath() {
        Assertions.assertEquals(0, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(25, testRotor.signalFrontToBack(25));

        Assertions.assertEquals(0, testRotor.signalBackToFront(0));
        Assertions.assertEquals(25, testRotor.signalBackToFront(25));

        testRotor.stepUp();
        Assertions.assertEquals(1, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(0, testRotor.signalFrontToBack(25));
        Assertions.assertEquals(0, testRotor.signalBackToFront(1));
        Assertions.assertEquals(25, testRotor.signalBackToFront(0));

        testRotor.stepUp();
        Assertions.assertEquals(2, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(1, testRotor.signalFrontToBack(25));
        Assertions.assertEquals(0, testRotor.signalBackToFront(2));
        Assertions.assertEquals(25, testRotor.signalBackToFront(1));

        testRotor.stepUp();
        Assertions.assertEquals(3, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(2, testRotor.signalFrontToBack(25));
        Assertions.assertEquals(0, testRotor.signalBackToFront(3));
        Assertions.assertEquals(25, testRotor.signalBackToFront(2));
    }

    @Test
    void testSetStepHappyPath() {
        Assertions.assertEquals(0, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(25, testRotor.signalFrontToBack(25));

        testRotor.setStep(3);
        Assertions.assertEquals(3, testRotor.signalFrontToBack(0));
        Assertions.assertEquals(2, testRotor.signalFrontToBack(25));
    }

    @Test
    void testInputSignalHappyPath(){
        testRotor.setNextRotor(testRotor2);
        testRotor2.setPreviousRotor(testRotor);

        Assertions.assertEquals(4, testRotor.inputSignal(0));
    }

    @Test
    void testInputSignalHappyPathWithReflector(){
        testRotor.setNextRotor(testRotor2);
        testRotor2.setPreviousRotor(testRotor);
        Reflector reflector = new Reflector(reflectedPairs);
        testRotor2.setReflector(reflector);

        Assertions.assertEquals(21, testRotor.inputSignal(0));
    }

    @Test
    void testInputSignalWithNoConnections(){
        Assertions.assertEquals(4, testRotor2.inputSignal(0));
    }
}