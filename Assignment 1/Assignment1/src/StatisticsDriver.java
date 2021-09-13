
//********************************************************************
// StatisticsDriver.java
//********************************************************************
import java.util.Random;

public class StatisticsDriver {
    private static final int MAX_COUNT = 50, MAX_VALUE = 100;

//-----------------------------------------------------------------
// Demonstrates the mean and standard deviation methods.
//-----------------------------------------------------------------
    public static void main(String args[]) {
//your code here.
        int[] numbers = new int[MAX_COUNT];
        Random random = new Random();
        for(int i = 0; i < MAX_COUNT; i++) {
            
            numbers[i] = random.nextInt(MAX_VALUE);
        }
        System.out.println("MEAN: " + Statistics.mean(numbers, MAX_COUNT));
        System.out.println("Standard Deviation: " + Statistics.standardDeviation(numbers, MAX_COUNT));
    }
}