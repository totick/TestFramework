package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import browsers.Browser;

public class StudentsPage {

	private static final String URL = "http://localhost:8080/CourseManager_JSF/views/students.xhtml";
	private static final String TITLE = "Students";
	@FindBy(how = How.CSS, using="html body div.container div#content div.container.body-content div.row div.col-xs-10.col-lg-12 div.row div.col-lg-6.col-md-6 fieldset button.btn.btn-success")
	private WebElement showStudentFormButton;
	@FindBy(how = How.ID, using = "newFirstName")
	private WebElement newFirstNameField;
	@FindBy(how = How.ID, using = "newLastName")
	private WebElement newLastNameField;
	@FindBy(how = How.ID, using = "newPersonnr")
	private WebElement newPersonnrField;
	@FindBy(how = How.ID, using = "newGender")
	private WebElement newGenderRb;
	@FindBy(how = How.ID, using = "newStreet")
	private WebElement newStreetField;
	@FindBy(how = How.ID, using = "newCity")
	private WebElement newCityField;
	@FindBy(how = How.ID, using = "newTelephone")
	private WebElement newTelephoneField;
	@FindBy(how = How.ID, using = "newEmail")
	private WebElement newEmailField;
	@FindBy(how = How.ID, using = "newPassword")
	private WebElement newPasswordField;
	
	public void goTo() {
		Browser.goTo(URL);
	}
	
	public boolean isAt(){
		return Browser.getTitle().equals(TITLE);
	}
	
	public void showAddNewStudentForm(){
		showStudentFormButton.click();
	}
	
	public void addValueToNewFirstNameField(){
		
	}
	
}
