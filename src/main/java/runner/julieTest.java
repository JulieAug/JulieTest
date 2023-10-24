package runner;

import common.AutoTools;
import common.Report;
import org.junit.Test;

public class julieTest {

    @Test
    public void bigbioyTest() throws Exception {
        String startTime = AutoTools.getDateTime();
        String resultFileName="Cases/Result/结果-接口"+startTime;
        String fileName = "Cases/boxActivityCases.xlsx";
        ExcelUtil.excel(fileName, resultFileName);
        Report.sendreport(resultFileName,startTime);
    }

//    @Test
    public void test() throws Exception{
        int a = 1;
        a++;//让a=a+1,此时a=2Z4356erte45636
        System.out.println(a++);//先打印了a,再进行自增，所有此时打印输出a=2,进行自增后a=3
        ++a;//让a=a+1,此时a=4
        System.out.println(++a);//先进行自增，再打印，所以此时a=5
    }
}
