package by.epam.java_intro.basic;

import java.util.Scanner;

public class CycleProgramTask7 {

    /*7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
            m и n вводятся с клавиатуры.             */

    public static void main(String[] args) {


        int m;
        int n;
        int temp;


        m = scan("Введите натуральное число m >> ");
        n = scan("Введите натуральное число n >> ");


        if (m > n) {

            temp = m;
            m = n;
            n = temp;
        }

        while (m <= n) {

            System.out.print("Число " + m + " имеет делители : ");

            for (int j = 2; j <= m / 2; j++) {

                if (m % j == 0) {

                    System.out.print(j + " ");
                }
            }
            m++;


            System.out.println();
        }
    }

    public static int scan(String invitation) {

        Scanner sc = new Scanner(System.in);

        int res;

        do {
            System.out.print(invitation);

            while (!sc.hasNextInt()) {

                System.out.print(invitation);

                sc.next();
            }

            res = sc.nextInt();

        } while (res <= 0);

        return res;

    }
}