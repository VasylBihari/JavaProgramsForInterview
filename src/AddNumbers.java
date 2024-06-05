/*8.How to add two number*/

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
         int x, y, z;

        System.out.println("Enter x and y");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z=x+y;
        System.out.println("Sum of entered integers = " + z );
    }
}

class AddingLargeNumbers {
    public static void main(String[] args) {
        String num1, num2;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first number: ");
        num1 = scanner.nextLine();
        System.out.println("Enter second number: ");
        num2 = scanner.nextLine();

        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;

        sum = first.add(second);

        System.out.println("Result of addition is " + sum);
    }
}
