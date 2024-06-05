import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        String s1, s2;

        System.out.println("Enter the first string:");
        Scanner scanner = new Scanner(System.in);
        s1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        s2 = scanner.nextLine();

        if (s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second");
        else if (s1.compareTo(s2) < 0)
            System.out.println("First string is smaller than second");
        else
            System.out.println("Both strings are equal");
    }
}
