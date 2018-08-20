package com.company;

import java.util.Scanner;

public class HomeWork119 {
    public static void main(String[] args) {

    /* Задача 11: Дети слепили снеговика из 3х идеальной формы шаров снега. Шары получились радиусами 1м, 0.5м и 0.2м.
    Учитывая, что коэффициент плотности снежных шаров равен 0.7кг/м3, найти сколько весит снеговик.
         */


//    Scanner in = new Scanner(System.in);

        var MassAll = MassAll(1, 0.5 ,0.2, 0.7);

        System.out.printf("Снеговик весит = %.2f кг \n", MassAll);

    }
    public static double MassAll(double Value1, double Value2, double Value3, double Density){

        var Mass1 = Value1 * Density;
        var Mass2 = Value2 * Density;
        var Mass3 = Value3 * Density;

        var MassAll = Mass1 + Mass2 + Mass3;
        return MassAll;
    }
}
