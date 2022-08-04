package com.company;

public class Main {

    public static void main(String[] args) {

        DayOfTheWeek day = DayOfTheWeek.FRIDAY;

        switch(day){
            case MONDAY -> System.out.println("Дуйшомбу куну Java окуйм");
            case TUESDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case WEDNESDAY -> System.out.println("Шаршенби куну кыргыз тил сабагын окуйм");
            case THURSDAY -> System.out.println("Бейшемби куну СофтСкилс сабагын окуйм ");
            case FRIDAY -> System.out.println("Жума куну илим сабагын окуйм");
            case SATURDAY -> System.out.println("Ишемби куну адабий китеп окуу");
            case SUNDAY -> System.out.println("Жекшемби куну сейилдоо куну");
        }
    }
}
