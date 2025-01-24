package arraysProblems;

public class RotateLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateLeft(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] array) {
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = first;
    }
}
