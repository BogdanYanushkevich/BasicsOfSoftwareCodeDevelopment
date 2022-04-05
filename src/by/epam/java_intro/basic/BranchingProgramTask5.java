package by.epam.java_intro.basic;

public class BranchingProgramTask5 {

    //5.  Вычислить значение функции: f = Math.pow(x, 2) - 3 * x + 9; | f = 1 / (Math.pow(x, 3) + 6);

    public static void main(String[] args) {


        int x;
        double f;


        x = 10;


        if (x <= 3) {

            f = Math.pow(x, 2) - 3 * x + 9;

        } else {

            f = 1 / (Math.pow(x, 3) + 6);
        }


        System.out.println(f);

    }
}
