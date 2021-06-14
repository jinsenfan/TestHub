package sample;

/**
 * @title: TestCsv
 * @Author Jinsenfan
 * @Date: 2021/6/14 12:02
 * @Version 1.0
 * @说明; testng dataprovider结合csv做测试驱动
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestCsv {
    //读取CSV文件的静态方法，使用CSV文件的绝对文件路径作为函数参数
    public static Object[][] getSearchData(String FileName) throws IOException{
        List<Object[]> records=new ArrayList<Object[]>();
        String record;
        //设定UTF-8字符集，使用带缓冲区的字符输入流BufferedReader读取文件内容
        BufferedReader file=new BufferedReader(new InputStreamReader(new FileInputStream(FileName),"UTF-8"));
        //忽略读取CSV文件的标题行（第一行）
        file.readLine();
        //遍历读取文件中除第一行外的其他所有内容并存储在名为records的ArrayList中，每一行records中存储的对象为一个String数组
        while((record=file.readLine())!=null){
            String fields[]=record.split(",");
//            System.out.println(fields);
            records.add(fields);
        }
        //关闭文件对象
        file.close();
        //将存储测试数据的List转换为一个Object的二维数组
        Object[][] results=new Object[records.size()][];
        //设置二位数组每行的值，每行是一个Object对象
        for(int i=0;i<records.size();i++){
            results[i]=records.get(i);
        }
        return results;
    }
    @DataProvider(name="searchData")
    public static Object[][] data() throws IOException
    {
        String filename ="D:\\IdeaProjects\\TestHub\\data\\DataProviderTest01.csv";
        return getSearchData(filename);//获取CSV文件的测试数据
    }
    @Test(dataProvider="searchData")
    public void testData(String n1,String n2,String n3){

        // assertEquals(n1 + n2 , n3);
        assertEquals(Integer.parseInt(n1) + Integer.parseInt(n2) , Integer.parseInt(n3));
        System.out.println(n1+"+++++++++++++++++++++++++++++"+n2+"+++++++++++++++++"+n3);
    }
}