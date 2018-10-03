package com.company;
import java.lang.String;
import java.util.Scanner;

import static java.lang.System.out;

public class HomeWork18 {

    public static void main(String[] args) {

           /* Усовия задачи 18:
    Траектория снаряда, выпущенного из катапульты, описывается квадратным уравнением.
    Решив квадратное уравнение, можно найти точку, где упал снаряд, и точку, где стоит катапульта.
    Написать функцию, которая по заданным параметрам уравнения найдет его корни и расчитает расстояние, на которое улетел снаряд.
    */
        Scanner in = new Scanner(System.in);
        out.print("Введите число A: ");
        double A = in.nextDouble();
        out.print("Введите число B: ");
        double B = in.nextDouble();
        out.print("Введите число C: ");
        double C = in.nextDouble();


        out.println("Найдем решение квадратного уранвения: a*pow(x, 2) + b*x + c = 0");

        var Discriminant = Math.pow(B, 2) - 4 * A * C;
        if (Discriminant == 0){
           var X1 = ((-B + Math.sqrt(Discriminant)) / (2 * A));
           out.println("Уравнение имеет единственный корень: x = " + X1);
        }
        else if (Discriminant > 0){
            var X1 = ((-B + Math.sqrt(Discriminant)) / (2 * A));
            var X2 = ((-B - Math.sqrt(Discriminant)) / (2 * A));
            out.println("Корни уравнения: x1 = " + X1 + ", x2 = " + X2);
        }
        else if (Discriminant < 0){
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
}
