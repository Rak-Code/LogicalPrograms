package numbersProblems;

import java.util.Scanner;

public class PrintReverseNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}
