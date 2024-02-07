public class Quick_sort implements SortingAlgorithm {
    // Method to partition the array on the basis of the pivot value


    public int[] sorty(int[] input){
        quickSort(input,0,input.length -1);
        return input;
    }

    static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = array[high];
        // Pointer for greater element
        int i = (low - 1);

        // Traverse through all elements
        // Compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                // If element smaller than pivot is found
                // Swap it with the greater element pointed by i
                i++;

                // Swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the position from where partition is done
        return (i + 1);
    }

    // Method to implement quick sort
    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find pivot element such that
            // Elements smaller than pivot are on the left
            // Elements greater than pivot are on the right
            int pivot = partition(array, low, high);

            // Recursive call on the left of pivot
            quickSort(array, low, pivot - 1);

            // Recursive call on the right of pivot
            quickSort(array, pivot + 1, high);
        }
    }


}

