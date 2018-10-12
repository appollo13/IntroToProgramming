package emko.interviews;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class TopNWords {

    public static List<String> getTopNWords(int n, String s, boolean strict) {
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
        log.debug(wordsToCount.toString());

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
        log.debug(countToWords.toString());

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
        log.debug(topNWords.toString());

        return topNWords;
    }
}
