package com.company;

import static java.lang.Math.*;

public class HomeWork9 {
    public static void main(String[] args) {

    /* Задача 9: Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
    Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3, найти сколько весит снеговик.
         */
        var Value1 = 1;
        var Value2 = 0.5;
        var Value3 = 0.2;

        var Density = 0.7;

        var Mass1 = Value1 * Density;
        var Mass2 = Value2 * Density;
        var Mass3 = Value3 * Density;

        var MassAll = Mass1 + Mass2 + Mass3;

        System.out.printf("Снеговик весит = %.2f кг \n", MassAll);

    }
}
