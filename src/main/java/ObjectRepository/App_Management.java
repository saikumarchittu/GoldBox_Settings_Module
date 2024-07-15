package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class App_Management {

	//@FindBy (xpath = "(//div[@class='mdc-switch__shadow'])[1]")private WebElement BootStrapBtn;
	@FindBy(xpath = "//button[@role='switch']")private WebElement BootStrapBtn;
	
	public App_Management(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getBootStrapBtn() {
		return BootStrapBtn;
	}
	
}
