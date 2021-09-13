
/**
 * Print the following patterns. Create a separate program to produce each
 * pattern.
 *
 *
 */
public class Question3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num_stratix = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < num_stratix; j++) {
                System.out.print("*");
            }
            num_stratix--;
            System.out.println();
        }
        
        num_stratix = 1;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10 - num_stratix; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < num_stratix; j++) {
                System.out.print("*");
            }
            num_stratix++;
            System.out.println();
        }
    }

}
