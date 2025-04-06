import java.util.*;

public class FavoriteSinger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int favoriteSingerCounter = 0;
        Set<Integer> singers = new LinkedHashSet<>();

        System.out.print("Enter the number of singers: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter singer of ith song - " + (i + 1) + ": ");
            int singer = input.nextInt();

            if (singers.contains(singer)) {
                favoriteSingerCounter++;
            } else {
                singers.add(singer);
            }
        }

        System.out.println("Number of favorite singers: " + favoriteSingerCounter);
    }
}
