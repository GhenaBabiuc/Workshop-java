package oop.lessonIII.exerciseII;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.5, 3.5);
        Rectangle rectangle3 = new Rectangle();
        Rectangle rectangle4 = new Rectangle();

        rectangle3.setLength(3.5);
        rectangle4.setWidth(5.6);

        System.out.println(rectangle1.calculateTheArea());
        System.out.println(rectangle2.calculateTheArea());
        System.out.println(rectangle3.calculateTheArea());
        System.out.println(rectangle4.calculateTheArea());
    }
}
