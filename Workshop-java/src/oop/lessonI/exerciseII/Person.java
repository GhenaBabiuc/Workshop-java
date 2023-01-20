package oop.lessonI.exerciseII;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private String yearOfBirth;
    private String gender;
    private int height;

    public int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate1 = LocalDate.parse(yearOfBirth, formatter);
        LocalDate end = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(localDate1, end);
    }

    public double calculateWeight() {
        if (gender.equalsIgnoreCase("M")) {
            return (double) (50 + 0.75 * (height - 150) + (calculateAge() - 20) / 4);
        } else {
            return (double) (50 + 0.75 * (height - 150) + (calculateAge() - 20) / 4) - 10;
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", height=" + height + '\'' +
                ", Age=" + calculateAge() + '\'' +
                ", Weight=" + calculateWeight();
    }
}
