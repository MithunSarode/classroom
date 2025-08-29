import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Good for health");
                break;
            case "Grapes":
                System.out.println("Small friut");
                break;
            case "Orange":
                System.out.println("Round in shape");
                break;
            default:
                System.out.println("Invalid Fruit");
                break;
        }

        // Another way of representation

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Good for health");
            case "Grapes" -> System.out.println("Small friut");
            case "Orange" -> System.out.println("Round in shape");
            default -> System.out.println("Invalid Fruit");
        }
    }
}
