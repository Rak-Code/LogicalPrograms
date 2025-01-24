package numbersProblems;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}