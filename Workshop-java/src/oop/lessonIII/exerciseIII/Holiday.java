package oop.lessonIII.exerciseIII;

import java.util.List;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public boolean inSameMonth(String month1) {
        return month.equals(month1);
    }

    public double avgDate(List<Holiday> holidays) {
        int i = 0;
        double avg = 0;
        for (Holiday h : holidays) {
            avg += h.getDay();
            i++;
        }
        return avg / i;
    }
}
