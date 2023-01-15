package alternativeStructure;

import java.util.Scanner;

public class ProblemIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age");
        byte age = in.nextByte();
        if ((age >= 1) && (age <= 11)) System.out.println("Child");
        else if ((age >= 12) && (age <= 16)) System.out.println("Teen");
        else if ((age >= 17) && (age <= 50)) System.out.println("Adult");
        else if (age >= 51) System.out.println("Elderly");
        else System.out.println("Error age");
    }
}
