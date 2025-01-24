package arraysProblems;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, 5, 3, 4, 3}; 

        
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }

  
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
    }
}
