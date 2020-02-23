package com.example.javatest.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void when_is_divisible_per_3_then_Fizz(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void when_is_dividible_per_5_then_Buzz(){
        assertEquals("Buzz",FizzBuzz.fizzBuzz(25));
    }

    @Test
    public void when_is_divisible_per_3_and_5_then_FizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }
    @Test
    public void when_no_is_divisible_per_3_and_5_then_number(){
        assertEquals("7",FizzBuzz.fizzBuzz(7));
    }
}