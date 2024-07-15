package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Settings_DropDown {

	@FindBy(xpath = "//span[.='Settings']")private WebElement SettingsLnk;
	@FindBy(xpath = "//a[.='OTP List']")private WebElement OTPListlnk;
	@FindBy(xpath = "//a[.='App management']")private WebElement AppManagementLnk;
	@FindBy(xpath = "//a[.='Payment management']")private WebElement PaymentManagementLnk;
	@FindBy(xpath = "//a[.='Roles']")private WebElement RolesLnk;
	@FindBy(xpath = "//a[.='FMS Users']")private WebElement FMSUsersLnk;
	
	public Settings_DropDown(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSettingsLnk() {
		return SettingsLnk;
	}

	public WebElement getOTPListlnk() {
		return OTPListlnk;
	}

	public WebElement getAppManagementLnk() {
		return AppManagementLnk;
	}

	public WebElement getPaymentManagementLnk() {
		return PaymentManagementLnk;
	}

	public WebElement getRolesLnk() {
		return RolesLnk;
	}

	public WebElement getFMSUsersLnk() {
		return FMSUsersLnk;
	}
//	public void ClickSettingsAndOtpList(WebDriver driver) throws Exception {
//		WebDriverUtility wu=new WebDriverUtility();
//		SettingsDropDown.click();
//		Thread.sleep(3000);
//		OTPListlnk.click();
//		Thread.sleep(2000);
//		
	}

