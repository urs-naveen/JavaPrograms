import java.util.*;

public class GroupAnagrams {

    private static void anagramGrouping(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strings) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            } else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() >= 1) {
                System.out.print(values);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfWords = input.nextInt();
        String[] arr = new String[numOfWords];
        for (int i = 0; i < numOfWords; i++) {
            arr[i] = input.next();
        }

        anagramGrouping(arr);
    }
}
