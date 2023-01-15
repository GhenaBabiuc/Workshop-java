package primitiveTypeLiniarStructure;

import java.util.Scanner;

public class ProblemII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int h, m, s;
        System.out.println("Introduceti h");
        h = cin.nextInt();
        System.out.println("Introduceti m");
        m = cin.nextInt();
        System.out.println("Introduceti s");
        s = cin.nextInt();

        System.out.println("De la inceputul zilei a trecut " + (h * 3600 + m * 60 + s) + " secunde");
    }
}
