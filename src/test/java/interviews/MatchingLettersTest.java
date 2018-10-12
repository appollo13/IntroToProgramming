package interviews;

import emko.interviews.MatchingLetters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MatchingLettersTest {

    @Test
    public void givenAmandaAndAdam_whenCountMatchingLettersCaseInsensitive_then4() {
        // given
        String first = "Amanda";
        String second = "Adam";

        // when & then
        assertEquals(4, MatchingLetters.countMatchingLetters(first, second, false));
    }

    @Test
    public void givenAmandaAndAdam_whenCountMatchingLettersCaseSensitive_then4() {
        // given
        String first = "Amanda";
        String second = "Adam";

        // when & then
        assertEquals(4, MatchingLetters.countMatchingLetters(first, second, true));
    }

    @Test
    public void givenRoxanaAndAlexander_whenCountMatchingLettersCaseInsensitive_then5() {
        // given
        String first = "Roxana";
        String second = "Alexander";

        // when & then
        assertEquals(5, MatchingLetters.countMatchingLetters(first, second, false));
    }

    @Test
    public void givenRoxanaAndAlexander_whenCountMatchingLettersCaseSensitive_then3() {
        // given
        String first = "Roxana";
        String second = "Alexander";

        // when & then
        assertEquals(3, MatchingLetters.countMatchingLetters(first, second, true));
    }
}
