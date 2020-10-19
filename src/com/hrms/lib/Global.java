package com.hrms.lib;
import org.openqa.selenium.WebDriver;
public class Global {
//Test Data
public WebDriver driver;
public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
public String un = "admin";
public String pw = "admin";
//Objects info
public String txt_EnterEmail = "txtUserName";
public String txt_Enterpassword = "txtPassword";
public String btn_login = "Submit";
public String link_logout = "Logout";
}
