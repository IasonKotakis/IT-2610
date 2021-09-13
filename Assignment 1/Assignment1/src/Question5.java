import java.util.Scanner;

/**
 * Write a program that reads an arbitrary number of integers that are in the
 * range 0 to 50 inclusive and counts how many occurrences of each are entered.
 * Indicate the end of the input by a value outside of the range. After all
 * input has been processed., print all of the values (with the number of
 * occurrences) that were entered one or more time.
 * 
 * @author thanh
 *
 */
public class Question5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] database = new int[51];
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number (0 to 50): " );
            int num = sc.nextInt();
            if(num < 0 || num > 50)
                break;
            // Store to databse
            database[num]++;
        }
        // Print the database
        for(int i = 0; i < 51; i ++) {
            if(database[i] > 0) {
                System.out.println("" + i + ": " + database[i]);
            }
        }
    }

}
