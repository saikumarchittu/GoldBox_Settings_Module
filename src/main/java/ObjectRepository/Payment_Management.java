package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Management {

	@FindBy (xpath = "(//button[@role='switch'])[1]") private WebElement BootStrapBtn;
	
	@FindBy (xpath = "//button[.='Add payment method']") private WebElement AddPaymentMethodBtn;
	
	@FindBy (xpath = "//input[@formcontrolname='title']") private WebElement TitleEdt;
	
	@FindBy (xpath = "//mat-slide-toggle[@formcontrolname='payment_status']") private WebElement BootStrapBtn1;
	
	@FindBy (xpath = "//button[.='Add']") private WebElement AddBtn;
	
//	@FindBy (xpath = "//div[@aria-label='Title is Already Existed, Please Enter Another Title']") private WebElement ErrorPopUpMsg;
	
	@FindBy (xpath = "//button[@aria-label='Close']") private WebElement Closebtn;
	
	public Payment_Management(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getBootStrapBtn() {
		return BootStrapBtn;
	}

	public WebElement getAddPaymentMethodBtn() {
		return AddPaymentMethodBtn;
	}
	

	public WebElement getTitleEdt() {
		return TitleEdt;
	}

	public WebElement getBootStrapBtn1() {
		return BootStrapBtn1;
	}

	public WebElement getAddBtn() {
		return AddBtn;
	}

	public WebElement getClosebtn() {
		return Closebtn;
	}
		
}
