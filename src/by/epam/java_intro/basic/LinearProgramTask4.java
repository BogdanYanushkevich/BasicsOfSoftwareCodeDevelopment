package by.epam.java_intro.basic;

public class LinearProgramTask4 {

    /*4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
        дробную и целую части числа и вывести полученное значение числа.         */

    public static void main(String[] args) {


        double x;
        double solution;


        x = 123.456;

        solution = (x * 1000) % 1000 + (int) x / 1000.0;


        System.out.println(solution);

    }
}
