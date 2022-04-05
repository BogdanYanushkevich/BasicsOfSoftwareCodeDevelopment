package by.epam.java_intro.basic;

public class LinearProgramTask2 {

    /*2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
         */

    public static void main(String[] args) {


        double a;
        double b;
        double c;
        double solution;


        a = 1.5;
        b = 2.5;
        c = 3.5;

        solution = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);


        System.out.println("answer = " + solution);

    }
}
