package alternativeStructure;

import java.util.Scanner;

public class ProblemIV {
    public static void main(String[] args) {
        System.out.println("What is the color?");
        Scanner in = new Scanner(System.in);
        String color = in.next().toUpperCase();
        switch (color) {
            case "RED" -> System.out.println("STOP");
            case "YELLOW" -> System.out.println("WAIT");
            case "GREEN" -> System.out.println("GO");
            default -> System.out.println("ERROR");
        }
    }
}
