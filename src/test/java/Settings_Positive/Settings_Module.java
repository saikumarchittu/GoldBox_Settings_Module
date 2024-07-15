package Settings_Positive;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ObjectRepository.App_Management;
import ObjectRepository.Fms_User;
import ObjectRepository.OtpList_Page;
import ObjectRepository.Roles_Page;
import ObjectRepository.Settings_DropDown;
import genericUtility.FMS_BaseClass;
import genericUtility.WebDriverUtility;


@Listeners(genericUtility.ListnersImplementationClass.class)
public class Settings_Module extends FMS_BaseClass {
    
	@Test(priority = 1)
	public void OtpList() throws Exception {
		WebDriverUtility wu=new WebDriverUtility(); 
		
		Settings_DropDown sd=new Settings_DropDown(driver);
		sd.getSettingsLnk().click();
		
		Thread.sleep(2000);
		
		sd.getOTPListlnk().click();
		Thread.sleep(2000);
		
		OtpList_Page olp=new OtpList_Page(driver);
		olp.getSearchBar().sendKeys("1315646vsdvad");
		Thread.sleep(2000);
		
		olp.getSearchBar().clear();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
	    wu.scrollActiony(driver, olp.getNextBtn());
		Thread.sleep(2000);
		
		olp.getNextBtn().click();
		Thread.sleep(2000);
		olp.getPreviousBtn().click();
		
		WebElement Page_Title=driver.findElement(By.xpath("//div[@class='page-title']"));
		Thread.sleep(1000);
		if(Page_Title.isDisplayed()) 
		{
			
			wu.takeScreenShot(driver, "User OTP's page");
		}
		else 
		{
			System.out.println("User OTP's Page Is Not Displayed");
		}
	}
		
		@Test(priority = 2)
		public void App_Management() throws Exception 
		{
	        WebDriverUtility wu=new WebDriverUtility();    
			
			Settings_DropDown sp=new Settings_DropDown(driver);
			sp.getSettingsLnk().click();
			
			Thread.sleep(2000);
			sp.getAppManagementLnk().click();
			
			Thread.sleep(2000);
			App_Management am=new App_Management(driver);
			am.getBootStrapBtn().click();
			
			Thread.sleep(2000);
			am.getBootStrapBtn().click();
			Thread.sleep(2000);		
		
			WebElement page_Title=driver.findElement(By.xpath("//div[@class='page-title']"));
			Thread.sleep(2000);
			
			if(page_Title.isDisplayed()) 
			{
			wu.takeScreenShot(driver, "App Management Page");	
			}
			else
			{
			System.out.println("App Management Page Is Not Displayed");	
			}

		
		}
		
		@Test(priority = 3)
		public void Payment_Management() throws Exception {
			WebDriverUtility wu=new WebDriverUtility();
			Settings_DropDown sd=new Settings_DropDown(driver);
			ObjectRepository.Payment_Management pd=new ObjectRepository.Payment_Management(driver);
			sd.getSettingsLnk().click();
			Thread.sleep(2000);
			
			sd.getPaymentManagementLnk().click();
			Thread.sleep(2000);
			
			pd.getBootStrapBtn().click();
			Thread.sleep(2000);
			
			pd.getBootStrapBtn().click();
			Thread.sleep(4000);
			
			pd.getAddPaymentMethodBtn().click();
			Thread.sleep(2000);
			
			pd.getTitleEdt().sendKeys("Paytm");
			Thread.sleep(2000);
			
			pd.getBootStrapBtn1().click();
			Thread.sleep(2000);
			
			pd.getAddBtn().click();
			
			Thread.sleep(1000);
			
			WebElement ErrorPopUpMsg=driver.findElement(By.xpath("//div[@aria-label='Title is Already Existed, Please Enter Another Title']"));
			Thread.sleep(1000);
			
			if(ErrorPopUpMsg.isDisplayed())
			{
				wu.takeScreenShot(driver, "Error PupUp Msg");
			}
			else {
				System.out.println("Payment Method Is Creared Successfully");
			}
			
			pd.getClosebtn().click();
		
			Thread.sleep(5000);
			
			WebElement PageTitle=driver.findElement(By.xpath("//div[@class='page-title']"));
			Thread.sleep(1000);
			
			if(PageTitle.isDisplayed())
			{
				wu.takeScreenShot(driver, "Payment Method Management list");
			}
			else
			{
				System.out.println("Payment Method Management list is Not Displayed");
			}
		}
		
		@Test(priority = 4)
		public void Roles() throws Exception {
			WebDriverUtility wu=new WebDriverUtility();
			Settings_DropDown sd=new Settings_DropDown(driver);
			Roles_Page rp=new Roles_Page(driver);
			sd.getSettingsLnk().click();
			
			Thread.sleep(2000);
			
			sd.getRolesLnk().click();
			
			Thread.sleep(2000);
			rp.getAddRoleBtn().click();
			Thread.sleep(1000);
			
			rp.getRoleTitleEdt().sendKeys("Testing");
			Thread.sleep(2000);
			
			rp.getAddBtn().click();	
			Thread.sleep(1000);
			
			WebElement CreateRole=driver.findElement(By.xpath("//div[@aria-label='[object Object]']"));
			
			if(CreateRole.isDisplayed())
			{
				wu.takeScreenShot(driver, "Create Role Message");
			}
			else
			{
			     System.out.println("Already Admin Type PopUp");	
			}
			
			Thread.sleep(3000);
			
			rp.getSearchBar().sendKeys("Testing");
			Thread.sleep(2000);
			
			rp.getEditBtn().click();
			Thread.sleep(2000);
			
			rp.getRoleEditEdt().clear();
			Thread.sleep(1000);
		    rp.getRoleEditEdt().sendKeys("Testing");
		    Thread.sleep(2000);
			
		    rp.getUpdateBtn().click();
		    Thread.sleep(1000);
		    
		    WebElement updatemsg=driver.findElement(By.xpath("//div[@aria-label='Admin Type Updated Successfully']"));
		    
		    if(updatemsg.isDisplayed())
		    {
		    	wu.takeScreenShot(driver, "Upadated PopUp");
		    	}
		    
		    else
		    {
			      System.out.println("Not Updated Role Name");	
			}
		    
		    Thread.sleep(1000);
		    rp.getSearchBar().clear();
		    Thread.sleep(2000);
		    rp.getSearchBar().sendKeys("Testing");
		    
		    Thread.sleep(2000);
		    rp.getDeleteBtn().click();
		    Thread.sleep(1000);
		    
		    rp.getYesDeleteBtn().click();
		    
		    Thread.sleep(3000);
		    
		    WebElement deletePopUp=driver.findElement(By.xpath("//div[@aria-label='Role deleted Successfully']"));
		    
		    if(deletePopUp.isDisplayed())
		    {
		    	wu.takeScreenShot(driver, "Role Delete PopUp");
		    }
		    else
		    {
			     System.out.println("Role Is Not Deleted");	
			}
			
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		    
		    wu.scrollActiony(driver, rp.getNextBtn());
		    Thread.sleep(2000);
		    rp.getNextBtn().click();
		    Thread.sleep(2000);
		    rp.getPreviousBtn().click();
			
		}
		
		@Test (priority = 5)
		public void AddFmsUSer() throws Exception {
			WebDriverUtility wu=new WebDriverUtility();
			Settings_DropDown sd=new Settings_DropDown(driver);
			Fms_User fu=new Fms_User(driver);
			
			sd.getSettingsLnk().click();
			Thread.sleep(2000);
			
			sd.getFMSUsersLnk().click();
			Thread.sleep(2000);
			
			fu.getAddFmsUserBtn().click();
			Thread.sleep(2000);
			
			fu.getFullNameEdt().sendKeys("SaiKumar");
			fu.getMobileNumEdt().sendKeys("9381220640");
			fu.getEmailEdt().sendKeys("saichitturi9@gmail.com");
			fu.getPasswordEdt().sendKeys("Saichitturi9");
			Thread.sleep(2000);
			fu.getPositionOpt().click();
			Thread.sleep(1000);
			fu.getAddBtn().click();
			
			Thread.sleep(1000);
			WebElement PopUp=driver.findElement(By.xpath("//div[@aria-label='[object Object]']"));
			
			if(PopUp.isDisplayed())
			{
				wu.takeScreenShot(driver, "User Added PopUp");
			}
			else
			{
				System.out.println("User Added UnSuccessfully");
			}
			
			Thread.sleep(2000);
			
			fu.getSearchBar().sendKeys("SaiKumar");
			Thread.sleep(1000);
		
			fu.getUsereditBtn().click();
			Thread.sleep(2000);
			
			fu.getEditNameEdt().clear();
			
			Thread.sleep(1000);
			fu.getEditNameEdt().sendKeys("SaiKumar");
			Thread.sleep(2000);
			
			fu.getUpdateBtn().click();
			
			Thread.sleep(1000);
			WebElement popUp=driver.findElement(By.xpath("//div[@aria-label='Admin Details Updated Successfully']"));
			
			if(popUp.isDisplayed())
			{
				wu.takeScreenShot(driver, "User Edit SuccessFull PopUp");
			}
			else
			{
				System.out.println("user Edit UnSuccessfull");
			}
			
			Thread.sleep(2000);
			
			fu.getSearchBar().clear();
			Thread.sleep(2000);
			
			fu.getSearchBar().sendKeys("SaiKumar");
			Thread.sleep(2000);
			
			fu.getDeleteBtn().click();
			Thread.sleep(2000);
			
			fu.getYesDeletebtn().click();
			Thread.sleep(1000);
			
			WebElement Delete=driver.findElement(By.xpath("//div[@aria-label='Role deleted Successfully']"));
			
			if(Delete.isDisplayed())
			{
				wu.takeScreenShot(driver, "Role Deleted PopUp");
			}
			else
			{
			       System.out.println("Role Is Not Deleted");	
			}
			
			Thread.sleep(3000);
			
		}
		
}