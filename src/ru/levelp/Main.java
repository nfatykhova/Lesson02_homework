package ru.levelp;

/**
 * Created by natalie on 23.02.16.
 */

/*
        Решение квадратных уравнений
        ax^2 + bx + c = 0
        if/else разные корни, комплексные числа
        1) Найти решение
        2) Пользователь вводит a, b, c
        3) Выводится ответ: x1 = 1, x2 = 2
        x = -3+4i (комплексные числа)
         */

import static java.lang.Math.*;
import ru.levelp.Complex;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner
        System.out.println("Вас приветствует программа вычисления квадратного уравнения ax^2 + bx + c = 0");
        double a,b,c;
        System.out.println("Введите значение \"a\": ");
        a = sc.nextDouble();
        System.out.println("Введите значение \"b\": ");
        b = sc.nextDouble();
        System.out.println("Введите значение \"c\": ");
        c = sc.nextDouble();
        double d = pow(b,2) - 4 * a * c;
        if (d > 0) {
            double x1 = (-b + sqrt(d))/(2 * a);
            double x2 = (-b - sqrt(d))/(2 * a);
            System.out.println("Корень x1 = " + x1 + "\nКорень х2 = " + x2);
        }
        if (d == 0) {
            double x = -b / (2 * a);
            System.out.println("Корень x1 = " + x);
        }
        if (d < 0) {
            System.out.println("Данное уравнение не имеет действительных корней.");
        }

    }
}


    /*Complex complex = new Complex(double re, double im);



        double x1 = (-b + sqrt(d))/(2 * a);
        double x2 = (-b - sqrt(d))/(2 * a);
        System.out.println("Корень x1 = " + x1 + "\nКорень х2 = " + x2);*/