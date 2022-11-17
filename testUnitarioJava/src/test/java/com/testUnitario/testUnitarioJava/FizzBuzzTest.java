package com.testUnitario.testUnitarioJava;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {


    @Test
    public void TryNumbers_General_All() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(10);
        numbers.add(15);
        numbers.add(18);
        FizzBuzz fizz = new FizzBuzz();

        String expectedResult = "Fizz\n" +
                "SOLERA!\n" +
                "Buzz\n" +
                "FizzBuzz\n" +
                "SOLERA!\n" +
                "Fizz\n" +
                "SOLERA!\n";
        assertEquals(expectedResult, fizz.tryNumbers(numbers));
    }

    @Test
    public void TryNumbers_DivisibleBy3_Fizz() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(123);
        numbers.add(66);
        numbers.add(93);
        numbers.add(183);
        numbers.add(219);

        String expectedResult = "Fizz\n" +
                "SOLERA!\n" +
                "Fizz\n" +
                "SOLERA!\n" +
                "Fizz\n" +
                "SOLERA!\n" +
                "Fizz\n" +
                "SOLERA!\n" +
                "Fizz\n" +
                "SOLERA!\n";

        FizzBuzz fizz = new FizzBuzz();
        assertEquals(expectedResult, fizz.tryNumbers(numbers));
    }

    @Test
    public void TryNumbers_DivisibleBy5_Buzz() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(140);
        numbers.add(220);
        numbers.add(350);
        numbers.add(995);

        String expectedResult = "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n" +
                "Buzz\n";

        FizzBuzz fizz = new FizzBuzz();
        assertEquals(expectedResult, fizz.tryNumbers(numbers));
    }

    @Test
    public void TryNumbers_DivisibleBy3And5_FizzBuzz() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(30);
        numbers.add(60);
        numbers.add(90);
        numbers.add(180);

        String expectedResult = "FizzBuz!\n" +
                "SOLERA!\n" +
                "FizzBuz!\n" +
                "SOLERA!\n" +
                "FizzBuz!\n" +
                "SOLERA!\n" +
                "FizzBuz!\n" +
                "SOLERA!\n" +
                "FizzBuz!\n" +
                "SOLERA!\n";

        FizzBuzz fizz = new FizzBuzz();
        assertEquals(expectedResult, fizz.tryNumbers(numbers));
    }

    @Test
    public void TryNumbers_NotDivisibleBy3And5_FizzBuzz() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(11);
        numbers.add(41);
        numbers.add(77);
        numbers.add(19);

        String expectedResult = "";

        FizzBuzz fizz = new FizzBuzz();
        assertEquals(expectedResult, fizz.tryNumbers(numbers));
    }

    @Test
    public void TryNumbers_SumIsDivisibleBy3_SOLERA() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(18); //9
        numbers.add(42); //6
        numbers.add(12); // 3
        numbers.add(21); //6
        numbers.add(171); // 9

        String expectedResult = "Fiz!\n" +
                "SOLERA!\n" +
                "Fiz!\n" +
                "SOLERA!\n" +
                "Fiz!\n" +
                "SOLERA!\n" +
                "Fiz!\n" +
                "SOLERA!\n" +
                "Fiz!\n" +
                "SOLERA!\n";

        FizzBuzz fizz = new FizzBuzz();
        assertEquals(expectedResult, fizz.tryNumbers(numbers));
    }

    @Test
    public void TryNumbers_NoneDivisibleOrSum_Empty() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(41);
        numbers.add(82);
        numbers.add(77);
        numbers.add(161);
        numbers.add(112);

        FizzBuzz fizz = new FizzBuzz();
        assertEquals("", fizz.tryNumbers(numbers));
    }


}

