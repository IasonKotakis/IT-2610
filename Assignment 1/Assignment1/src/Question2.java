import java.util.Scanner;

/**
 * Write a program that reads a string from the user and prints it one character
 * per line. *
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));
        }
    }
}
