import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountXTest {
    @Test
    public void testCountX() {
        Assert.assertEquals(4, new CountX().countX("xxyxx"));
        Assert.assertEquals(2, new CountX().countX("xxy"));
        Assert.assertEquals(5, new CountX().countX("xxyxxx"));

    }

}