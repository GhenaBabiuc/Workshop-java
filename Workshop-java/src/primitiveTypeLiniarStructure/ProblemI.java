package primitiveTypeLiniarStructure;

import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.println("Introduceti inaltimea dumneavostra in cm");
        n = cin.nextInt();
        System.out.println("Greutatea ideala pentru inaltimea " + n + "cm  este " + (n - 100) + "kg");
    }
}
