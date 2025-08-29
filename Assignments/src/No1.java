// Practice Questions

// Area of Cricle

import java.util.Scanner;

public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the radius of the cricle: ");
       double radius = in.nextDouble();
       double area = Math.PI * radius * radius;
       System.out.println("The area of the Cricle is: " + area);
   }
}


// Area of Triangle

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the length of the Triangel: ");
       float length = in.nextFloat();
       System.out.print("Enter the Breadth of the Triangle: ");
       float breadth = in.nextFloat();
       float area = 1/2f * length * breadth;
       System.out.println("The area of the Tringle is: " + area);
   }
}


// Area of Rectangle

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the length: ");
       int length = in.nextInt();
       System.out.print("Enter the width: ");
       int width = in.nextInt();
       int area = length * width;
       System.out.println("The area of the Rectangle is: " + area);
   }
}


// Area Of Isosceles Triangle

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the same side of the triangle(a): ");
       double a = in.nextDouble();
       System.out.print("Enter the base of the tringle(b): ");
       double b = in.nextDouble();
       double area = (b/4.0)*Math.sqrt(4*(a*a)-(b*b));
       System.out.println("Area Of Isosceles Triangle: " + area);
   }
}


// Area Of Parallelogram

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the breadth: ");
       int b = in.nextInt();
       System.out.print("Enter the height: ");
       int h = in.nextInt();
       int area = b*h;
       System.out.println("Area Of Parallelogram: " + area);
   }
}


// Area Of Rhombus

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the Dignoal1: ");
       int p = in.nextInt();
       System.out.print("Enter the Dignoal2: ");
       int q = in.nextInt();
       int area = (p*q)/2;
       System.out.println("Area Of Rhombus: " + area);
   }
}


// Area Of Equilateral Triangle

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the side of the triangle: ");
       double t = in.nextDouble();
       double area = Math.sqrt(3)/4 * (t*t);
       System.out.println("Area Of Equilateral Triangle: " + area);
   }
}


// Perimeter Of Circle

import java.util.Scanner;
public class No1 {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the raidus of the circle: ");
       double r = in.nextDouble();
       double area = 2 * Math.PI * r;
       System.out.println("Perimeter of Circle: " + area);
   }
}


// Perimeter Of Equilateral Triangle

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the sides: ");
       int s = in.nextInt();
       int per = 3*s;
       System.out.println("Perimeter Of Equilateral Triangle: " + per);
   }
}


// Swaping of the two numbers

import java.util.Scanner;
public class No1{
   public static void main(String[] args) {
       int a = 10;
       int b = 20;

       swap(a , b);
       System.out.println(a + " " + b);
   }
   static void swap(int a, int b){
       int temp = a;
       a = b;
       b = temp;
   }
}


// Swaping of the two numbers using Array

import java.util.Scanner;
public class No1 {
   public static void main(String[] args) {
       int[] arr = {10, 20};
       swap(arr);
       System.out.println(arr[0] + " " + arr[1]);
   }
   static void swap(int[] arr){
       int temp = arr[0];
       arr[0] = arr[1];
       arr[1] = temp;
   }
}

