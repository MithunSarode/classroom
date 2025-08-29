import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
        sum();
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int sum1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int sum2 = in.nextInt();
        int sum = sum1 + sum2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int sum1 = in.nextInt();
        System.out.print("Enter the number 2: ");
        int sum2 = in.nextInt();
        int sum = sum1 + sum2;
        System.out.println("The total sum is: " + sum);
    }
}