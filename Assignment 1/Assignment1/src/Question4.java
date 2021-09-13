import java.util.Scanner;

/**
 * Write a program that reads a string from the user, then determines and prints
 * how many of each lowercase vowels (a, e. i, o, and u) appear in the entire
 * string. Have a separate counter for each vowel. Also count and print the
 * number of nonvowel characters
 * 
 *
 */
public class Question4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
            case 'a':
                aCount++;
                break;
            case 'e':
                eCount++;
                break;
            case 'i':
                iCount++;
                break;
            case 'o':
                oCount++;
                break;
            case 'u':
                uCount++;
                break;
            default:
                break;
            }
        }
        System.out.println("Total we have " + (aCount + eCount + iCount + oCount + uCount) + " lowercase vowels character");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
    }

}
