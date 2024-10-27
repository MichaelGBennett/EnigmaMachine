package dev.MichaelBennett.parts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ReflectorTests {

    static Reflector reflector;
    static HashMap<Integer, Integer> reflectedPairs;

    @BeforeAll
    static void setUp(){
        reflectedPairs = new HashMap<>();
        int index = 0;
        String reflectorValues = "FVPJIAOYEDRZXWGCTKUQSBNMHL";
        for (char c : reflectorValues.toCharArray()){
            reflectedPairs.put(index, c - 65);
            index++;
        }
    }

    @Test
    void testReflectSignalDefaultConstructorHappyPath(){
        reflector = new Reflector();

        Assertions.assertEquals(25, reflector.reflectSignal(0));
        Assertions.assertEquals(24, reflector.reflectSignal(1));
        Assertions.assertEquals(23, reflector.reflectSignal(2));
        Assertions.assertEquals(22, reflector.reflectSignal(3));
        Assertions.assertEquals(21, reflector.reflectSignal(4));
        Assertions.assertEquals(20, reflector.reflectSignal(5));
        Assertions.assertEquals(19, reflector.reflectSignal(6));
        Assertions.assertEquals(18, reflector.reflectSignal(7));
        Assertions.assertEquals(17, reflector.reflectSignal(8));
        Assertions.assertEquals(16, reflector.reflectSignal(9));
        Assertions.assertEquals(15, reflector.reflectSignal(10));
        Assertions.assertEquals(14, reflector.reflectSignal(11));
        Assertions.assertEquals(13, reflector.reflectSignal(12));
        Assertions.assertEquals(12, reflector.reflectSignal(13));
        Assertions.assertEquals(11, reflector.reflectSignal(14));
        Assertions.assertEquals(10, reflector.reflectSignal(15));
        Assertions.assertEquals(9, reflector.reflectSignal(16));
        Assertions.assertEquals(8, reflector.reflectSignal(17));
        Assertions.assertEquals(7, reflector.reflectSignal(18));
        Assertions.assertEquals(6, reflector.reflectSignal(19));
        Assertions.assertEquals(5, reflector.reflectSignal(20));
        Assertions.assertEquals(4, reflector.reflectSignal(21));
        Assertions.assertEquals(3, reflector.reflectSignal(22));
        Assertions.assertEquals(2, reflector.reflectSignal(23));
        Assertions.assertEquals(1, reflector.reflectSignal(24));
        Assertions.assertEquals(0, reflector.reflectSignal(25));
    }

    @Test
    void testReflectSignalOverloadedConstructorHappyPath(){
        reflector = new Reflector(reflectedPairs);

        Assertions.assertEquals(5, reflector.reflectSignal(0));
        Assertions.assertEquals(21, reflector.reflectSignal(1));
        Assertions.assertEquals(15, reflector.reflectSignal(2));
        Assertions.assertEquals(11, reflector.reflectSignal(25));
    }
}
