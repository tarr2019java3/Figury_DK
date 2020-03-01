package pl.sda.figury;


import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        Rectangle rectangle = new Rectangle();

        Scanner obliczTrojkat = new Scanner(System.in);

        System.out.println("Podaj 2 boki trójkąta, zeby oblicz jego obwod i pole");

       try {
           int sideA = obliczTrojkat.nextInt();
           int sideB = obliczTrojkat.nextInt();

           double obwodTrojkata = triangle.getPerimeter(sideA, sideB);
           System.out.println("Obwód trójkąta o podanych bokach, to: " + obwodTrojkata);

           double poleTrojkata = triangle.getArea(sideA, sideB);
           System.out.println("Pole trójkąta o podanych bokach, to: " + poleTrojkata);
           System.out.println();
       } catch (Exception wyjatek){
           wyjatek.printStackTrace();
           System.out.println("Podana wartość nie jest liczbą.");
           exit(0);
       }


        Scanner obliczProstokat = new Scanner(System.in);

        System.out.println("Podaj 2 boki prostokąta, zeby oblicz jego obwod i pole");


        try {
            int sideA2 = obliczProstokat.nextInt();
            int sideB2 = obliczProstokat.nextInt();


            double obwodProstokat = rectangle.getPerimeter(sideA2, sideB2);

            System.out.println("Obwód prostokąta o podanych bokach, to: " + obwodProstokat);

            double poleProstokat = triangle.getArea(sideA2, sideB2);

            System.out.println("Pole prostokąta o podanych bokach, to: " + poleProstokat);
            System.out.println();
        } catch (Exception wyjatek){
            System.out.println("Podana wartość nie jest liczbą.");
            wyjatek.printStackTrace();
            exit(0);
        }

    }

}
