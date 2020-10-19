package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class General extends Global {
	public void openapplication(){
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url); }
		public void closebrowser(){
		driver.quit();
		}
		public void Login() throws Exception{
		driver.findElement(By.name("txt_loginname")).sendKeys(un);
		driver.findElement(By.name("txt_password")).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		}
		public void logout(){
		driver.findElement(By.linkText(link_logout)).click(); }
		public void addemp(){
		System.out.println("adding new emp"); }
		public void delmp(){
		System.out.println("delete emp"); 
		}
		}
