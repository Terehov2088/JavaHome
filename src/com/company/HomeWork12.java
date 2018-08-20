package com.company;
import java.util.Scanner;
public class HomeWork12 {
    public static void main(String[] args) {

    /* Задача 12: Написать две функции для обменника валют: одна - для конвертирования гривен в доллары, вторая - наоборот.
    Функции должны принимать в параметре одну валюту, а возвращать другую.
         */

        Scanner in = new Scanner(System.in);
        var quantity1 = in.nextFloat();
        var quantity2 = in.nextFloat();
        var Dollar = GrivnaDollar(quantity1, 28);
        var Grivna = DollarGrivna(quantity2, 28);

        System.out.printf("При обмене гривны на доллар получим:  %.2f долларов , " +
                "При обемене доллара на гривну получим: %.2f гривен \n", Grivna, Dollar);

    }
    public static double GrivnaDollar(double quantity1, double KursDollara){

        var DollarQuantity = quantity1 * KursDollara;
        return DollarQuantity;
    }
    public static double DollarGrivna(double quantity2, double KursDollara) {

        var DollarQuantity = quantity2 / KursDollara;
        return DollarQuantity;
    }
}
