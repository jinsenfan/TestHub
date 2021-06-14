package com.testing.testNg;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;

/**
 * @title: ParamCase
 * @Author Jinsenfan
 * @Date: 2021/6/14 16:15
 * @Version 1.0
 */
public class ParamCase {
    @Test
    @Parameters({"param1", "param2"})
    public void testAdd1(String param1, String param2) {
        System.out.println(param1 + param2);
        System.setProperty("webdriver.chrome.driver",param1);
        Webdriver driver = new ChromeDriver();
    }
}

