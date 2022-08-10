package com.company;

import java.util.Scanner;

import static com.company.DayOfTheWeek.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        DayOfTheWeek DayOfTheWeek = com.company.DayOfTheWeek.valueOf(scanner.nextLine());
        switch ((DayOfTheWeek)){
            case MONDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case TUESDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case WEDNESDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case THURSDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case FRIDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case SATURDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
            case SUNDAY -> System.out.println("Шейшенби куну англис тил сабагын окуйм");
        }





    }
    }







