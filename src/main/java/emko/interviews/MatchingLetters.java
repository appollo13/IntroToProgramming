package emko.interviews;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MatchingLetters {

    public static int countMatchingLetters(String first, String second, boolean caseSensitive) {
        if (first == null || second == null) {
            return 0;
        }

        first = first.trim();
        second = second.trim();
        if (first.isEmpty() || second.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> letterToCount = new HashMap<>();
        for (char letter : first.toCharArray()) {
            if (!caseSensitive) {
                letter = Character.toLowerCase(letter);
            }

            Integer count = letterToCount.get(letter);
            if (count == null) {
                count = 0;
            }

            letterToCount.put(letter, ++count);
        }
        log.debug(letterToCount.toString());

        int result = 0;
        for (char letter : second.toCharArray()) {
            if (!caseSensitive) {
                letter = Character.toLowerCase(letter);
            }

            Integer count = letterToCount.get(letter);
            if (count == null) {
                continue;
            }

            result++;
            letterToCount.put(letter, --count);
        }

        return result;
    }
}
