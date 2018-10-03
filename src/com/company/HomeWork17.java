package com.company;
import java.math.*;


public class HomeWork17 {

    public static void main(String[] args) {

           /* Усовия задачи 17:
    Для охраны территории завода было запущено два дрона.
    Путь каждого дрона охватывает территорию, которая описывается окружностью с заданными радиусом и координатами центра.
    Написать функцию, которая отвечает на вопрос, могут ли столкнуться дроны.
    */
        if (Drons(10,1,1,1,1,1) == true){
            System.out.print("Дроны столкнутся");
        }
        else {
            System.out.print("Дроны не столкнутся");
        }


    }

    public static boolean Drons(double X1, double Y1, double R1, double X2, double Y2, double R2){
        if ((Math.sqrt(Math.pow((X1-X2),2) + Math.pow((Y1-Y2),2)) <= R1+R2) & (Math.sqrt(Math.pow((X1-X2),2) + Math.pow((Y1-Y2),2)) >= Math.abs(R1-R2))){
            return true;
        }
        else{
            return false;
        }

    }
}
