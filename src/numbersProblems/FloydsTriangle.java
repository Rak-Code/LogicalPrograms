package numbersProblems;

public class FloydsTriangle {
    public static void main(String[] args) {
    	
//    	1 
//    	2 3 
//    	4 5 6 
//    	7 8 9 10 

        int rows = 4, number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
