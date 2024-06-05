import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        int marksObtained, passingMarks;
        passingMarks = 40;

        try {
        System.out.print("Enter your mark: ");
        Scanner input = new Scanner(System.in);
        marksObtained = input.nextInt();

            if (marksObtained >= passingMarks) {
                System.out.println("You passed the exam");
            } else {
                System.out.println("Unfortunately you failed to pass the exam.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter number!");
        }
    }
}
