package org.example.Classes;

public class Point {
    public int x;
    public int y;

    public Point (int a, int b){
        this.x = a;
        this.y = b;
    }

     public void info(){
        System.out.println("X = "+ this.x+ ", Y = "+ this.y);
     }
}
