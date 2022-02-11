package Algorithms;

public class Insertion implements Sorting{
    private String name = "Insertion sort";

    @Override
    public void sort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int x = i;
            int currentEl  = array[x];

            while (x > 0 && array[x-1] > currentEl) {
                array[x] = array[x - 1];
                x--;
            }

            array[x] = currentEl;
        }
    }

    @Override
    public void printArray(int[] array) {
        for(int i = 0; i <array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

    public String getName() {
        return name;
    }
}
