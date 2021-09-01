package src;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class  test2{

    public  static void main(String[] args) throws InterruptedException, IOException {

        boolean timesUP=false;

        while(timesUP!=true)
        {
        
        Calendar now = Calendar.getInstance();
 
        // System.out.println("年：" + now.get(Calendar.YEAR));
 
        // System.out.println("月：" + (now.get(Calendar.MONTH) + 1));
 
        // System.out.println("日：" + now.get(Calendar.DAY_OF_MONTH));
 
        // System.out.println("时：" + now.get(Calendar.HOUR_OF_DAY));
 
        // System.out.println("分：" + now.get(Calendar.MINUTE));
 
        // System.out.println("秒：" + now.get(Calendar.SECOND));
 
 
        Date d = new Date();
 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("time：" + sdf.format(d));

        if(now.get(Calendar.HOUR_OF_DAY)==6 &&  now.get(Calendar.MINUTE)==1 && now.get(Calendar.SECOND)==30){
            timesUP=true;
        }
        
        Thread.sleep(1000);
        }


    }
    
}
