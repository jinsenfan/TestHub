package sample;

/**
 * @title: Test01
 * @Author Jinsenfan
 * @Date: 2021/6/14 11:35
 * @Version 1.0
 * xml地址： D:\IdeaProjects\TestHub\src\main\resources\testNg\api\search\testDemoCase05.xml
 */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class DataProviderTest {

    @Test
    @Parameters({"add1", "add2", "result"})
    public void testAdd1(int add1, int add2, int result) {
        assertEquals(add1 + add2, result);
    }
}




