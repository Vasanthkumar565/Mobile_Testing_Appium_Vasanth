package Frame_test_Khan_Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Frame_Khan_Academy.Capability_khan;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Test_life_skills extends Capability_khan {
	
	AndroidDriver<AndroidElement>driver;
	
	
		@Test(priority = 3)
		public void life_skills() throws InterruptedException, IOException
		{
			
			System.out.println("hello");
			Thread.sleep(5000);
			driver = academy(deviceName, platformName, appPackage, appActivity);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(10000);
			
			driver.findElement(MobileBy.AccessibilityId("Search")).click();
			Thread.sleep(3000);
//			driver.findElement(MobileBy.AccessibilityId("Search")).click();
//			Thread.sleep(3000);
			driver.findElement(MobileBy.xpath("//*[@text='Life skills']")).click();
			Thread.sleep(3000);
			driver.findElement(MobileBy.xpath("//*[@text='Financial Literacy']")).click();
//			Thread.sleep(3000);
//			driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
//			Thread.sleep(3000);
//			
//			 String before_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
//			 System.out.println("before_seen_textname:" + before_seen);
//		    
//			driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
//			Thread.sleep(3000);
//		    driver.findElement(MobileBy.xpath("//*[@text='Home']")).click();
//		    
//		    // verifing the recent seen lesson name!!
//		    
//		    Thread.sleep(3000);
//		    String After_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
//		    System.out.println("After_seen_textname:" + After_seen);
//		    
//		    AndroidElement lesson_name = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']"));
//            boolean recent_lesson_name = lesson_name.isDisplayed();
//
//			// say true are false
//			System.out.println("Recent lesson name is  " + recent_lesson_name);
		    
			service.stop();
			
			
			
			
//		    String before_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
//		    System.out.println("before_seen_textname:" + before_seen);
//		    if(After_seen==before_seen)
//		    {
//		    	System.out.println("Recent Lesson seen and before are same\n");
//		    }else
//		    {
//		    	System.out.println("Recent Lesson seen and before are not same\n");
//		    }
		}
		
	

	}

