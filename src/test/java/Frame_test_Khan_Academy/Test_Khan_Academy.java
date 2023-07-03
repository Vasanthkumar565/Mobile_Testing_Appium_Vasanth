package Frame_test_Khan_Academy;

import java.net.MalformedURLException;
import java.security.PublicKey;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Frame_Khan_Academy.Capability_khan;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Test_Khan_Academy extends Capability_khan {

	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void setup() throws Exception {

		System.out.println("This is oops");

		Thread.sleep(7000);

		service = startServer();

		Thread.sleep(5000);
		driver = academy(deviceName, platformName, appPackage, appActivity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 0)
	public void perform_on_Cryptography() throws InterruptedException
	{
		
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Computing']")).click();

		driver.findElement(MobileBy.xpath("//*[@text='Computer science']")).click();

		// moving in reverse direction it work!! I.e from informtion theory to
		// Cryptography

		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Information theory']")).click();
		Thread.sleep(3000);

		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		Thread.sleep(3000);
		driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		// working on crytography

		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Cryptography']")).click();
		Thread.sleep(5000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		Thread.sleep(2000);
		// driver.findElementByAndroidUIAutomator("text(\"GOT IT\")").click();
		Thread.sleep(5000);

		driver.findElement(MobileBy.AccessibilityId("Bookmarks")).click();

//		MobileElement element = (MobileElement) driver.findElementById("371d69ea-9ef0-46a9-9d92-0edd806b9eae");
//		element.click();
		// driver.findElement(MobileBy.className("android.widget.ImageView")).click();

		/*
		 * AndroidElement
		 * wb=driver.findElement(By.xpath("//*[@text='Pseudorandom number generators']")
		 * ); JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",wb);
		 * 
		 * js.executeScript("window.scrollBy(0,400)"); driver.
		 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"WebView\"))"
		 * );
		 */

	}

	@Test(priority = 1)
	public void bookmarks_verification() throws InterruptedException
	{

		// verification on add courses in bookmarks
		Thread.sleep(5000);
		String course_1 = driver.findElements(MobileBy.className("android.widget.TextView")).get(4).getText();
		Thread.sleep(3000);
		System.out.println(course_1);

		AndroidElement element = driver.findElement(MobileBy.xpath("(//*[@class='android.widget.TextView'])[5]"));
		String actualText = element.getText();
		String expectedText = "Ancient cryptography";

		Assert.assertEquals(actualText, expectedText, "course-1 name text verification failed.");

		Thread.sleep(5000);
		String course_2 = driver.findElements(MobileBy.className("android.widget.TextView")).get(7).getText();
		Thread.sleep(3000);
		System.out.println(course_2);

		AndroidElement element2 = driver.findElement(MobileBy.xpath("(//*[@class='android.widget.TextView'])[8]"));
		String actualText2 = element2.getText();
		String expectedText2 = "Ancient information theory";

		Assert.assertEquals(actualText2, expectedText2, "course-2 name text verification failed.");

		// printing the details of the bookmarks page

		Thread.sleep(5000);
		AndroidElement Ad = driver.findElement(MobileBy.className("android.widget.TextView"));
		String details = Ad.getText();
		System.out.println("Details: " + details);
		List<AndroidElement> alldetails = driver.findElements(MobileBy.className("android.widget.TextView"));

		int count = alldetails.size();
		System.out.println(count);
		for (WebElement detailscount : alldetails) 
		{
			System.out.println(detailscount.getText());

		}
	}

	@Test(priority = 2)
	public void removing_bookmarks() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Edit']")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();

		driver.findElement(MobileBy.xpath("//*[@text='Delete']")).click();

		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Edit']")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();

		driver.findElement(MobileBy.xpath("//*[@text='Delete']")).click();

		// check the message after removing the bookmarks
		AndroidElement bookmarkmessage = driver.findElement(MobileBy.xpath("//*[@text='You have no bookmarks.']"));
		boolean isbookmarkmessage = bookmarkmessage.isDisplayed();

		// say true are false
		System.out.println(" You have no bookmarks._is displayed " + isbookmarkmessage);

	}

	@Test(enabled = false)//(priority = 3)
	public void perform_on_life_skills() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Life skills']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Financial Literacy']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
		Thread.sleep(3000);

		String before_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
		System.out.println("before_seen_textname:" + before_seen);

	}

	@Test(enabled = false)//(priority = 4)
	public void Playing_video() throws InterruptedException 
	{
		
		
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
		Thread.sleep(15000);
		driver.findElement(MobileBy.xpath("//*[@text='Home']")).click();

		// verifing the recent seen lesson name!!

		Thread.sleep(3000);
		String After_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
		System.out.println("After_seen_textname:" + After_seen);

		AndroidElement lesson_name = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']"));
		boolean recent_lesson_name = lesson_name.isDisplayed();

		// say true are false
		System.out.println("Recent lesson name is  " + recent_lesson_name);
		
	}
	
	
	@Test(enabled = false)//(priority = 5)
	public void Back_to_Homescreen() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		

		service.stop();

//	    String before_seen = driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).getText();
//	    System.out.println("before_seen_textname:" + before_seen);
//	    if(After_seen==before_seen)
//	    {
//	    	System.out.println("Recent Lesson seen and before are same\n");
//	    }else
//	    {
//	    	System.out.println("Recent Lesson seen and before are not same\n");
//	    }

	}

	
	
	@Test(enabled = false)
	public void information_module() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Information theory']")).click();
		Thread.sleep(3000);

		/*
		 * driver.
		 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"WebView\"))"
		 * ); AndroidElement
		 * wb=driver.findElement(By.xpath("//*[@text='Modern information theory']"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);",wb);
		 */

		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();

		Thread.sleep(4000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(2).click();
		Thread.sleep(4000);
		System.out.println("reached are not");
	}

}
