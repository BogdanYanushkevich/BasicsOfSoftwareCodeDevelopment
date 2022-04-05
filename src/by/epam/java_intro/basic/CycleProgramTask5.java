package by.epam.java_intro.basic;

public class CycleProgramTask5 {

    /*5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
            заданному е. Общий член ряда имеет вид:                               */

    public static void main(String[] args) {

        int n;
        double e;
        double sum;
        double an;


        n = 10;
        e = 0.33;
        sum = 0.0;
        an = 0.0;


        for (int i = 1; i <= n; i++) {

            an = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

            if (Math.abs(an) >= e) {

                sum += an;
            }
        }


        System.out.println("Сумма равна : " + sum);

    }
}
