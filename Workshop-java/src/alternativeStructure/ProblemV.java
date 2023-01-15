package alternativeStructure;

import java.util.Scanner;

public class ProblemV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the month");
        byte month = in.nextByte();
        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Error month");
        }
    }
}
