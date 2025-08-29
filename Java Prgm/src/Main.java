// Sum of the two numbers

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int rollno = input.nextInt();
//        System.out.println("Your rollno is " + rollno);

//        String name = input.next();
//        System.out.println(name);
//
//        Float num = input.nextFloat();
//        System.out.println(num);

//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum : " + sum);

//        int count = 0;
//        while(count != 5){
//            System.out.println(count);
//            count++;
//
//        }

//        for(int count = 1; count != 5; count++){
//            System.out.println(count);
//        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp: ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
