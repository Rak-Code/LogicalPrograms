package arraysProblems;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4}; 

        int smallest = findSmallest(array);
        System.out.println("The smallest element in the array is: " + smallest);
    }

    public static int findSmallest(int[] array) {
     
        int smallest = array[0];

       
        for (int i = 1; i < array.length; i++) {
         
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}
