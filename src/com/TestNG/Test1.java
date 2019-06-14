package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test1 {
	public WebDriver driver;
	@Test
	public void Start()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  String URL="https://www.google.com/";
		  driver.get(URL);
		  System.out.println("launched");
	}
  @Test
  public void TextEnter() throws InterruptedException {
	  driver.manage().window().maximize();
	  WebElement text = driver.findElement(By.name("q"));
	  text.sendKeys("Sonam");
Thread.sleep(3000);
  }
  
  @Test(enabled =true)
  public void ClickSearch() throws InterruptedException
  {
	  WebElement ClickSearch = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/div/center/input[1]"));
	//WebElement S=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[2]/div[1]/div/span"));
	 // S.click();
	  //Thread.sleep(2000);
	  //WebElement ClickSearch = driver.findElement(By.xpath("//*[@id=\"gsr\"]"));
	  ClickSearch.click();
	  
  }
}
