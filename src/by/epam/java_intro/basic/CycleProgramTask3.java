package by.epam.java_intro.basic;

public class CycleProgramTask3 {

    //3. Найти сумму квадратов первых ста чисел.

    public static void main(String[] args) {


        int sum;


        sum = 0;


        for (int i = 1; i <= 100; i++) {

            sum += i * i;
        }

        System.out.println(sum);

    }
}
