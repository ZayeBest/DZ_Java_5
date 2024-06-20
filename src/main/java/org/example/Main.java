package org.example;

import org.example.Classes.MyInt;
import org.example.Classes.Point;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyInt a1 = new MyInt();
        MyInt a2 = new MyInt();
        a1 = new MyInt(3);
        a2.x = a1.x;
        System.out.println("a1.x = " + a1.x);
        System.out.println("a2.x = " + a2.x);
        a1.x = 30;
        System.out.println("a1.x = " + a1.x);
        System.out.println("a2.x = " + a2.x);

        Point[] dots = new  Point[4];
        dots[0] = new Point(12,50);
        dots[1] = new Point(13,50);
        dots[2] = new Point(14,50);
        dots[3] = new Point(15,50);

        System.out.println("");

        for (int i = 0; i < 4; i++){
            System.out.println(" Dot #"+ (i+1)+":");
            dots[i].info();
        }

        System.out.println("\n Dots with point that equals to 2: ");

        for (int i = 0; i < 4; i++){
            if (dots[i].x%2 == 0 && dots[i].y%2 == 0 ){
                dots[i].info();
            }

//            dots[i].info();
        }



    }
}