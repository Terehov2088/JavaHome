package com.company;

import static java.lang.Math.*;

public class HomeWork8 {

    public static void main(String[] args) {

    /* Задача 8: Дано две стороны треугольника и угол между ними в градусах.
        Найти длину третьей стороны, периметр и площадь треугольника.
         */
        var a = 5;
        var b = 7;
        var i = 30;

        var c = sqrt(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(i));
        var p = a + b + c;
        var pp = (double) 1/2 * p;

        var s = sqrt(pp * (pp-a) * (pp-b) * (pp-c));


        System.out.printf("Третья сторона треугольника: %.2f Площадь треугольника: %.2f см  Периметр треугольника: %.2f см \n", c, s, p);

    }
}
