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
        double z6 = pow((log( 1 + c ) / -b ), 4) + abs(a);



        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);
        System.out.println(z5);
        System.out.println(z6);




    }
}
