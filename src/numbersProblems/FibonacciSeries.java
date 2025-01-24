package numbersProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int a = 0, b = 1;

        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            
        }
        
        scanner.close();
    }
}
