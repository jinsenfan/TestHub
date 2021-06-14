package sample;

/**
 * @title: FourTest
 * @Author Jinsenfan
 * @Date: 2021/6/14 11:03
 * @Version 1.0
 */

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;


public class FourTest {

    @Test
    public void testAdd1() {
        assertEquals(3 + 1, 5);
    }

    @Test(dependsOnMethods = {"testAdd1"})
    public void testAdd2() {
        assertEquals(3 + 2, 5);
    }
}



