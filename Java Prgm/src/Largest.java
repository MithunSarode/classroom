import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

//        int max = 0;
//        if (a>b){
//            max = a;
//        }else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(Math.max(23, 45));

        char ch = in.next().trim().charAt(0);
        if (ch > 'a' && ch < 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }

    }
}
