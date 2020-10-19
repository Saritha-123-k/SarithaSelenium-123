package com.hrms.TestScripts;
import com.hrms.lib.*;
public class TC1 {
public static void main(String args[]) throws Exception{
	General g = new General();
	 //test case steps
	g.openapplication();
	g.Login();
	g.addemp();
	g.delmp();
	g.logout();
	g.closebrowser();
	}
	}



