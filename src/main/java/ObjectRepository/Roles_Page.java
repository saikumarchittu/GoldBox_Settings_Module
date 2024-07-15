package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roles_Page {

	@FindBy (xpath = "//input[@placeholder='Search...']") private WebElement SearchBar;
	
	@FindBy (xpath = "(//td[.='Testing']/../descendant::td)[3]//button[.=' Edit ']")private WebElement EditBtn;
	
	@FindBy (xpath = "((//td[.='Testing']/../descendant::td)[3]//button[@type='button'])[2]") private WebElement DeleteBtn;
	
	@FindBy (xpath = "//button[.='Add Role']") private WebElement AddRoleBtn;
	
	@FindBy (xpath = "(//input[@formcontrolname='title'])[1]") private WebElement RoleTitleEdt;
	
	@FindBy (xpath = "//button[.='Add']") private WebElement AddBtn;
	
	@FindBy (xpath = "(//input[@placeholder='Enter role title'])[2]") private WebElement RoleEditEdt;
	
	@FindBy (xpath = "//button[.='Update']") private WebElement UpdateBtn;
	
	@FindBy (xpath = "//div[@aria-label='Role deleted Successfully']") private WebElement DeletePopUp;
	
	@FindBy (xpath = "//button[.='Yes, Delete!']") private WebElement YesDeleteBtn;
	
	@FindBy (xpath = "//li[@class='pagination-next']") private WebElement NextBtn;
	
	@FindBy (xpath = "//li[@class='pagination-previous']") private WebElement PreviousBtn;
	
	public Roles_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getEditBtn() {
		return EditBtn;
	}

	public WebElement getDeleteBtn() {
		return DeleteBtn;
	}

	public WebElement getAddRoleBtn() {
		return AddRoleBtn;
	}

	public WebElement getRoleTitleEdt() {
		return RoleTitleEdt;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getRoleEditEdt() {
		return RoleEditEdt;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public WebElement getDeletePopUp() {
		return DeletePopUp;
	}

	public WebElement getYesDeleteBtn() {
		return YesDeleteBtn;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}

	public WebElement getPreviousBtn() {
		return PreviousBtn;
	}	
	
	
	
	
}
