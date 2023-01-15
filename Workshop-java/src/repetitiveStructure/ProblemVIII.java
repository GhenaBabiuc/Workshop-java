package repetitiveStructure;

import java.util.Scanner;

public class ProblemVIII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, i = 0;
        System.out.println("Introduceti n:");
        n = cin.nextInt();
        while (n != 0) {
            n /= 10;
            i++;
        }
        System.out.println("Numarul de cifre este " + i);
    }
}
