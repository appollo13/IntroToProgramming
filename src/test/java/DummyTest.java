import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DummyTest {

    @Test
    public void getPi_thenPiWithGoodPrecision() {
        // given
        Dummy dummy = new Dummy();

        // when & then
        Assert.assertEquals(Math.PI, dummy.getPi(), 0.00001);
    }
}
