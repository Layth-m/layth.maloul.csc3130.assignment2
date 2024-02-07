import java.util.Arrays;
import java.util.Random;

//7.
public class Tester {

    // The sorting algorithm to be tested
    private SortingAlgorithm sa;

    // A random number generator
    private Random random;

    //constructor takes the sorting algorithm as a parameter
    public Tester(SortingAlgorithm sa) {
        this.sa = sa;
        this.random = new Random();
    }

    // A method that creates an array of integers of the given size, fills it with random numbers,
    // runs the sorting algorithm's sort method, and returns the time it takes to sort the array
    public double singleTest(int size) {
        // Create an array of the given size
        int[] arr = new int[size];

        // Fill it with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }

        // Get the current time in milliseconds
        long startTime = System.currentTimeMillis();

        // Run the sorting algorithm's sort method
        sa.sorty(arr);

        // Get the current time in milliseconds
        long endTime = System.currentTimeMillis();

        //The difference in milliseconds
        return endTime - startTime;
    }

    //Method that runs singleTest method as many times as the number of iterations provided
    //prints to the console the average time the algorithm takes to sort array
    public void test(int iterations, int size) {
        // Initialize the sum of times to zero
        double sum = 0;

        // Run the singleTest method for the given number of iterations
        for (int i = 0; i < iterations; i++) {
            // Add time to  sum
            sum += singleTest(size);
        }
        //calc avg time to run
        double average = sum / iterations;

        //print result
        System.out.println("The average time for sorting an array of size " + size + " using " +sa.getClass().getSimpleName() + " is " + average + " milliseconds.");
    }
}
