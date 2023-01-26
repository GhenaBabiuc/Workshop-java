package oop.lessonIII.exerciseII;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double... v) {
        if (v.length == 1) {
            this.length = v[0];
            this.width = v[0];
        } else if (v.length == 2) {
            this.length = v[0];
            this.width = v[1];
        }
    }

    public double calculateTheArea() {
        return length * width;
    }
}
