package alternativeStructure;

import java.util.Scanner;

public class ProblemII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What time is it now?");
        byte hour = in.nextByte();
        if ((hour >= 5) && (hour < 12)) System.out.println("Good morning");
        else if ((hour >= 12) && (hour < 17)) System.out.println("Good afternoon ");
        else if ((hour >= 17) && (hour < 22)) System.out.println("Good evening ");
        else if ((hour >= 22) && (hour <= 23) || (hour >= 0) && (hour < 5)) System.out.println("Good night");
        else System.out.println("Error hour");
    }
}
