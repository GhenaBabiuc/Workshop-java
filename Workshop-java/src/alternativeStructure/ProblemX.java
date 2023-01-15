package alternativeStructure;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProblemX {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String name1, name2, n1, n2;

        System.out.println("Introduceti numele primei persoane");
        name1 = cin.nextLine();
        System.out.println("Introduceti data nasterii in format dd/MM/yyyy");
        n1 = cin.nextLine();
        System.out.println("Introduceti numele a doilea persoane");
        name2 = cin.nextLine();
        System.out.println("Introduceti data nasterii in format dd/MM/yyyy");
        n2 = cin.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(n1, formatter);
        LocalDate localDate2 = LocalDate.parse(n2, formatter);
        LocalDate end = LocalDate.now();
        long years1 = ChronoUnit.YEARS.between(localDate1, end);
        long years2 = ChronoUnit.YEARS.between(localDate2, end);

        if (years1 > years2) {
            System.out.println("Persoana mai tanara este " + name2);
        } else {
            System.out.println("Persoana mai tanara este " + name1);
        }
    }
}
