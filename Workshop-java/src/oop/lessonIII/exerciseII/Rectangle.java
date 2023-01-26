package oop.lessonIII.exerciseII;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle {
    private double length;
    private double width;

    public double calculateTheArea() {
        return length * width;
    }
}
