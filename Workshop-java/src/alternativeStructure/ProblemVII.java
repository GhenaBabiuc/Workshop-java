package alternativeStructure;

import java.util.Scanner;

public class ProblemVII {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the month");
        byte month = cin.nextByte();
        int numDays = 0, year;
        System.out.println("enter the year");
        year = cin.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> numDays = 31;
            case 4, 6, 9, 11 -> numDays = 30;
            case 2 -> {
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) numDays = 29;
                else numDays = 28;
            }
            default -> System.out.println("inexistent");
        }
        System.out.println(numDays);
    }
}
