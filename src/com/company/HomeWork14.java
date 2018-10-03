package com.company;
import java.lang.String;
import java.util.Scanner;


public class HomeWork14 {


    public static void main(String[] args) {

    /* Усовия задачи:
    Каждый из трех туристов за час прошел от 1 до 9 миль по пересеченной местности.
    Эти данные сохранились в виде одного трехзначного числа (например 473).
    Напишите функцию, которая по этому числу найдет сколько всего прошли туристы (т.е. Задано число 473.
    По этому числу рассчитывается общий путь: 4+7+3=14 миль).
    */

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double Number = in.nextDouble();
    var Distance = Distance(Number);
        System.out.printf("Три туриста вместе прошли:  %.0f миль \n", Distance);


    }
    public static double Distance(double Distance){

        String Distance1 = Double.toString(Distance);

        char D1C = Distance1.charAt(0);
        char D2C = Distance1.charAt(1);
        char D3C = Distance1.charAt(2);

        int D1I = Character.digit(D1C,10);
        int D2I = Character.digit(D2C,10);
        int D3I = Character.digit(D3C,10);


        return D1I + D2I + D3I;

    }

}
