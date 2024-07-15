package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class OtpList_Page {

	@FindBy(xpath = "//input[@placeholder='Search...']")private WebElement SearchBar;
	@FindBy(xpath = "//li[@class='pagination-next']") private WebElement NextBtn;
	//@FindBy(xpath = "//li[@class='pagination-next ng-star-inserted']")private WebElement NextBtn;
	@FindBy(xpath = "//li[@class='pagination-previous']") private WebElement PreviousBtn;
	//@FindBy(xpath = "//li[@class='pagination-previous ng-star-inserted']") private WebElement Previousbtn;
	
	public OtpList_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	
	public WebElement getSearchBar() {
		return SearchBar;
	}
	public WebElement getNextBtn() {
		return NextBtn;
	}
	public WebElement getPreviousBtn() {
		return PreviousBtn;
	}

	
	public void PerformingOtpPage(WebDriver driver) throws Exception {
		WebDriverUtility wu=new WebDriverUtility();
		wu.waitUntilPageLoad(driver);
//		SearchBar.sendKeys("svsdv656");
//		Thread.sleep(2000);
//		SearchBar.clear();
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		wu.scrolldown(driver);
	}
}
