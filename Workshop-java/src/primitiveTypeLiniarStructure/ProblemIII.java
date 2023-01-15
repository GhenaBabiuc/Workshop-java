package primitiveTypeLiniarStructure;

import java.util.Scanner;

public class ProblemIII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c, b;
        System.out.println("Introduceti numarul de copii ");
        c = cin.nextInt();
        System.out.println("Introduceti numarul de bomboane ");
        b = cin.nextInt();

        System.out.println("Cate " + (b / c) + " bomboane fiecarui copil, vor ramane " + (b % c) + " bomboane");
    }
}
