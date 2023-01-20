package oop.lessonII.exerciseII;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int average;

    public int qualityPoints(int average) {
        int n = 5;
        if (100 >= average && average >= 90) {
            n = 4;
        } else if (89 >= average && average >= 80) {
            n = 3;
        } else if (79 >= average && average >= 70) {
            n = 2;
        } else if (69 >= average && average >= 60) {
            n = 1;
        } else if (60 > average) {
            n = 0;
        }
        return n;
    }
}
