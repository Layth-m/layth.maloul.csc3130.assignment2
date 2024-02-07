public class Shell_sort implements SortingAlgorithm {

    public int[] sorty(int[] input) {

        int n = input.length;

        // start with a gap of half the length, and reduce it by half in each iteration
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // loop from the gap to the end of the array
            for (int i = gap; i < n; i += 1) {
                // store the current element in a temporary variable
                int temp = input[i];
                int j;
                // loop backwards from the current position, comparing elements with the gap distance
                for (j = i; j >= gap && input[j - gap] > temp; j -= gap) {
                    // if the element at the gap distance is larger, swap it with the current element
                    input[j] = input[j - gap];
                }
                // put the temporary variable in the final position
                input[j] = temp;
            }
        }
        return input;
    }
}

