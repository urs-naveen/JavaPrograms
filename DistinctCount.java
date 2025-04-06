import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctCount {

    private static String distinctCount(int[] arr, int distinctIntegers) {
        Set<Integer> integers = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        if (integers.size() == distinctIntegers) {
            return "Good";
        } else if (integers.size() < distinctIntegers) {
            return "Bad";
        } else {
            return "Average";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of testcases: ");
        int testcases = input.nextInt();

        while (testcases > 0) {
            System.out.print("Enter no of integers: ");
            int noOfIntegers = input.nextInt();
            int[] arr = new int[noOfIntegers];
            for (int i = 0; i < noOfIntegers; i++) {
                System.out.print("Enter integer-" + (i + 1) + ": ");
                arr[i] = input.nextInt();
            }

            System.out.print("Enter the number of distinct integers: ");
            int distinctIntegers = input.nextInt();

            System.out.println(distinctCount(arr, distinctIntegers));

            testcases--;
        }
    }
}
