package Algorithms;

public class BubbleOpt implements Sorting{
    private String name = "Bubble sort - Optimalized";

    @Override
    public void sort(int[] array) {
        boolean swapped = false;
        do {
            swapped = false;
            for (int x = 0; x < array.length - 1; x++) {
                if (array[x] > array[x + 1]) {
                    int t = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = t;
                    swapped = true;
                }
            }
        }while(swapped);
    }

    @Override
    public void printArray(int[] array) {
        for(int i = 0; i <array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
