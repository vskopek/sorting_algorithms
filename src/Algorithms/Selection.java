package Algorithms;

public class Selection implements Sorting{
    private String name = "Selection sort";

    @Override
    public void sort(int[] array) {
        for(int i = 0; i < array.length;i++){
            int h = i;

            for(int x = i; x < array.length; x++){
                if(array[x] < array[h]){
                    h = x;
                }
            }

            int t = array[h];
            array[h] = array[i];
            array[i] = t;
        }
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
