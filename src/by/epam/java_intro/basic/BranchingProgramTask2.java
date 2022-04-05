package by.epam.java_intro.basic;

public class BranchingProgramTask2 {

    //2. Найти max{min(a, b), min(c, d)}.

    public static void main(String[] args) {


        int a;
        int b;
        int c;
        int d;
        int minAB;
        int minCD;
        int maxABCD;


        a = 654;
        b = 212;
        c = 35;
        d = 4346536;


        if (a < b) {

            minAB = a;

        } else {

            minAB = b;
        }

        if (c < d) {

            minCD = c;

        } else {

            minCD = d;
        }

        if (minAB < minCD) {

            maxABCD = minCD;

        } else {

            maxABCD = minAB;
        }


        System.out.println(maxABCD);

    }
}
