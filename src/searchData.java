package src;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.text.SimpleDateFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchData {

    public static void main(String[] args) throws InterruptedException {


        long time1, time2;
        boolean timesUP=false;
        String currentHandle=null;

        //System.out.println("Start");
        // 自己選擇要用的瀏覽器 WebDriver
        // 用Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        while(timesUP!=true)
        {
            Calendar now = Calendar.getInstance();
            Date d = new Date();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //System.out.println("time：" + sdf.format(d));

            if(now.get(Calendar.HOUR_OF_DAY)==7 &&  now.get(Calendar.MINUTE)==59 && now.get(Calendar.SECOND)==30)
            {

            /**
                 * 選擇醫師頁面
                 */

            //南港心理
            //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=R&DeptCode=1305&deptname=%e7%a4%be%e5%8d%80%e5%bf%83%e7%90%86%e5%81%a5%e5%ba%b7%e8%ab%ae%e8%a9%a2%e9%96%80%e8%a8%ba");
             //內湖門診(社區心理)
            //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=N&DeptCode=1305&deptname=%e7%a4%be%e5%8d%80%e5%bf%83%e7%90%86%e5%81%a5%e5%ba%b7%e8%ab%ae%e8%a9%a2%e9%96%80%e8%a8%ba");
            //南港疫苗
            //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=R&DeptCode=0400&deptname=COVID-19%e7%96%ab%e8%8b%97%e7%89%b9%e5%88%a5%e9%96%80%e8%a8%ba");
            //萬華疫苗
            //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=U&DeptCode=0200&deptname=COVID-19%e7%96%ab%e8%8b%97%e7%89%b9%e5%88%a5%e9%96%80%e8%a8%ba");
            //大同疫苗
            driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=V&DeptCode=0400&deptname=COVID-19%e7%96%ab%e8%8b%97%e7%89%b9%e5%88%a5%e9%96%80%e8%a8%ba");

            currentHandle = driver.getWindowHandle();

            try {
                //自動點選alert
                driver.switchTo().alert().accept();   
                } catch (Exception e) {
                    //TODO: handle exception
                }

            }
            

            if(now.get(Calendar.HOUR_OF_DAY)==8 &&  now.get(Calendar.MINUTE)==0 && now.get(Calendar.SECOND)==0)
            {

                time1 = System.currentTimeMillis();

                // 用Firefox
                // System.setProperty("webdriver.gecko.driver","D:\\javaLib\\selenium-java-3.10.0\\Firefox\\geckodriver.exe");
                // WebDriver driver = new FirefoxDriver();

                /**
                 * 選擇醫師頁面
                 */

                //內湖門診(社區心理)
                // driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=N&DeptCode=1305&deptname=%e7%a4%be%e5%8d%80%e5%bf%83%e7%90%86%e5%81%a5%e5%ba%b7%e8%ab%ae%e8%a9%a2%e9%96%80%e8%a8%ba");
                //南港門診(社區心理)
                //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=R&DeptCode=1305&deptname=%e7%a4%be%e5%8d%80%e5%bf%83%e7%90%86%e5%81%a5%e5%ba%b7%e8%ab%ae%e8%a9%a2%e9%96%80%e8%a8%ba");
                //大安門診(家庭醫學)
                //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=4&DeptCode=0100&deptname=%e5%ae%b6%e5%ba%ad%e9%86%ab%e5%ad%b8%e7%a7%91");
                //陽明院區(牙科)
                //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=M&DeptCode=4000&deptname=%e7%89%99%e7%a7%91");
                //driver.get("https://www.amazon.in/"); // 開啟瀏覽器到 amazon 首頁

                //南港門診疫苗殘劑
                //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=R&DeptCode=0400&deptname=COVID-19%e7%96%ab%e8%8b%97%e7%89%b9%e5%88%a5%e9%96%80%e8%a8%ba");
                //內湖門診疫苗殘劑
                //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=N&DeptCode=0400&deptname=COVID-19%e7%96%ab%e8%8b%97%e7%89%b9%e5%88%a5%e9%96%80%e8%a8%ba");
                //松山門診疫苗殘劑
                //driver.get("https://webreg.tpech.gov.tw/RegOnline1_2.aspx?ZCode=A&DeptCode=0400&deptname=COVID-19%e7%96%ab%e8%8b%97%e7%89%b9%e5%88%a5%e9%96%80%e8%a8%ba");


                // // 執行Javascript範例
                // // 將Google搜尋框打上字，"keyword"
                // JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                // javascriptExecutor.executeScript("arguments[0].value='keyword';", searchInput);

                // try {
                // //自動點選alert
                // driver.switchTo().alert().accept();   
                // } catch (Exception e) {
                //     //TODO: handle exception
                // }

                //找尚未額滿的醫師超連結
                List<WebElement> search_doctor = driver.findElements(By.tagName("a"));
                WebElement doctor=null;
                for(int i=0;i<search_doctor.size();i++){
                    String data=search_doctor.get(i).getText();
                    if(data.compareTo("葉國基")==0){
                        doctor=search_doctor.get(i);
                    }
                    // if(data.compareTo("內湖門診部")!=0 
                    //     && data.compareTo("南港門診部")!=0 
                    //     && data.compareTo("松山門診部")!=0 
                    //     && data.compareTo("萬華門診部")!=0 
                    //     && data.compareTo("大同門診部")!=0
                    //     && data.compareTo("(簡介)")!=0 
                    //     && data.compareTo("(看診進度及未看診人數)")!=0 
                    //     && data.compareTo("▲Top")!=0){
                        
                    //     doctor=search_doctor.get(i);
                    //     //System.out.println(data);
                    // }
                }

                //跳轉到掛號頁面
                if(doctor!=null){
                    doctor.click();
                    //System.out.println("跳頁成功");
                }
                else{
                    System.out.println("跳頁失敗");
                }


                /**
                 * 掛號頁面
                 */

                // driver.get("https://webreg.tpech.gov.tw/RegOnline1_3.aspx?ChaId=A105&tab=1&index=0");

                // Set<String> windowHandles = driver.getWindowHandles();
                
                // for (String windowHandle : windowHandles) {
                //     if (!currentHandle.equals(windowHandle) ) {
                //         //進入下一個窗口
                //         driver.switchTo().window(windowHandle);
                //          // 使用implicitlyWait，抓取DOM時，會等DOM出現才抓，最多等?秒
                //         driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
                //     }
                // }

                // 使用implicitlyWait，抓取DOM時，會等DOM出現才抓，最多等?秒
                driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

                WebElement text_name= driver.findElement(By.id("no"));
                text_name.sendKeys("G122219322");

                // WebElement birthday_y=driver.findElement(By.id("yeartype"));
                // birthday_y.sendKeys("民國");

                WebElement birthday_year=driver.findElement(By.id("y1"));
                birthday_year.sendKeys("84");

                WebElement birthday_month=driver.findElement(By.id("m1"));
                birthday_month.sendKeys("08");

                WebElement birthday_day=driver.findElement(By.id("d1"));
                birthday_day.sendKeys("31");

                WebElement text_phone=driver.findElement(By.id("txtCellPhone"));
                text_phone.sendKeys("0976595831");

                WebElement submit_btn=driver.findElement(By.id("Button1"));
                submit_btn.click();

                time2 = System.currentTimeMillis();
                System.out.println("預約時間：" + (time2-time1)/1000 + "秒");

                timesUP=true;

                driver.quit(); // 關閉瀏覽器
        
           }

         Thread.sleep(1000);

        }

    }

}