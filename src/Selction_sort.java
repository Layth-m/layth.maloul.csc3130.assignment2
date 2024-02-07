public  class Selction_sort implements SortingAlgorithm{
    public int[] sorty(int[] input){
        //loop over array
        for (int i = 0; i < input.length; i++) {
            //assume current elm is min
            int min = i;
            //loop over rest of array
            for (int j = i; j < input.length; j++) {
                //if less than min
                if (input[j] < input[min]) {
                    //update min
                    min = j;
                }
            }
            //swap current ele with min
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;

        }
        return input;
    }

}
