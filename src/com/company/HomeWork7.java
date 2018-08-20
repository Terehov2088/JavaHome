package com.company;

import static java.lang.Math.*;

public class HomeWork7 {
    public static void main(String[] args) {
        /* Задача 6: В переменных a и b лежат положительные длины катетов прямоугольного треугольника
                     Вычислить и вывести на экран площадь треугольника и его периметр. */


        var a = 3;
        var b = 4;


        var c = sqrt((pow(a, 2) + pow(b , 2)));

        var s = (double)1/2 * a * b;
        var p = a + b +c;

        System.out.printf("Площадь прямоугольного треугольника: %.0f см2   Периметр прямоугольного треугольника: %.0f см \n", s, p);


        /*Задача 7: Даны координаты двух вершин прямоугольника, которые находятся на противоположных концах диагонали.
          Стороны прямоугольника параллельны осям координат.
          Найти площадь прямоугольника и его периметр */

        var x1 = 3;
        var x2 = 2;
        var y1 = 2;
        var y2 = 1;

        var A = abs(x2 - x1);
        var B = abs(y2 - y1);

        var Perimeter =(double) (A + B) * 2;
        var Area = (double) A * B;

        System.out.printf("Площадь прямоугольника: %.0f см2   Периметр прямоугольника: %.0f см \n", Area, Perimeter);


    }
}

