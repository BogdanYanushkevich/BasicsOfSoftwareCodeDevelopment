package by.epam.java_intro.basic;

public class LinearProgramTask5 {

    /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
        данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.         */

    public static void main(String[] args) {


        int t;
        int h;
        int m;
        int s;


        t = 18974;

        h = t / 3600;
        m = t / 60 % 60;
        s = t % 60;


        System.out.println(h + ":" + m + ":" + s);

    }
}
