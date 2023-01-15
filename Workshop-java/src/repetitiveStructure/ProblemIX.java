package repetitiveStructure;

import java.util.Scanner;

public class ProblemIX {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, m = 0;
        System.out.println("Introduceti n:");
        n = cin.nextInt();
        while (n != 0) {
            m = m + (n % 10);
            if (n / 10 != 0) {
                m *= 10;
            }
            n /= 10;
        }

        System.out.println(m);
    }
}
