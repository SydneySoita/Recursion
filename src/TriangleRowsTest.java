import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleRowsTest {
    @Test
    public void testTriangle() {
        Assert.assertEquals(0, new TriangleRows().triangle(0));
        Assert.assertEquals(1, new TriangleRows().triangle(1));
        Assert.assertEquals(3, new TriangleRows().triangle(2));
        Assert.assertEquals(6, new TriangleRows().triangle(3));

    }

}