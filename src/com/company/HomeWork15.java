package com.company;
import java.lang.String;
import java.util.Scanner;

public class HomeWork15 {

    public static void main(String[] args) {

        /* Усовия задачи 15:
    Написать функцию, которая принимает одно целое число в качестве параметра, и возвращает ответ о том четное это число или нет.
    */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        double Number = in.nextDouble();
        TestOfEven(Number);

    }

    public static void TestOfEven(double Number){
        if (Number % 2 == 0){
            System.out.printf("Число %.0f четное", Number);
        }
        else{
            System.out.printf("Число %.0f не четное", Number);
        }



    }
}
