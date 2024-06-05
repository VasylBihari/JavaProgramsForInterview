/*How to check Odd and Even Number*/

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        int x;
        System.out.println("Enter an integer to check if it is odd or even: ");
        Scanner scanner = new Scanner (System.in);
        x = scanner.nextInt();

        if (x%2==0){
            System.out.println("You entered an even number");
        } else {
            System.out.println("You entered an odd number");
        }
    }
}
