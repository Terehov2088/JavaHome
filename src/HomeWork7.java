import static java.lang.Math.*;
import java.lang.String.*;

public class HomeWork7 {
    public static void main(String[] args) {
        /* Задача 6: В переменных a и b лежат положительные длины катетов прямоугольного треугольника
                     Вычислить и вывести на экран площадь треугольника и его периметр. */

        System.out.println("Hello World");

        var a = 3;
        var b = 4;


        var c = sqrt((pow(a, 2) + pow(b , 2)));

        var s = (double)1/2 * a * b;
        var p = a + b +c;

        System.out.printf("Площадь прямоугольного треугольника: %.0f см   Периметр прямоугольного треугольника: %.0f см \n", s, p);


        /*Задача 7: Даны координаты двух вершин прямоугольника, которые находятся на противоположных концах диагонали.
          Стороны прямоугольника параллельны осям координат.
          Найти площадь прямоугольника и его периметр */



//        int[] num0 = new int[] { 0, 0};
//        int[] num1 = new int[] { 5, 0};
//        int[] num2 = new int[] { 0, 5};



//        var num3 = num1[0] - num0[0];
//        System.out.print(a);
//
//        String toString1 = java.util.Arrays.toString(num3);
//        System.out.println(toString1);
//
//
//
//        int [] mas = {4,5,6};
//        System.out.println(mas); // - выводит "[I@28d93b30"
//        String toString1 = java.util.Arrays.toString(mas);
//        System.out.println(toString1); // - выводит [4, 5, 6]





    }
}

