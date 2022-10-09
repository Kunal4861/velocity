package Popup_Study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Child_window_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium java\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(1000);
        String MainpageID = driver.getWindowHandle();//provide ID of mainpage
        System.out.println(MainpageID);
       Set<String> allWindows = driver.getWindowHandles();//it provide id of all windowshandle
       System.out.println(allWindows);
       //set need to convert into arraylist
       ArrayList<String> ar=new ArrayList<>(allWindows);
       for(String o:ar)//use for each loop to get id of windowshandles
       {
    	   System.out.println(o);
       }
       String IDofmainPage = ar.get(0);
       String IDof_childWindow = ar.get(1);
     driver.switchTo().window(IDof_childWindow);//switching selenium focus from main window to child window
     Thread.sleep(1000);
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//a[text()='Contact me']")).click();
     Thread.sleep(10000);
     driver.switchTo().window(IDofmainPage);//switching selenium focus from child window to main window
     Thread.sleep(10000);
     driver.quit();
     
}
}
