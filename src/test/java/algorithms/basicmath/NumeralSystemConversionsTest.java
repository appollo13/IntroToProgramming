package algorithms.basicmath;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static algorithms.basicmath.NumeralSystemConversions.fromBaseN;
import static algorithms.basicmath.NumeralSystemConversions.toBaseN;
import static java.lang.Integer.*;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class NumeralSystemConversionsTest {

    @Test
    public void toBase2_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            assertEquals("" + i, toBinaryString(i), toBaseN(2, i));
        }
    }

    @Test
    public void toBase8_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            assertEquals("" + i, toOctalString(i), toBaseN(8, i));
        }
    }

    @Test
    public void toBase16_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            assertEquals("" + i, toHexString(i), toBaseN(16, i));
        }
    }

    @Test
    public void toBase17_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            assertEquals("" + i, Integer.toString(i, 17), toBaseN(17, i));
        }
    }

    @Test
    public void fromBase2_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            String s = toBinaryString(i);
            assertEquals("" + i, parseInt(s, 2), fromBaseN(2, s));
        }
    }

    @Test
    public void fromBase8_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            String s = toOctalString(i);
            assertEquals("" + i, parseInt(s, 8), fromBaseN(8, s));
        }
    }

    @Test
    public void fromBase16_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            String s = toOctalString(i);
            assertEquals("" + i, parseInt(s, 16), fromBaseN(16, s));
        }
    }

    @Test
    public void fromBase23_ofFrom0To100() {
        for (int i = 0; i <= 100; i++) {
            String s = toOctalString(i);
            assertEquals("" + i, parseInt(s, 23), fromBaseN(23, s));
        }
    }
}
