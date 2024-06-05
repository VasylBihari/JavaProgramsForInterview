import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

       int n;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Input an integer: ");

        while ((n=scanner.nextInt())!=0){
            System.out.println("You entered " + n);
            System.out.println("Input an integer");
        }
        System.out.println("Out of loop");
    }
}
