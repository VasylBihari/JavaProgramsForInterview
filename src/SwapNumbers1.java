/*7.How to swap 2 no without using 3rd*/

import java.util.Scanner;

public class SwapNumbers1 {

    public static void main(String[] args) {

        int x, y;

        System.out.println("Enter x and y");
        Scanner scanner = new Scanner (System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Before swapping \nx = " + x + "\ny = " + y);

        x = x + y;
        y = x - y;
        x = x-y;

        System.out.println("After swapping \nx = " + x + "\ny = " + y);
    }
}
