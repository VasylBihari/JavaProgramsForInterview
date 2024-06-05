import java.util.Scanner;

public class BreakContinueWhileLoop {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner (System.in);

        while (true){
            System.out.println("Input an integer");
            n = scanner.nextInt();

            if (n!=0){
                System.out.println("You enetered " + n);
                continue;
            }
            else {
                System.out.println("You entered zero");
                break;
            }
        }
    }
}
