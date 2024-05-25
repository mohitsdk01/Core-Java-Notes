//import java.util.*;

import java.util.Scanner;

class Point2D{
    private int x = 0;
    private int y = 0;
    Point2D(){
    }
    Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String show(){
        return "x: "+ x +" y: " + y;
    }
    public void AcceptPoints(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt(); //5 //8
        System.out.println("Enter y: "); 
        int y = sc.nextInt();  //6 //9
    }
    public double calculateDistance(Point2D p2){
        int xValue = p2.x - this.x;
        int yValue = p2.y - this.y;
        double res = Math.sqrt((xValue * xValue) + (yValue * yValue));
        return res;
    }
    public boolean isEqual(Point2D p2){
        // System.out.println(p2.x + p2.y);
        return this.x == p2.x && this.y == p2.y;
    }
}

// d=√((x2 – x1)² + (y2 – y1)²)