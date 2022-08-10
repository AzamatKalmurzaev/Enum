package com.company;

public enum DayOfTheWeek {
    MONDAY("Шейшенби куну англис тил сабагын окуйм"),
    TUESDAY("Шейшенби куну англис тил сабагын окуйм"),
    WEDNESDAY("Шейшенби куну англис тил сабагын окуйм"),
    THURSDAY("Шейшенби куну англис тил сабагын окуйм"),
    FRIDAY("Шейшенби куну англис тил сабагын окуйм"),
    SATURDAY("Шейшенби куну англис тил сабагын окуйм"),
    SUNDAY("Шейшенби куну англис тил сабагын окуйм");

    private String DayOftheWeek;

    DayOfTheWeek(String dayOftheWeek) {
        DayOftheWeek = dayOftheWeek;
    }

    public String getDayOftheWeek() {
        return DayOftheWeek;
    }

    public void setDayOftheWeek(String dayOftheWeek) {
        DayOftheWeek = dayOftheWeek;
    }

    @Override
    public String toString() {
        return "DayOfTheWeek{" +
                "DayOftheWeek='" + DayOftheWeek + '\'' +
                '}';
    }
}
