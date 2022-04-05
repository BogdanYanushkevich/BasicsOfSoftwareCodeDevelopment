package by.epam.java_intro.basic;

public class CycleProgramTask8 {

    //8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    public static void main(String[] args) {

        int a;
        int b;

        a = 63403565;
        b = 763403565;


        if (a == 0) {
            for (int i = b; i > 0; i /= 10) {

                if (i % 10 == 0) {

                    System.out.print(0);
                    break;
                }
            }
        }

        if (b == 0) {
            for (int i = a; i > 0; i /= 10) {

                if (i % 10 == 0) {

                    System.out.print(0);
                    break;
                }
            }
        }


        if (a < 0 || b < 0) {

            a = Math.abs(a);
            b = Math.abs(b);

        }


        for (int i; a > 0; a /= 10) {

            i = a % 10;

            for (int j = b; j > 0; j /= 10) {

                if (j % 10 == i) {

                    System.out.print(i + " ");
                    break;

                }
            }
        }


    }
}



