import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PairStarTest {
    @Test
    public void testPairStar() {
        Assert.assertEquals("hel*lo", new PairStar().pairStar("hello"));
        Assert.assertEquals("x*xy*y", new PairStar().pairStar("xxyy"));

    }

}