package com.company;
import java.lang.String;



public class HomeWork16 {


    public static void main(String[] args) {

        /* Усовия задачи 16:
    Два поезда движутся на скорости V1 и V2 на встречу друг другу. Между ними 10 км. пути.
    Через 4 км пути первый поезд может свернуть на запасной путь. При заданных скоростях узнать столкнуться ли поезда.
    */

        if (Crashed(1,7) == true){
            System.out.print("Поезда столкнутся");
        }
        else {
            System.out.print("Поезда не столкнутся");
        }

    }
    public static boolean Crashed(int V1, int V2){
        var Time = 1;
        if (V1 * Time <= 4 & V2 * Time >= 6){
            return true;
        }
        else {
            return false;
        }
    }
}
