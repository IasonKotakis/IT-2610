import java.util.Scanner;

/**
 * Write a program that reads an integer value and prints the sum of all even
 * integers between 2 and the input value, inclusive. Print an error message if
 * the input value is less than 2. Prompt accordingly.
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number: ");
        int N = sc.nextInt();
        if (N < 2) {
            System.out.println("ERROR: Number " + N + " is smaller than 2.");
        } else {
            int sumEven = 0;
            for(int i = 2; i <= N; i ++) {
                if (i % 2 == 0) {
                    sumEven += i;
                }
            }
            System.out.println("SUM: " + sumEven);
        }

    }

}
