import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraySum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String str = input.next();
        String[] arr = str.split(" ");

        long result = IntStream.range(0, n).mapToLong(i -> Integer.parseInt(arr[i])).sum();

        System.out.println("Sum of array elements: " + result);
    }
}
