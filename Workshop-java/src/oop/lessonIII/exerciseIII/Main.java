package oop.lessonIII.exerciseIII;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Test1", 15, "January");
        Holiday holiday2 = new Holiday("Test2", 25, "January");
        Holiday holiday3 = new Holiday("Independence Day", 4, "July");

        System.out.println(holiday1.inSameMonth(holiday2.getMonth()));

        List<Holiday> holidays = new ArrayList<>();

        holidays.add(holiday1);
        holidays.add(holiday2);
        holidays.add(holiday3);

        System.out.println(holiday1.avgDate(holidays));
    }
}
