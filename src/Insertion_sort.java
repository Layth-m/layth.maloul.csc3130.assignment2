public class Insertion_sort implements SortingAlgorithm {
    public int[] sorty(int[] input) {
        //store current ele in tmp var
        int tmp;
        //keeps track of insertion point
        int j;
        //loop from position 2
        for (int i = 1; i < input.length; i++) {
            //store current in tmp
            tmp = input[i];
            //loop backwards from current comparing each element with the previous
            for (j = i; j > 0 && tmp < input[j - 1]; j--) {
                input[j] = input[j - 1];
            }
            //insert the correct current in j
            input[j] = tmp;
        }
return input;
    }
}
