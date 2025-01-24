package numbersProblems;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter range (start and end): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int evenSum = 0, oddSum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            
        } 
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        scanner.close();
        
    
    
    }
    
}
