package dev.MichaelBennett.parts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotorTests {

    Rotor testRotor = new Rotor();

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
    void testStep() {
        Assertions.assertEquals(-1, testRotor.signalFrontToBack(-1));
        Assertions.assertEquals(-1, testRotor.signalFrontToBack(-999));
    }
}