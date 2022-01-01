import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] arr1 = { "a", "b", "a", "c", "b" };
        String[] arr2 = { "c", "b", "a" };
        String[] arr3 = { "c", "c", "c", "c" };

        System.out.println("wordCount(" + Arrays.toString(arr1) + ") --> " + wordCount(arr1));
        System.out.println("wordCount(" + Arrays.toString(arr2) + ") --> " + wordCount(arr2));
        System.out.println("wordCount(" + Arrays.toString(arr3) + ") --> " + wordCount(arr3));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> words = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {

            if (!words.containsKey(strings[i])) {
                int count = 0;

                for (int j = i; j < strings.length; j++) {
                    if (strings[j] == strings[i]) {
                        count++;
                    }
                }

                words.put(strings[i], count);
            }

        }

        return words;
    }
}
