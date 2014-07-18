package test;


import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    @Test
    public void testConcatenate() {

        App obj = new App();
        Assert.assertEquals("onetwo", obj.concatenate("one","two"));

    }

    @Test
    public void testMultiply() {

        App obj = new App();
        Assert.assertEquals(15, obj.multiply(3,5));

    }
}
