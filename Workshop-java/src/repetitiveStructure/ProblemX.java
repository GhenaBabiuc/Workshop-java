package repetitiveStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemX {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        double n, max = 0;
        do {
            System.out.println("Introduceti numar real");
            n = cin.nextDouble();
            if (n == 0) continue;
            list.add(n);
        } while (n != 0);

        for (double z : list) {
            if (max < z) {
                max = z;
            }
        }
        System.out.println("Maximul este " + max);
    }
}
