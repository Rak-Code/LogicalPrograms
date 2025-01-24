package numbersProblems;

import java.util.Scanner;

public class ArmstrongCheck {

    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length(); // Number of digits

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number; // Return true if it's an Armstrong number, false otherwise
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int numToCheck = scanner.nextInt();

        if (isArmstrong(numToCheck)) {
            System.out.println(numToCheck + " is an Armstrong number.");
        } else {
            System.out.println(numToCheck + " is not an Armstrong number.");
        }
        scanner.close();
    }
}