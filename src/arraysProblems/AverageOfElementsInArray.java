package arraysProblems;

public class AverageOfElementsInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4}; // Example array
        double average = calculateAverage(array);
        System.out.println("The average of all elements in the array is: " + average);
    }

    public static double calculateAverage(int[] array) {
        int sum = 0; // Initialize sum to 0

        // Iterate through the array to calculate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // Add each element to sum
        }
        return (double) sum / array.length; // Return the average
    }
}
