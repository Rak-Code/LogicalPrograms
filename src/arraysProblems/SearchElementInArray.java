package arraysProblems;

public class SearchElementInArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4}; // Example array
        int target = 7; // Element to search for
        int index = searchElement(array, target);
        
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    public static int searchElement(int[] array, int target) {
        // Iterate through the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the target
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
