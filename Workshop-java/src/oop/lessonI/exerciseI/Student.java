package oop.lessonI.exerciseI;

import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String name;
    private String yearOfBirth;
    private int note1;
    private int note2;
    private int note3;

    public int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(yearOfBirth, formatter);
        LocalDate end = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(localDate1, end);
    }

    public double calculateAverageScore() {
        return (note1 + note2 + note3) / 3;
    }

    public boolean calculateDebt() {
        return note1 < 5 || note2 < 5 || note3 < 5;
    }

    public int calculateScholarship() {
        if (!calculateDebt() && calculateAverageScore() > 7.5) {
            return 500;
        } else {
            return 0;
        }
    }
}
