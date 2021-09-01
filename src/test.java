package src;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.gargoylesoftware.htmlunit.CookieManager;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSelect;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author hj
 * @version 创建时间：2016-7-5 下午9:30:49
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.facebook.com/campaign/landing.php?&campaign_id=12318083647&extra_1=s%7Cc%7C515909641193%7Ce%7Cfacebook%7C&placement=&creative=515909641193&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D12318083647%26adgroupid%3D119397341964%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D9040321%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwxdSHBhCdARIsAG6zhlUvrEUWCrCWKSDH3_k-4Fswrbzhk5aX6PabRMIKL8dL-NykRbqtcWcaAm1nEALw_wcB");
        ArrayList<String> h1 = new ArrayList<String>(wd.getWindowHandles());

        System.out.println("First handle = " + wd.getTitle());

        //Thread.sleep(6000);
        WebElement clickhere = wd.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a"));
        clickhere.click();//moved to a new child page<
        // wd.get("https://zh-tw.facebook.com/");

        
        System.out.println("current handle "+wd.getWindowHandle());
        Set<String>handles=wd.getWindowHandles();
        for(String handle:handles){
            System.out.println(handle);
        }
    }
}
