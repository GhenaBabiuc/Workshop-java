package oop.exerciseI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("Introduceti numele studentului ");
            student.setName(cin.next());
            System.out.println("Introduceti data nasterii in format dd/MM/yyyy");
            student.setYearOfBirth(cin.next());
            System.out.println("Introduceti nota 1");
            student.setNote1(cin.nextInt());
            System.out.println("Introduceti nota 2");
            student.setNote2(cin.nextInt());
            System.out.println("Introduceti nota 3");
            student.setNote3(cin.nextInt());
            students.add(student);
        }

        System.out.println("--------------------Studentii restatieri-----------------");
        for (Student s : students) {
            if (s.calculateDebt()) {
                System.out.println(s.toString());
            }
        }

        System.out.println("--------------------Studentii cu bursa-----------------");
        for (Student s : students) {
            if (s.calculateScholarship() > 0) {
                System.out.println(s.toString() + " cu bursa: " + s.calculateScholarship());
            }
        }

        System.out.println("--------------------studenți sub 18 ani-----------------");
        for (Student s : students) {
            if (s.calculateAge() < 18) {
                System.out.println(s.toString());
            }
        }
    }
}