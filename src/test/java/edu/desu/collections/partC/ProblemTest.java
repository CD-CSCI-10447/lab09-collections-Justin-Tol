package edu.desu.collections.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProblemTest {

    @Test
    public void characterReplacementTest01(){
        String  s = "ABAB";
        int k = 2;

        int expected = 4;
        int actual = Problem.characterReplacement(s,k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest02(){
        String  s = "AABABBA";
        int k = 1;

        int expected = 4;
        int actual = Problem.characterReplacement(s,k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void characterReplacementTest03(){
        String  s = "ABCDEFG";
        int k = 1;

        int expected = 2;
        int actual = Problem.characterReplacement(s,k);

        Assertions.assertEquals(expected, actual);
    }
}
