import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int n, sum = 0, temp, remainder, digits = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number to check if it is an Armstrong number");
        n = in.nextInt(); //n=407

        temp = n; //temp=407

        while (temp != 0) {
            digits++; //1
            temp = temp / 10; //40
        }

        temp = n; //407

        while (temp != 0) {
            remainder = temp % 10; //7
            sum = sum + power(remainder, digits); //0+
            temp = temp / 10;
        }

        if (n == sum)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }

        static int power (int n, int r){
            int c, p=1;

            for (c = 1; c <= r; c++)
                p = p*n;
            return p;
    }
}
