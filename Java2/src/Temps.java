// *C to F

import java.util.Scanner;

public class Temps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the tempc: ");
        float tempc = in.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
}