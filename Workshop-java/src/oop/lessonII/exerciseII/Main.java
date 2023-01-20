package oop.lessonII.exerciseII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            System.out.println("Introduceti numele");
            student.setName(cin.next());
            System.out.println("Introduceti media");
            student.setAverage(cin.nextInt());
            students.add(student);
        }

        for (Student s : students) {
            System.out.println("Student " + s.getName() + " with average " + s.getAverage() + " has " + s.qualityPoints(s.getAverage()));
        }
    }
}
