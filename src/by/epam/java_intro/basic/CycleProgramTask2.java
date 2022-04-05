package by.epam.java_intro.basic;

public class CycleProgramTask2 {

    //2. Вычислить значения функции на отрезке [а,b] c шагом h:

    public static void main(String[] args) {


        int a;
        int b;
        int h;
        int y;


        a = -2;
        b = 6;
        h = 2;


        for (int i = a; i <= b; i += h) {

            if (i > 2) {

                y = i;

            } else {

                y = i * (-1);
            }

            System.out.println("При х = " + i + " у = " + y);

        }

        System.out.println();

    }
}
