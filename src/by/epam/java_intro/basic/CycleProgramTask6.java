package by.epam.java_intro.basic;

public class CycleProgramTask6 {

    //6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

    public static void main(String[] args) {


        for (int i = 33; i <= 126; i++) {

            System.out.print(i + "\t " + (char) i + "\t");

            if (i % 16 == 0) {

                System.out.println();
            }
        }

        System.out.println();

    }
}
