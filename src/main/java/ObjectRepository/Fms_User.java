package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fms_User {

	@FindBy (xpath = "//input[@placeholder='Search...']") private WebElement SearchBar;
	
	@FindBy(xpath = "//button[.='Add FMS User']")private WebElement AddFmsUserBtn;
	
	@FindBy(xpath = "(//input[@formcontrolname='name'])[1]") private WebElement FullNameEdt;
	
	@FindBy (xpath = "(//input[@formcontrolname='mobile'])[1]") private WebElement MobileNumEdt;
	
	@FindBy (xpath = "(//input[@formcontrolname='email'])[1]") private WebElement EmailEdt;
	
	@FindBy (xpath = "(//input[@formcontrolname='password'])[1]") private WebElement PasswordEdt;
	
	@FindBy (xpath = "(//select[@formcontrolname='role'])[1]") private WebElement RoleDropDown;
	
	@FindBy (xpath = "(//option[.='QA Tester'])[1]") private WebElement PositionOpt;
	
	@FindBy (xpath = "//button[.='Add']") private WebElement AddBtn;
	
	@FindBy (xpath = "(//td[.='SaiKumar']/../descendant::td)[6]//button[.=' Edit ']") private WebElement UsereditBtn;
	
	@FindBy (xpath = "(//td[.='SaiKumar']/../descendant::td)[6]//button[@class='mr-2 btn-danger']") private WebElement DeleteBtn;
	
	@FindBy (xpath = "(//input[@formcontrolname='name'])[2]") private WebElement EditNameEdt;
	
	@FindBy (xpath = "//button[.='Update']") private WebElement UpdateBtn;
	
	@FindBy (xpath = "//button[.='Yes, Delete!']") private WebElement YesDeletebtn;
	
	public Fms_User(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddFmsUserBtn() {
		return AddFmsUserBtn;
	}

	public WebElement getFullNameEdt() {
		return FullNameEdt;
	}

	public WebElement getMobileNumEdt() {
		return MobileNumEdt;
	}

	public WebElement getEmailEdt() {
		return EmailEdt;
	}

	public WebElement getPasswordEdt() {
		return PasswordEdt;
	}

	public WebElement getRoleDropDown() {
		return RoleDropDown;
	}

	public WebElement getPositionOpt() {
		return PositionOpt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getUsereditBtn() {
		return UsereditBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getEditNameEdt() {
		return EditNameEdt;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public WebElement getYesDeletebtn() {
		return YesDeletebtn;
	}
	
}