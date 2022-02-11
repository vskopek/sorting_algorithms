package Algorithms;

public interface Sorting {

    /**
     * Method should contain algorithm for sorting array of integers.
     * @param array Integer array that will be sorted
     */
    void sort(int[] array);

    /**
     * Prints the elements of an array.
     * @param array Integer to be printed
     */
    void printArray(int[] array);

    /**
     * Returns name of the sorting algorithm
     * @return algorithm name
     */
    String getName();
}
