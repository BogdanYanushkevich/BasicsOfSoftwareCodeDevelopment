package by.epam.java_intro.basic;

public class LinearProgramTask1 {

    //1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

    public static void main(String[] args) {


        int a;
        int b;
        int c;
        double z;


        a = 1;
        b = 2;
        c = 3;

        z = ((a - 3) * b / 2) + c;


        System.out.println("z = " + z);

    }
}