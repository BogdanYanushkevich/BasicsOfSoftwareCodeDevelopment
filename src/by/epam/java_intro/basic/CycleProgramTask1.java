package by.epam.java_intro.basic;

import java.util.Scanner;

public class CycleProgramTask1 {

    /* 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
          все числа от 1 до введенного пользователем числа. */

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int sum;
        int n;

        sum = 0;


        do {
            System.out.print("Введите любое целое положительное число >> ");

            while (!sc.hasNextInt()) {
                System.out.print("Введите любое целое положительное число >> ");
                sc.next();
            }
            n = sc.nextInt();

        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("Сумма всех чисел от 1 до " + n + " = " + sum);

    }
}
