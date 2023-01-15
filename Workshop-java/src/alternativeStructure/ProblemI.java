package alternativeStructure;

import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        System.out.print("Glad to see you. ");
        Scanner in = new Scanner(System.in);
        System.out.println("What is your age?");
        byte age = in.nextByte();
        if (age >= 18) {
            System.out.println("Welcome!");
        } else System.out.println("Sorry. It is not for your age.");
    }
}
