import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("Multiplication of number : " + num);
        for (int i = 0; i <= 10; i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
