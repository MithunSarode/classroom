// *C to F

//import java.util.Scanner;

//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the tempc: ");
//        float tempc = in.nextFloat();
//        float tempf = (tempc * 9/5) + 32;
//        System.out.println(tempf);
//    }
//}


// Print numbers from 1 to 5

//import java.util.Scanner;
//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int Count = 0;
//        while (Count!= 5){
//            System.out.println(Count);
//            Count++;
//        }
//    }
//}


// Leap Year

//import java.util.Scanner;
//
//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the year: ");
//        int year = in.nextInt();
//        if ((year%4==0 && year%400!=0) || (year%400==0)) {
//            System.out.println("Is leap year");
//        }else{
//            System.out.println("Not leap year");
//        }
//
//    }
//}


// Tables

//import java.util.Scanner;
//public class prgms{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        System.out.println("The Multiplication is : " + num);
//        for (int i=0; i<=10; i++){
//            System.out.println(num + "*" + i + "=" + (num*i));
//        }
//    }
//}


// Largest Numbers

//import java.util.Scanner;
//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//
//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }
//        System.out.println(max);
//    }
//}


// UpperCase or Lower Case

//import java.util.Scanner;
//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char ch = in.next().trim().charAt(0);
//        if(ch>='a' && ch<='z'){
//            System.out.println("LowerCase");
//        }else {
//            System.out.println("UpperCase");
//        }
//    }
//}


// Fibonacci Series

//import java.util.Scanner;
//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while(count <= n){
//            int temp = b;
//            b= b+a;
//            a = temp;
//            count++;
//        }
//        System.out.println(a);
//    }
//}


// Count Number

//import java.util.Scanner;
//public class prgms{
//    public static void main(String[] args) {
//        int n = 3575354;
//        int count = 0;
//        while(n > 0){
//            int rem = n%10;
//            if (rem == 5){
//                count++;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);
//    }
//}


// Reverse the given Number

//import java.util.Scanner;
//public class prgms {
//    public static void main(String[] args) {
//        int n = 2934;
//        int ans = 0;
//        while(n > 0){
//            int rem = n%10;
//            n = n / 10;
//            ans = ans*10 + rem;
//        }
//        System.out.println(ans);
//    }
//}


// Calculator

//import java.util.Scanner;
//public class prgms{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int ans = 0;
//        while(true){
//            System.out.print("Enter the Operation: ");
//            char op = in.next().trim().charAt(0);
//            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
//                System.out.print("Enter the Number: ");
//                int num1 = in.nextInt();
//                int num2 = in.nextInt();
//
//                if (op == '+'){
//                    ans = num1 + num2;
//                }
//                if (op == '-'){
//                    ans = num1 - num2;
//                }
//                if (op == '*'){
//                    ans = num1*num2;
//                }
//                if (op == '/'){
//                    if (num2 != 0){
//                        ans = num1/num2;
//                    }
//                }
//                if (op == '%'){
//                    ans = num1%num2;
//                }
//            } else if (op == 'x' || op == 'X') {
//                break;
//            }else {
//                System.out.println("Invalide Operator");
//            }
//            System.out.println(ans);
//        }
//    }
//}

// Switch Statement
//
//import java.util.Scanner;
//public class prgms {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Fruit: ");
//        String fruit = in.next();
//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of the Fruits");
//            case "Apple" -> System.out.println("keep Doctor away");
//            case "Orange" -> System.out.println("Round in shape");
//            case "Grapes" -> System.out.println("Small in Size");
//            default -> System.out.println("Invalide Fruits");
//        }
//    }
//}


// Area of Circle

import java.util.Scanner;
public class prgms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        double radius = in.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the Cricle is : " + area);
    }
}