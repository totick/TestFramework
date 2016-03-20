package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import browsers.Browser;

public class StudentsPage {

	private static final String URL = "http://localhost:8080/CourseManager_JSF/views/students.xhtml";
	private static final String TITLE = "Students";
	@FindBy(how = How.CSS, using="html body div.container div#content div.container.body-content div.row div.col-xs-10.col-lg-12 div.row div.col-lg-6.col-md-6 fieldset button.btn.btn-success")
	private WebElement showStudentFormButton;
	@FindBy(how = How.ID, using = "asf:newFirstName")
	private WebElement newFirstNameField;
	@FindBy(how = How.ID, using = "asf:newLastName")
	private WebElement newLastNameField;
	@FindBy(how = How.ID, using = "asf:newPersonnr")
	private WebElement newPersonnrField;
	@FindBy(how = How.NAME, using = "asf:newGender")
	private List<WebElement> newGenderRb;
	@FindBy(how = How.ID, using = "asf:newStreet")
	private WebElement newStreetField;
	@FindBy(how = How.ID, using = "asf:newCity")
	private WebElement newCityField;
	@FindBy(how = How.ID, using = "asf:newTelephone")
	private WebElement newTelephoneField;
	@FindBy(how = How.ID, using = "asf:newEmail")
	private WebElement newEmailField;
	@FindBy(how = How.ID, using = "asf:newPassword")
	private WebElement newPasswordField;
	@FindBy(how = How.ID, using = "asf:studentFormSubmit")
	private WebElement submitNewStudentForm;
	
	
	public void goTo() {
		Browser.goTo(URL);
	}
	
	public boolean isAt(){
		return Browser.getTitle().equals(TITLE);
	}
	
	public void showAddNewStudentForm(){
		showStudentFormButton.click();
		Browser.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void addValueToNewFirstNameField(String value){
		this.newFirstNameField.sendKeys(value);
	}
	
	public void addValueToNewLastNameField(String value){
		this.newLastNameField.sendKeys(value);
	}
	
	public void addValueToNewPersonnrField(String value){
		this.newPersonnrField.sendKeys(value);
	}
	
	public void addValueToNewGenderRb(String value){
		if(value.equals("male")){
			this.newGenderRb.get(0).click();
		}
		else{
			this.newGenderRb.get(1).click();
		}
	}
	
	public void addValueToNewStreetField(String value){
		this.newStreetField.sendKeys(value);
	}
	
	public void addValueToNewCityField(String value){
		this.newCityField.sendKeys(value);
	}
	
	public void addValueToNewTelephoneField(String value){
		this.newTelephoneField.sendKeys(value);
	}
	
	public void addValueToNewEmailField(String value){
		this.newEmailField.sendKeys(value);
	}
	
	public void addValueToNewPasswordField(String value){
		this.newPasswordField.sendKeys(value);
	}
	
	public void submitAddStudentForm(){
		this.submitNewStudentForm.click();
	}
	
	public boolean isTextInStudentsListTable(String text){
		List<WebElement> elements = Browser.getDriver().findElements(By.cssSelector("#sf\\:studentListTable td"));
		for(WebElement elem : elements){
			if(elem.getText().trim().equals(text)){
				return true;
			}
		}
		return false;
	}
}
