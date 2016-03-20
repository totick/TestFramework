package pages;

import org.openqa.selenium.support.PageFactory;

import browsers.Browser;

public class Pages {
	
	public static LoginPage getLoginPage(){
		return PageFactory.initElements(Browser.getDriver(), LoginPage.class);
	}
	
	public static StudentsPage getStudentsPage(){
		return PageFactory.initElements(Browser.getDriver(), StudentsPage.class);
	}
	
	
}
