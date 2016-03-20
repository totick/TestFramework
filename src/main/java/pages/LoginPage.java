package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import browsers.Browser;

public class LoginPage {

	private static final String URL = "http://localhost:8080/CourseManager_JSF/";
	private static final String TITLE = "Course Manager";
	
	@FindBy(how = How.ID, using = "login-form:username")
	private WebElement userNameField;
	@FindBy(how = How.ID, using = "login-form:password")
	private WebElement passwordField;
	@FindBy(how = How.XPATH, using = "/html/body/div/div[3]/div[1]/div/form/input[2]")
	private WebElement submitButton;
	@FindBy(how = How.CLASS_NAME, using = "logoutLink")
	WebElement logoutLink;

	public void goTo() {
		Browser.goTo(URL);
	}
	
	public boolean isAt(){
		return Browser.getTitle().equals(TITLE);
	}
	
	public void addValueToUsernameField(String username){
		userNameField.sendKeys(username);
	}
	
	public void addValueToPasswordField(String password){
		passwordField.sendKeys(password);
	}
	
	public void submitLoginForm(){
		submitButton.click(); //Did not work with the submit-method
	}
	
//	public void loginAsAdmin(){
//		this.goTo();
//		userNameField.sendKeys(ADMIN_USERNAME);
//		passwordField.sendKeys(ADMIN_PASSWORD);
//		submitButton.click(); //Did not work with the submit-method
//	}
	
	public void logoutUser(){
		if(logoutLink != null)
			logoutLink.click();
	}

//	public void loginAsStudent() {
//		this.goTo();
//		userNameField.sendKeys(STUDENT_USERNAME);
//		passwordField.sendKeys(STUDENT_PASSWORD);
//		submitButton.click();
//	}
}
