package RGMCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkNumModuloEingabe() {
        int proofNum = 7;
        String actual = Main.fizzbuzz(proofNum);
        assertEquals("7", actual);
    }

    @Test
    void checkNumModulo3() {
        int proofNum = 9;
        String actual = Main.fizzbuzz(proofNum);
        assertEquals("fizz", actual);
    }

    @Test
    void checkNumModulo5() {
        int proofNum = 10;
        String actual = Main.fizzbuzz(proofNum);
        assertEquals("buzz", actual);
    }

    @Test
    void checkNumModulo3und5() {
        int proofNum = 30;
        String actual = Main.fizzbuzz(proofNum);
        assertEquals("fizzbuzz", actual);
    }

    ///////////////////////////////////////////////////////////////////////////////

    @Test
    void smalerZero() {
        int num = 1;
        boolean actual = Main.smalerThanZero(num);
        assertTrue(actual);
    }

    ///////////////////////////////////////////////////////////////////////////////

    @Test
    void sumSquareOrSubtractWhenFirstNumberIsGreater() {
        int num1 = 6;
        int num2 = 4;
        int result = Main.sumSquareOrSubstract(num1, num2);
        assertEquals(10, result);
    }

    @Test
    void sumSquareOrSubtractWhenFirstNumberIsNotGreater() {
        int num1 = 3;
        int num2 = 5;
        int result = Main.sumSquareOrSubstract(num1, num2);
        assertEquals(15, result);
    }

    ///////////////////////////////////////////////////////////////////////////////

    @Test
    void sumSquareOrSubBooleanWhenFirstNumberIsGreaterAndSubtractIsTrue() {
        int num1 = 6;
        int num2 = 4;
        boolean subtract = true;
        int result = Main.sumSquareOrSubBoolean(num1, num2, subtract);
        assertEquals(2, result);
    }

    @Test
    void sumSquareOrSubBooleanWhenFirstNumberIsGreaterAndSubtractIsFalse() {
        int num1 = 6;
        int num2 = 4;
        boolean subtract = false;
        int result = Main.sumSquareOrSubBoolean(num1, num2, subtract);
        assertEquals(10, result);
    }

    @Test
    void sumSquareOrSubBooleanWhenFirstNumberIsNotGreaterAndSubtractIsTrue() {
        int num1 = 3;
        int num2 = 5;
        boolean subtract = true;
        int result = Main.sumSquareOrSubBoolean(num1, num2, subtract);
        assertEquals(-2, result);
    }

    @Test
    void sumSquareOrSubBooleanWhenFirstNumberIsNotGreaterAndSubtractIsFalse() {
        int num1 = 3;
        int num2 = 5;
        boolean subtract = false;
        int result = Main.sumSquareOrSubBoolean(num1, num2, subtract);
        assertEquals(15, result);
    }

}