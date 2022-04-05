package by.epam.java_intro.basic;

public class LinearProgramTask3 {

    /*3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan((x * y))         */

    public static void main(String[] args) {


        double x;
        double y;
        double solution;


        x = 1.5;
        y = 2.5;

        solution = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan((x * y));


        System.out.println("answer : " + solution);

    }
}
