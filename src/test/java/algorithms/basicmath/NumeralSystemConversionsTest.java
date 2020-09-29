package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static algorithms.basicmath.NumeralSystemConversions.fromBaseN;
import static algorithms.basicmath.NumeralSystemConversions.toBaseN;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class NumeralSystemConversionsTest {

    @Test
    public void toBase2_ofFrom0To100() {
        int radix = 2;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals("" + i, s, toBaseN(radix, i));
        }
    }

    @Test
    public void toBase8_ofFrom0To100() {
        int radix = 8;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals("" + i, s, toBaseN(radix, i));
        }
    }

    @Test
    public void toBase16_ofFrom0To100() {
        int radix = 16;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals("" + i, s, toBaseN(radix, i));
        }
    }

    @Test
    public void toBase17_ofFrom0To100() {
        int radix = 17;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals("" + i, s, toBaseN(radix, i));
        }
    }

    @Test
    public void fromBase2_ofFrom0To100() {
        int radix = 2;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals(s, i, fromBaseN(radix, s));
        }
    }

    @Test
    public void fromBase8_ofFrom0To100() {
        int radix = 8;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals(s, i, fromBaseN(radix, s));
        }
    }

    @Test
    public void fromBase16_ofFrom0To100() {
        int radix = 16;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals(s, i, fromBaseN(radix, s));
        }
    }

    @Test
    public void fromBase23_ofFrom0To100() {
        int radix = 23;
        for (int i = 0; i <= radix * radix + 1; i++) {
            String s = Integer.toString(i, radix);
            assertEquals(s, i, fromBaseN(radix, s));
        }
    }
}
