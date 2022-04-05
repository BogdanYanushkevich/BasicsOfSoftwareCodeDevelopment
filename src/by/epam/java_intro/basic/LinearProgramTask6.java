package by.epam.java_intro.basic;

public class LinearProgramTask6 {

    /*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
        принадлежит закрашенной области, и false — в противном случае:         */

    public static void main(String[] args) {


        double x;
        double y;
        boolean result;


        x = 2;
        y = 8;

        result = ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x >= -4 && x <= 4));


        System.out.println(result);

    }
}
