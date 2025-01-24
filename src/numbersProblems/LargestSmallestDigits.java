package numbersProblems;

import java.util.Scanner;

public class LargestSmallestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int largest = 0, smallest = 9;

        while (number != 0) {
            int digit = number % 10;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
            number /= 10;
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
        scanner.close();
    }
}