public class Bubble implements Sorting{
    private String name = "Bubble sort";

    @Override
    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            for(int x = 0; x < array.length - 1; x++){
                if(array[x] > array[x+1]){
                    int t = array[x];
                    array[x] = array[x+1];
                    array[x+1] = t;
                }
            }
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
