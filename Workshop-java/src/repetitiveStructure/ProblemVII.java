package repetitiveStructure;

import java.util.Scanner;

public class ProblemVII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduceti un numar formati din 3 cifre");
            n = cin.nextInt();
        } while ((n < 100) || (n >= 1000));
        System.out.println("Suma cifrelor este " + ((n / 100) + ((n / 10) % 10) + (n % 10)));
    }
}
