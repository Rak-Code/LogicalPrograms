package arraysProblems;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4};

        int largest = findLargest(array);
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargest(int[] array) {
        
        int largest = array[0];

        
        for (int i = 1; i < array.length; i++) {
           
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }
}