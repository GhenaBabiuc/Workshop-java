package alternativeStructure;

import java.util.Scanner;

public class ProblemIX {
    public static void main(String[] args) {
        int h1, h2, h3 = 0, m1, m2, m3 = 0, s1, s2, s3 = 0, ss1, ss2, ss3;
        Scanner cin = new Scanner(System.in);

        do {
            System.out.println("Introduceti h1");
            h1 = cin.nextInt();
        } while (h1 > 24);
        do {
            System.out.println("Introduceti m1");
            m1 = cin.nextInt();
        } while (m1 > 59);
        do {
            System.out.println("Introduceti s1");
            s1 = cin.nextInt();
        } while (s1 > 59);

        do {
            System.out.println("Introduceti h2");
            h2 = cin.nextInt();
        } while (h2 > 24);
        do {
            System.out.println("Introduceti m2");
            m2 = cin.nextInt();
        } while (m2 > 59);
        do {
            System.out.println("Introduceti s2");
            s2 = cin.nextInt();
        } while (s2 > 59);

        ss1 = h1 * 3600 + m1 * 60 + s1;
        ss2 = h2 * 3600 + m2 * 60 + s2;

        if (ss1 > ss2) {
            ss3 = ss1 - ss2;
        } else {
            ss3 = ss2 - ss1;
        }

        h3 = ss3 / 3600;
        m3 = (ss3 - ((ss3 / 3600) * 3600)) / 60;
        s3 = ss3 - (((ss3 - ((ss3 / 3600) * 3600)) / 60) * 60) - ((ss3 / 3600) * 3600);

        System.out.println(h3 + " ore " + m3 + " minute " + s3 + " secunde");
    }
}
