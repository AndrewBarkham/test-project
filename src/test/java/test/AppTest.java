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
        Assert.assertEquals(1846, obj.multiply(142,13));

    }

    @Test
    public void testAdd() {

        App obj = new App();
        Assert.assertEquals(275, obj.add(203,72));

    }
}
