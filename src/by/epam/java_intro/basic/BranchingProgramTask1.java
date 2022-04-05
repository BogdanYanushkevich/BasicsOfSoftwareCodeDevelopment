package by.epam.java_intro.basic;

public class BranchingProgramTask1 {

    /*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
        он прямоугольным.         */

    public static void main(String[] args) {

        int a;
        int b;


        a = 46;
        b = 44;


        if (a > 0 && b > 0 && (a + b) < 180) {

            System.out.print("Бывает. ");

            if (a == 90 || b == 90 || (a + b) == 90) {

                System.out.println("Это прямоугольный треугольник.");

            }
        } else {

            System.out.println("Не бывает");
        }

    }
}
