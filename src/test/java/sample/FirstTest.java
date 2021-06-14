package sample;

/**
 * @title: FirstTest
 * @Author Jinsenfan
 * @Date: 2021/6/14 9:21
 * @Version 1.0
 */

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstTest {

    @Test
    public void testCase() {
        assertEquals(2 + 2, 4);
    }

}

