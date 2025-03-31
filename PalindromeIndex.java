import java.util.Scanner;

public class PalindromeIndex {

    private static int palindromeIndex(String str) {
        if (isPalindrome(str)) {
            return -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                StringBuilder sb = new StringBuilder(str);
                if (isPalindrome(sb.deleteCharAt(i).toString())) {
                    return i;
                }

                sb.setLength(0);
            }
        }

        return -1;
    }

    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);

        return str.contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of inputs: ");
        int noOfInputs = input.nextInt();

        while (noOfInputs > 0) {
            System.out.print("Enter a string: ");
            String str = input.next();
            System.out.println(palindromeIndex(str));

            noOfInputs--;
        }
    }
}
