import Algorithms.Bubble;
import Algorithms.BubbleOpt;
import Algorithms.Selection;
import Algorithms.Sorting;

public class Main {

    static void testSorting(Sorting sortAlgorithm, int[] array){
        System.out.println("Testing " + sortAlgorithm.getName() + "\n" +
                "Unsorted array:");
        sortAlgorithm.printArray(array);
        long t = System.nanoTime();
        sortAlgorithm.sort(array);
        t = System.nanoTime() - t;
        System.out.println("\nSorted array:");
        sortAlgorithm.printArray(array);
        System.out.println("\nTook : "  + (t/Math.pow(10, 6)) + "ms");
        System.out.println("\n-----------------------------------------");
    }

    static int[] returnRandomArray(int lengthMin, int lengthMax, int elementRandomness){
        int n = (int) (lengthMin + (Math.random() * (lengthMax - lengthMin)));
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * elementRandomness);
        }

        return array;
    }

    static int[] copyArray(int[] array){
        int[] arrayCopy = new int[array.length];

        for(int i = 0; i < array.length; i++){
            arrayCopy[i] = array[i];
        }

        return arrayCopy;
    }

    public static void main(String[] args) {
        int[] array = returnRandomArray(10, 20, 50);

        testSorting(new Bubble(), copyArray(array));
        testSorting(new Selection(), copyArray(array));
        testSorting(new BubbleOpt(), copyArray(array));

    }
}
