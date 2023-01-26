package oop.lessonIII.exerciseI;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.5, 3.5);
        Rectangle rectangle3 = new Rectangle(2.5);

        System.out.println(rectangle1.calculateTheArea());
        System.out.println(rectangle2.calculateTheArea());
        System.out.println(rectangle3.calculateTheArea());
    }
}
