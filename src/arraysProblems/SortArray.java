package arraysProblems;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4}; 

      
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                 
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

  
        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
