package by.epam.java_intro.basic;

public class BranchingProgramTask3 {

    //3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public static void main(String[] args) {


        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        String resol;


        x1 = 3;
        y1 = 6;
        x2 = 4;
        y2 = 7;
        x3 = 5;
        y3 = 8;


        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1)) {

            resol = "Будут расположены на одной прямой";

        } else {

            resol = "Не будут расположены на одной прямой";
        }


        System.out.println(resol);

    }
}
