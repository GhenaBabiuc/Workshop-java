package primitiveTypeLiniarStructure;

import java.util.Scanner;

public class ProblemV {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduceti n format din doua cifre");
            n = cin.nextInt();
        } while (n > 99);

        System.out.println("Numarul de zeci este " + (n / 10) + " Numarul de unitati este " + (n % 10));
    }
}
