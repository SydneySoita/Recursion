import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrCountTest {
    @Test
    public void testStrCount() {
        Assert.assertEquals(2, new StrCount().strCount("catcowcat", "cat"));
        Assert.assertEquals(1, new StrCount().strCount("catcowcat", "cow"));
        Assert.assertEquals(0, new StrCount().strCount("catcowcat", "dog"));
    }

}