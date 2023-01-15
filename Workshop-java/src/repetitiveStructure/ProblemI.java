package repetitiveStructure;

import java.util.Scanner;

public class ProblemI {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduceti cantitatea de mere culese " + (i + 1));
            c += cin.nextInt();
        }

        System.out.println("Cantitatea culeasa in total este " + c);
    }
}
