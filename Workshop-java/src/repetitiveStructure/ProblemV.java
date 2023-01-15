package repetitiveStructure;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProblemV {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
//        Random rand = new Random();
//        int x = rand.nextInt(10);
        int x = ThreadLocalRandom.current().nextInt(1, 10);
        String line;
        int n;

        System.out.println("Aveti trei incercari pentru a ghici un numar de la 1 la 10");
        System.out.println("Prentu a ceda introduceti 'cedez'");

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduceti numarul:");
            line = cin.nextLine();
            if (line.equalsIgnoreCase("CEDEZ")) {
                System.out.println("Numarul a fost " + x);
                break;
            }

            try {
                n = Integer.parseInt(line);
                if (n == x) {
                    System.out.println("Ati ghicit");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Nu ati introdus un numar!!!");
                i--;
            }

            if (i < 2) {
                System.out.println("Mai incercati");
            } else {
                System.out.println("Nu ati ghicit");
            }
        }
    }
}

