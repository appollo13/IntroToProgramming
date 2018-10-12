package interviews;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static emko.interviews.TopNWords.getTopNWords;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TopNWordsTest {

    @Test
    public void given3a2b2c1d_whenGetTopNWordsWith2AndStrict_thenAB() {
        // given
        String s = "a a a b b c c d";
        int n = 2;
        List<String> expected = Arrays.asList("a", "b");

        // when
        List<String> actual = getTopNWords(n, s, true);

        // then
        assertEquals(expected, actual);
    }

    @Test
    public void given3a2b2c1d_whenGetTopNWordsWith2AndNotStrict_thenABC() {
        // given
        String s = "a a a b b c c d";
        int n = 2;
        List<String> expected = Arrays.asList("a", "b", "c");

        // when
        List<String> actual = getTopNWords(n, s, false);

        // then
        assertEquals(expected, actual);
    }
}
