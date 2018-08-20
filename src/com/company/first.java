package com.company;
import static java.lang.Math.*;

public class first {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int a = 8;
        float b = 16;
        float c = 11;
        double z1, z2;

        z1 = a + b * c / 2;
        z2 = (pow(a, 2) + pow(b, 2)) / 2;
        double z3 = (a + b) / 12 * (c % 4) + b;
        double z4 = ((a - b * c) / (a + b)) + floor(c);
        double z5 = abs(a - b) / pow((a + b), 3) - cos(c);
        double z6 = pow((log(1 + c) / -b), 4) + abs(a);


        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        System.out.println(z5);
        System.out.println(z6);

        int fz1 = func1(8, 16, 11);
        System.out.println(fz1);
        double fz2 = func2(8, 16, 11);
        System.out.println(fz2);
        var fz3 = Func3(8, 16, 11);
        var fz4 = Func4(8, 16, 11);
        var fz5 = Func5(8, 16, 11);
        var fz6 = Func6(8, 16, 11);

        System.out.println(fz3);
        System.out.println(fz4);
        System.out.println(fz5);
        System.out.println(fz6);


    }

    public static int func1(int a, int b, int c) {
        var z1 = a + b * c / 2;
        return z1;
    }

    public static double func2(double a, double b, double c) {
        var z2 = (pow(a, 2) + pow(b, 2)) / 2;
        return z2;
    }

    public static double Func3(double a, double b, double c) {
        var z3 = (a + b) / 12 * (c % 4) + b;
        return z3;
    }

    public static double Func4(double a, double b, double c) {
        double z4 = ((a - b * c) / (a + b)) + floor(c);
        return z4;
    }
    public static double Func5(double a, double b, double c) {
        double z5 = abs(a - b) / pow((a + b), 3) - cos(c);
        return z5;
    }
    public static double Func6(double a, double b, double c) {
        double z6 = pow((log(1 + c) / -b), 4) + abs(a);
        return z6;
    }

}
