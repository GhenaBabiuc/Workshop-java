package primitiveTypeLiniarStructure;

import java.util.Scanner;

public class ProblemIV {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m;

        do {
            System.out.println("Introduceti numarul de minute ");
            m = cin.nextInt();
        } while (m > 1440);

        if ((m - ((m / 60) * 60)) < 10) {
            System.out.println("Este ora " + (m / 60) + ":0" + (m - ((m / 60) * 60)));
        } else {
            System.out.println("Este ora " + (m / 60) + ":" + (m - ((m / 60) * 60)));
        }
    }
}
