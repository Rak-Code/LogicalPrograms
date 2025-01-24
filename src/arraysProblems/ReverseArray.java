package arraysProblems;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4}; 

       
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }


        System.out.print("Reversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

