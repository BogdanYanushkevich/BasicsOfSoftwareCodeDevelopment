package by.epam.java_intro.basic;

public class BranchingProgramTask4 {

    /*4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
        отверстие.         */

    public static void main(String[] args) {


        int a;
        int b;
        int x;
        int y;
        int z;
        String resol;


        a = 10;
        b = 20;
        x = 5;
        y = 15;
        z = 25;


        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {

            resol = "Кирпич пройдет";

        } else {

            resol = "Кирпич не пройдет";
        }


        System.out.println(resol);

    }
}
