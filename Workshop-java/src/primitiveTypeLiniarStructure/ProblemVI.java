package primitiveTypeLiniarStructure;

import java.util.Scanner;

public class ProblemVI {
    public static void main(String[] args) {
        int o, h;
        Scanner cin = new Scanner(System.in);
        System.out.println("Introduceti cantitatea de orez");
        o = cin.nextInt();
        System.out.println("Introduceti cantitatea de hrisca");
        h = cin.nextInt();

        h = h + o;
        o = h - o;
        h = h - o;
        System.out.println("Cantitatea de orez este " + o);
        System.out.println("Cantitatea de hrisca este " + h);
    }
}
