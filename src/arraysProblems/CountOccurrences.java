package arraysProblems;

import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 5, 3, 4, 3}; // Example array

        // Create a HashMap to store the occurrences of each element
        HashMap<Integer, Integer> occurrencesMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : array) {
            if (occurrencesMap.containsKey(num)) {
                // If the element is already in the map, increment its count
                occurrencesMap.put(num, occurrencesMap.get(num) + 1);
            } else {
                // Otherwise, add it to the map with a count of 1
                occurrencesMap.put(num, 1);
            }
        }

        // Print the occurrences of each element
        System.out.println("Occurrences of each element:");
        for (int key : occurrencesMap.keySet()) {
            System.out.println(key + ": " + occurrencesMap.get(key));
        }
    }
}
