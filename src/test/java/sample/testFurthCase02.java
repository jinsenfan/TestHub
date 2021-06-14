package sample;

/**
 * @title: testFurthCase02
 * @Author Jinsenfan
 * @Date: 2021/6/14 14:37
 * @Version 1.0
 */


import java.io.IOException;

import findyou.Interface.getCityWeather01;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import findyou.Interface.Common;
import findyou.Interface.getCityWeather;
public class testFurthCase02 {
    public String httpResult= null, weatherinfo= null, city=null,exp_city = null;
    public static String cityCode="";
    // 改变请求地址
    getCityWeather01 weather=new getCityWeather01();

    @Test(groups = { "BaseCase"})
    public void getShenZhen_Succ() throws IOException{
        exp_city="青岛";
        cityCode="101120201";
        resultCheck(cityCode, exp_city);
    }

    public void resultCheck(String cityCode_str, String exp_city_str) throws IOException{
        Reporter.log("【正常用例】:获取"+exp_city_str+"天气成功!");
        httpResult=weather.getHttpRespone(cityCode_str);
        Reporter.log("请求地址: "+weather.geturl());
        Reporter.log("返回结果: "+httpResult);
        weatherinfo=Common.getJsonValue(httpResult, "weatherinfo");
        city=Common.getJsonValue(weatherinfo, "city");
        Reporter.log("用例结果: resultCode=>expected: " + exp_city_str + " ,actual: "+ city);
        Assert.assertEquals(city,exp_city_str);
    }
}

