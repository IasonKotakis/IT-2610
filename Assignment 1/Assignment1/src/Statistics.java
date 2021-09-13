
//********************************************************************
// Statistics.java
//********************************************************************
public class Statistics {
    public static double mean(int[] numbers, int count) {
//your code here.
        int sum = 0;
        for(int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return (double)sum/count;
    }

    public static double standardDeviation(int[] numbers, int count) {
//your code here.
        double sum = 0;
        double m = mean(numbers, count);
        for(int i = 0; i < count; i++) {
            sum += ((double)numbers[i] - m) * ((double)numbers[i] - m);
        }
        return Math.sqrt(sum / count);
    }
}
