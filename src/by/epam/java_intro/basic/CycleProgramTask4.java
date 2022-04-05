package by.epam.java_intro.basic;

public class CycleProgramTask4 {

    //4. Составить программу нахождения произведения квадратов первых двухсот чисел.

    public static void main(String[] args) {

        long prod;


        prod = 1;


        for (long i = 1; i <= 200; i++) {

            prod *= i * i;

            System.out.println(i + "\t" + prod);

            if (prod < 0) {

                System.out.println("Произошло переполнение в строке: " + i);
                break;
            }
        }


    }
}

