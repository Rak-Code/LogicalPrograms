package arraysProblems;



public class SecondMinMax {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 9, 23, 44, 23};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int min = Integer.MAX_VALUE,
        SecondMin = Integer.MAX_VALUE;
        
        
        int max = Integer.MIN_VALUE, 
        SecondMax = Integer.MIN_VALUE;

        for (int i : arr) {
            // Find smallest and second smallest
            if (i < min) {
                SecondMin = min;
                min = i;
            } else if (i < SecondMin && i != min) {
                SecondMin = i;
            }
            
           

            // Find largest and second largest
            if (i > max) {
                SecondMax = max;
                max = i;
            } else if (i > SecondMax && i != max) {
                SecondMax = i;
            }
        }
        System.out.println("Second smallest: " + SecondMin);
        System.out.println("Second largest: " + SecondMax);

//        
    }
}


