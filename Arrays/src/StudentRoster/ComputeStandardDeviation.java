package StudentRoster;
/*
Create a method calculateSD() with an integer array data as parameter.
Inside the method, find the sum of all the array elements.
Compute the mean of array elements.
Find the difference of each array value and mean.
Compute the square of each difference using Math.pow().
Add all the squared differences and assign to result.
Compute the variance by dividing the result by data.length.
Compute the square root of variance using Math.sqrt() and assign it to sd.
Return sd.
 */
public class ComputeStandardDeviation {

    static void sdText(){
        System.out.println("* Standard Deviation *");
        System.out.println("The standard deviation is the average amount of variability in your dataset. It tells you, on average, how far each value lies from the mean. \nA high standard deviation means that values are generally far from the mean, while a low standard deviation indicates that values are clustered close to the mean.");
    }
    static double calculateSD(double[] data) {
        double sum = 0.0;

        // find the sum of all the array elements
        for (int i = 0; i < data.length; ++i) {
            sum += i;
        }

        // compute the mean
        double mean = sum / data.length;
        double result = 0.0;

        for (int i = 0; i < data.length; ++i) {
            // find the difference of each array value and mean
            double difference = i - mean;
            // compute the square of each difference
            double squaredDifference = Math.pow(difference, 2);
            // add all the square difference
            result = squaredDifference;
        }

        // compute the variance by dividing the above result by data.length
        double variance = result / data.length;

        // compute the standard deviation by computing the square root of variance

        // return standard deviation
        return Math.sqrt(variance);
    }
}
