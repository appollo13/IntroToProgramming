import java.util.*;

public class TopNWords {

    public static void main(String[] args) {
        String s = "a a b c a b d e n i k o l a e m k o";
        List<String> topNWords_1 = getTopNWords_1(3, s, true);
        List<String> topNWords_2 = getTopNWords_2(3, s, true);
        System.out.println(topNWords_1.equals(topNWords_2));
    }

    public static List<String> getTopNWords_1(int n, String s, boolean strict) {
        if (s == null || s.trim().isEmpty() || n < 1) {
            return Collections.emptyList();
        }

        String[] allWords = s.trim().split("\\s+");

        // for each word in the text
        Map<String, Integer> wordsToCount = new HashMap<>();
        Arrays.stream(allWords)
                .filter(w -> !w.trim().isEmpty())
                .forEach(w -> {
                    Integer count = wordsToCount.get(w);
                    count = (count == null) ? 1 : count + 1;
                    wordsToCount.put(w, count);
                });
        System.out.println(wordsToCount);

        // for each unique word
        TreeMap<Integer, SortedSet<String>> countToWords = new TreeMap<>();
        wordsToCount.forEach((word, count) -> {
            SortedSet<String> words = countToWords.get(count);
            if (words == null) {
                words = new TreeSet<>();
            }
            words.add(word);
            countToWords.put(count, words);
        });
        System.out.println(countToWords);

        // constant n
        List<String> topNWords = new LinkedList<>();
        while (topNWords.size() < n) {
            SortedSet<String> words = countToWords.pollLastEntry().getValue();
            if (strict) {
                words.forEach(word -> {
                    if (topNWords.size() < n) {
                        topNWords.add(word);
                    }
                });
            } else {
                topNWords.addAll(words);
            }
        }
        System.out.println(topNWords);
        return topNWords;
    }

    public static List<String> getTopNWords_2(int n, String s, boolean strict) {
        if (s == null || s.trim().isEmpty() || n < 1) {
            return Collections.emptyList();
        }

        String[] allWords = s.trim().split("\\s+");

        // for each word in the text
        Map<String, Integer> wordsToCount = new HashMap<>();
        Arrays.stream(allWords)
                .filter(w -> !w.trim().isEmpty())
                .forEach(w -> {
                    Integer count = wordsToCount.get(w);
                    count = (count == null) ? 1 : count + 1;
                    wordsToCount.put(w, count);
                });
        System.out.println(wordsToCount);

        // for each unique word
        TreeMap<Integer, SortedSet<String>> countToWords = new TreeMap<>();
        wordsToCount.forEach((word, count) -> {
            SortedSet<String> words = countToWords.get(count);
            if (words == null) {
                words = new TreeSet<>();
            }
            words.add(word);
            countToWords.put(count, words);
        });
        System.out.println(countToWords);

        // constant n
        List<String> topNWords = new LinkedList<>();
        while (topNWords.size() < n) {
            SortedSet<String> words = countToWords.pollLastEntry().getValue();
            if (strict) {
                words.forEach(word -> {
                    if (topNWords.size() < n) {
                        topNWords.add(word);
                    }
                });
            } else {
                topNWords.addAll(words);
            }
        }
        System.out.println(topNWords);
        return topNWords;
    }
}
