package sample;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
/**
 * @title: helloWorld
 * @Author Jinsenfan
 * @Date: 2021/6/14 15:36
 * @Version 1.0
 */

public class helloWorld {

    // 测试返回结果不为空
    public String hello(){
        return "hello world!";
    }
    @Test
    public void tester1(){
        helloWorld hello = new helloWorld();
        String helloworld = hello.hello();
        // 检查返回结果
        assertNotNull(helloworld);
    }

    // 测试返回结果为"hello world!"字符串
    @Test
    public void tester2(){
        helloWorld hello = new helloWorld();
        String helloworld = hello.hello();
        System.out.println(helloworld);
        // 检查返回结果是否=hello world!
        assertEquals(helloworld,"hello world!");
    }
}

