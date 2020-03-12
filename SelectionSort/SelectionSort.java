import java.util.Scanner;

public class SelectionSort {
    
    static void selectionSort(int[] array) {
        
        for (int leftBorder = 0; leftBorder < array.length - 1; ++leftBorder) {
            int minItem = leftBorder;
            for (int i = leftBorder + 1; i < array.length; ++i) {
                if (array[i] < array[minItem]) {
                    minItem = i;
                }
            }
            int tmp = array[leftBorder];
            array[leftBorder] = array[minItem];
            array[minItem] = tmp;
        }
    }
    
    static int randomInt(int min, int max) {
        
        return (int) (Math.random() * ((max - min) + 1) + min);
    }
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length:");
        int length = in.nextInt();
        int[] array = new int[length];
        
        System.out.print("Unsorted array: ");
        for (int i = 0; i < array.length; ++i) {
            System.out.printf("%d ", array[i] = randomInt(0, 50));
        }
        System.out.println();
        
        selectionSort(array);
        System.out.print("Sorted array: ");
        for (int item : array) {
            System.out.printf("%d ", item);
        }
    }
}