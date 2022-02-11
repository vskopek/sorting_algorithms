import Algorithms.*;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static HashMap<String, Sorting> sortingAlgorithms = new HashMap<String, Sorting>();


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
        System.out.println("-----------------------------------------");
    }

    static int[] returnRandomArray(int lengthMin, int lengthMax, int elementRandomness){
        int n = (int) (lengthMin + (Math.random() * (lengthMax - lengthMin)));
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = (int) (Math.random() * elementRandomness);
        }

        return array;
    }

    static void printArray(int[] array){
        for(int i = 0; i <array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

    static int[] copyArray(int[] array){
        int[] arrayCopy = new int[array.length];

        for(int i = 0; i < array.length; i++){
            arrayCopy[i] = array[i];
        }

        return arrayCopy;
    }

    public static void main(String[] args) {
        sortingAlgorithms.put("bubble sort", new Bubble());
        sortingAlgorithms.put("insertion sort", new Insertion());
        sortingAlgorithms.put("selection sort", new Selection());
        sortingAlgorithms.put("bubble sort opt", new BubbleOpt());

        Scanner sc = new Scanner(System.in);
        System.out.println("Select count of numbers x-y:");
        String[] count = sc.nextLine().split("-");
        System.out.println("Select randomness of numbers in array:");
        int x = sc.nextInt();

        int[] array = returnRandomArray(Integer.parseInt(count[0]), Integer.parseInt(count[1]), x);

        System.out.println("Select sorting algorithm" +
                "(insertion sort, " +
                "bubble sort, " +
                "selection sort, " +
                "bubble sort opt) or exit to exit program:");

        sc.nextLine();
        String algorithm = sc.nextLine();

        while(!algorithm.equals("exit")){
            if(sortingAlgorithms.containsKey(algorithm)){
                testSorting(sortingAlgorithms.get(algorithm), copyArray(array));
            }

            System.out.println("Select sorting algorithm" +
                    "(insertion sort, " +
                    "bubble sort, " +
                    "selection sort, " +
                    "bubble sort opt) or exit to exit program:");
            algorithm = sc.nextLine();
        }
    }
}
