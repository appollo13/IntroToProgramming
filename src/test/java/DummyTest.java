import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class DummyTest {

    @Test
    public void getPi_thenPiWithGoodPrecision() {
        // given
        Dummy dummy = new Dummy();

        // when & then
        assertEquals(Math.PI, dummy.getPi(), 0.00001);
    }
}
