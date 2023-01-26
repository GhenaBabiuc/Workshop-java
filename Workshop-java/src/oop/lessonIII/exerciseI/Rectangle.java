package oop.lessonIII.exerciseI;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }

    public double calculateTheArea() {
        return length * width;
    }
}
