package repetitiveStructure;

import java.util.Scanner;

public class ProblemVI {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String line;
        String word = "Cuvintele";

        System.out.println("Rănim fără să ne mișcăm, otrăvim fără să atingem. Putem aduce atât minciuni, cât și adevăr, nu suntem niciodată judecați după dimensiune. Cine suntem?");
        System.out.println("Prentu a ceda introduceti 'cedez'");

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduceti raspunsul:");
            line = cin.nextLine();
            if (line.equalsIgnoreCase("CEDEZ")) {
                System.out.println("Raspunsul corect este:" + word);
                break;
            }

            if (line.equalsIgnoreCase(word)) {
                System.out.println("Corect, ai ghicit");
                break;
            }

            if (i < 2) {
                System.out.println("Mai incercati");
            } else {
                System.out.println("Nu ati ghicit");
            }
        }
    }
}

