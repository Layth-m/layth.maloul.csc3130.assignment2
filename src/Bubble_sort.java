public class Bubble_sort implements SortingAlgorithm{

    public  int[] sorty(int[] input) {
        int n = input.length;
        int tmp;
        for (int i = 0; i < n - 1; i++) { //first parse
            for (int j = 0; j < n - 1 - i; j++) {// second parse
                if (input[j + 1] < input[j]) {// compare first parse with every second parse
                    tmp = input[j]; //swap if index is larger than the right element
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
        return input;
    }
}