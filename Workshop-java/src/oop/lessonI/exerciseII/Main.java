package oop.lessonI.exerciseII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner cin = new Scanner(System.in);
        int gender;

        for (int i = 0; i < 3; i++) {
            Person person = new Person();
            System.out.println("Introduceti numele persoanei ");
            person.setName(cin.next());
            System.out.println("Introduceti data nasterii in format dd/MM/yyyy");
            person.setYearOfBirth(cin.next());
            do {
                System.out.println("Alegeti genul: 1 pentru Masculin si 2 pentru feminin ");
                gender = cin.nextInt();
            } while (gender != 1 && gender != 2);
            if (gender == 1) {
                person.setGender("M");
            } else {
                person.setGender("F");
            }
            System.out.println("Introduceti inaltimea in cm");
            person.setHeight(cin.nextInt());
            people.add(person);
        }


        System.out.println("--------------------Persoane cu vârsta peste 25 de ani-----------------");
        for (Person s : people) {
            if (s.calculateAge() > 25) {
                System.out.println(s.toString());
            }
        }

        System.out.println("--------------------Persoane cu greutatea cuprinsă între 55 și 80 kg-----------------");
        for (Person s : people) {
            if (s.calculateWeight() >= 55 && 80 <= s.calculateWeight()) {
                System.out.println(s.toString());
            }
        }
    }
}
