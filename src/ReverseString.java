import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        original = scanner.nextLine();
        int length = original.length();

        for (int i = length-1; i>=0; i--){
            reverse = reverse+original.charAt(i);
        }
        System.out.println("Reverse of entered string is: " + reverse);

        System.out.println("----------------------------------------");

        StringBuffer a = new StringBuffer("VASYL");
        System.out.println(a.reverse());
    }
}
