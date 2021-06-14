package sample;

/**
 * @title: q
 * @Author Jinsenfan
 * @Date: 2021/6/14 11:44
 * @Version 1.0
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class DataProviderTest01 {

    // 定义对象数组
   @DataProvider(name = "add")
    public Object[][] Users() {
        return new Object[][]{
                {3, 2, 5},
                {2, 2, 4},
                {3, 3, 6},
        };
    }

    @Test(dataProvider = "data")
    public void testAdd2(int add1, int add2, int result) {
        assertEquals(add1 + add2, result);
    }

}
