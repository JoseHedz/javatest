package com.example.javatest.fizzbuzz;

public class FizzBuzz {
    public static String fizzBuzz(int n){
       /* String out = "";
        if(n%5==0){
            out="Buzz";
            if(n%3==0){
                out="FizzBuzz";
            }
        }else if(n%3==0){
            out="Fizz";
        }else{
            out = ""+n;
        }
        */
        return (n % 5 == 0 ?(n % 3 == 0 ? "FizzBuzz": "Buzz"):(n % 3 == 0 ? "Fizz":""+n ));
    }
}
