import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {

        int x, y, z;

        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner (System.in);
        x = scanner.nextInt();
        y=scanner.nextInt();
        z=scanner.nextInt();

        if (x>y && x>z){
            System.out.println("First number is largest");
        } else if (y>x && y>z){
            System.out.println("Second number is largest");
        } else if (z>x && z>y){
            System.out.println("Third number is largest");
        } else {
            System.out.println("Entered numbers are distinct");
        }
    }
}
