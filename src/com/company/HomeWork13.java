package com.company;
import java.util.*;

public class HomeWork13 {
    public static void main(String[] args){

        /* На первой колонизированной людьми планете Земля-2 введен календарь, который содержит 10 месяцев в году.
        В каждом месяце 42 дня.
        Первый день колонизации отмечен датой 01.01.01.
        Написать функцию, которая по дате, заданной тремя числами (число, месяц, год)
        рассчитывает сколько дней прошло со времени колонизации Земли-2.
         */
        var DeltaDays = DataColonis(30, 1, 2);
        System.out.printf("Со времени колонизации Земли-2 прошло:  %.0f дней \n", DeltaDays);

    }
    public static double DataColonis(double Days, double Months, double Years){
        var DayPast = (Years * 10 * 42) + (Months * 42) + Days;
        var FirstDay = 1;

        var DeltaDays = DayPast - FirstDay;
        return DeltaDays;


    }
}
