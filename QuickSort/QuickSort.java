import java.util.Scanner;

public class QuickSort {
    
    static void recursionQuickSort(int[] array, int low, int high) {
        
        if (low < high) {
            int pivot = array[(low + high + 1) / 2];
            int leftItem = low;
            int rightItem = high;
            
            do {
                for (; array[leftItem] < pivot; leftItem++);
                for (; array[rightItem] > pivot; rightItem--);
                
                if (leftItem <= rightItem) {
                    int tmp = array[leftItem];
                    array[leftItem] = array[rightItem];
                    array[rightItem] = tmp;
                    leftItem++;
                    rightItem--;
                }
            }
            while (leftItem <= rightItem);
            
            if (low < rightItem) {
                recursionQuickSort(array, low, rightItem);
            }
            if (leftItem < high) {
                recursionQuickSort(array, leftItem, high);
            }
        }
    }
    
    static void quickSort(int[] array) {
        
        recursionQuickSort(array, 0, array.length - 1);
    }
    
    static int randomInt(int min, int max) {
        
        return (int) (Math.random() * (max - min + 1) + min);
    }
        
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length array: ");
        int length = in.nextInt();
        int[] array = new int[length];
        
        System.out.print("Unsorted array: ");
        for (int i = 0; i < array.length; ++i) {
            array[i] = randomInt(0, 100);
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        
        quickSort(array);
        System.out.print("Sorted array: ");
        for (int item : array) {
            System.out.printf("%d ", item);
        }
    }
}