package sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
/**
 * @title: Test03
 * @Author Jinsenfan
 * @Date: 2021/6/14 10:28
 * @Version 1.0
 * @说明： 根据标签有选择地的跳过或执行这些用例 对应testDemoCase03.xml
 */

@Test(groups = {"功能测试"})
public class TagTest {

    @Test(groups = {"高", "正常"})
    public void testCase1() {
        assertEquals(2 + 2, 4);
    }

    @Test(groups = {"高", "正常"})
    public void testCase2() {
        assertEquals(5 - 3, 2);
    }

    @Test(groups = {"中", "正常"})
    public void testCase3() {
        assertEquals(2 / 1, 2);
    }

    @Test(groups = {"高", "异常"})
    public void testCase4() {
        assertEquals(2 / 0, 1);
    }

}