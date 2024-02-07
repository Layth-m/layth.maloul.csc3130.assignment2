

//8.

public class Performance {

    public static void main(String[] args) {
        //array sizes to test
        int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

        //Sorting algorithms to test
        SortingAlgorithm[] algorithms = {(SortingAlgorithm) new Selction_sort(), new Quick_sort(),new Shell_sort(),new Insertion_sort(),new Bubble_sort()};


            //Loop through sorting algorithms
            for (SortingAlgorithm sa : algorithms) {
                // Create tester for  algorithm
                Tester tester = new Tester(sa);

                // Loop through the array sizes
                for (int size : sizes) {
                    //Run test for  algorithm and  size
                    tester.test(20, size);

                }

            }

        }
    }


