package numbersProblems;

public class ReverseString {
    public static void main(String[] args) {
    	
    	
        String str = "madam";
        char[] charArray = str.toCharArray(); 
       
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }

        String reversed = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
        
        if(str.equals(reversed)) {
        	System.out.println("palindrome");
        }
        else {
        	System.out.println("not-palindrome");
        }
    }
}

