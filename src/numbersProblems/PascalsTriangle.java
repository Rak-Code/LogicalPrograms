package numbersProblems;

import java.util.Scanner;

public class PascalsTriangle {

//    1 
//  1 1 
//1 2 1 
//1 3 3 1 
//1 4 6 4 1
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
        scanner.close();
    }
}
