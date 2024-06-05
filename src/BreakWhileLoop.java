import java.util.Scanner;

public class BreakWhileLoop {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input an integer ");
            n = scanner.nextInt();

            if (n == 0) {
                System.out.println("You entered zero!");
                break;
            }
            System.out.println("You entered " + n);
        }
    }
}
