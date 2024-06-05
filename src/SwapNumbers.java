/* 6.How to swap 2 no using 3rd variable */

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        int x, y, temp;
        System.out.println("Enter x and y ");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y= scanner.nextInt();

        System.out.println("Before swapping\nx = " + x + "\ny = " + y);

        temp = x;
        x = y;
        y=temp;

        System.out.println("After swapping\nx = " + x + "\ny = " + y);
    }
}
