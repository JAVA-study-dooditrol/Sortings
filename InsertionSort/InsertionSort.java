import java.util.Scanner;

public class InsertionSort {
    
    static void insertionSort(int[] array) {
        
        for (int i = 1; i < array.length; ++i) {
            int currentItem = array[i];
            int leftBorder = 0;
            int rightBorder = i;
            
            while (leftBorder < rightBorder) {
                int mediumItem = (rightBorder + leftBorder) / 2;
                if (array[mediumItem] <= currentItem) {
                    leftBorder = mediumItem + 1;
                }
                else {
                    rightBorder = mediumItem;
                }
            }
            
            for (int j = i; j > rightBorder; --j) {
                array[j] = array[j - 1];
            }
            
            array[rightBorder] = currentItem;
        }
    }
    
    static int randomInt(int min, int max) {
        
        return (int)(Math.random() * ((max - min) + 1) + min);
    }
    
    public static void main(String[] args) {
        
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
        
        insertionSort(array);
        System.out.print("Sorted array: ");
        for (int item : array) {
            System.out.printf("%d ", item);
        }
    }
}