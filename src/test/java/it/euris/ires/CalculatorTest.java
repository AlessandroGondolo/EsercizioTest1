package it.euris.ires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator;

    @Test
    @DisplayName("1 + 1 = 2 ---- nome test")
    void addsTwoNumbers() {
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    }

    @Test
    @DisplayName("2 - 2 = 0 ")
    void subTwoNumbers() {

        assertEquals(0, calculator.subtract(2, 2), "2 - 2 should equal 0");
    }

    @Test
    @DisplayName("20 - 24 = -4")
    void subTest() {

        assertEquals(-4, calculator.subtract(20, 24), "20 - 12 should equal 8");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("1+1 = 2 ")
    void addTwoNumbers2() {
        //arrange
        int numberA = 1;
        int numberB = 2;
        int expectedResult = 3;
        // act
        int result = calculator.add(numberA, numberB);
        // assert
        assertEquals(expectedResult, result, String.format("%s + %s should equal %s", numberA, numberB, expectedResult));
    }

    @Test
    @DisplayName("Test per la moltiplicazione con a = 4 e b = 4")
    void productBetweenTwoNumbers() {
        //arrange
        int numberA = 4;
        int numberB = 4;
        int expectedResult = 16;
        // act
        int result = calculator.product(numberA,numberB);
        // assert
        assertEquals(expectedResult, result, String.format("%s + %s should equal %s", numberA, numberB, expectedResult));
    }

    @Test
    @DisplayName("Test per la divisione con con a = 4 e b=2 ")
    void divisionBetweenFourAndTwo(){
        //arrange
        int numberA = 4;
        int numberB = 2;
        double expectedResult = 2;
        //act
        double result = calculator.division(numberA,numberB);
        //assert
        assertEquals(expectedResult,result,String.format("%s / %s should equal %s",numberA,numberB,expectedResult));

    }

}

