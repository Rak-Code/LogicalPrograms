package arraysProblems;

public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4}; // Example array
        int sum = calculateSum(array);
        System.out.println("The sum of all elements in the array is: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0; // Initialize sum to 0

        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // Add each element to sum
        }
        return sum; // Return the total sum
    }
}
