package com.company;

import java.awt.geom.Area;

import static java.lang.Math.*;

public class HomeWork11 {
    public static void main(String[] args) {
        /* Задача 6: В переменных a и b лежат положительные длины катетов прямоугольного треугольника
                     Вычислить и вывести на экран площадь треугольника и его периметр. */

        double Area = Area(3, 4);
        double Perimeter = Perimeter(3, 4);


        System.out.printf("Площадь прямоугольного треугольника: %.0f см2   Периметр прямоугольного треугольника: %.0f см \n", Area, Perimeter);
    }

    public static double Area(double a, double b) {

        var Area = (double) 1 / 2 * a * b;
        return Area;
    }

    public static double Perimeter(double a, double b) {
        double c = sqrt((pow(a, 2) + pow(b, 2)));
        double Perimeter = a + b + c;
        return Perimeter;
    }

}
