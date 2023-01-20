package oop.lessonII.exerciseI;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberMethods numberMethods = new NumberMethods();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int number = 8365, a = 1, b = 3, c = 2;

        System.out.println(a + " " + b + " " + c + " are consecutive numbers:" + numberMethods.consecutiveNumbers(a, b, c) + "\n");

        for (int n : list) {
            System.out.println(n + " is Prime:" + numberMethods.isPrime(n));
        }
        System.out.println(" ");

        System.out.println("reverse digits " + number + " is " + numberMethods.reverseDigits(number) + "\n");

        System.out.println("first digit " + number + " is " + numberMethods.firstDigit(number));
    }
}
