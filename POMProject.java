package project;
import java.util.ArrayList;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class POMProject {
	
	 WebDriver driver;
	 Logger log = LogManager.getLogger("POMProject");

 //------------------------------------------Login Info Element---------------------------------------------------------------//
	 
		@FindBy(xpath="//input[@name='vchLogin_Name']") WebElement Username;
		@FindBy(xpath="//input[@name='vchPassword']") WebElement Password;
		@FindBy(xpath="//button[@type='button']") WebElement Login;
	
 //------------------------------------------Add Patient Elements---------------------------------------------------------------//
		
		@FindBy(xpath="//iframe[@id='fra_Menu_CureMD']") WebElement Frame1;
		@FindBy(xpath="//i[@class='icon icon-patient']") WebElement Patient;
		@FindBy(xpath="//iframe[@id='fraCureMD_Body']") WebElement Frame2;
		@FindBy(xpath="//td[@title='Add Patient']") WebElement AddBt;
		@FindBy(xpath="//select[@id='cmbVTitle']") WebElement TitleBt;
		@FindBy(xpath="//input[@id='txtVFNAME']") WebElement FirstName;
		@FindBy(xpath="//input[@id='txtVLNAME']") WebElement LastName;
		@FindBy(xpath="//select[@id='cmbVSEX']") WebElement Gender;
		@FindBy(xpath="//input[@id='txtDDOB']") WebElement DOB;
		@FindBy(xpath="//select[@id='cmbILOCID']") WebElement Location;
		@FindBy(xpath="//input[@id='txtVZIP']") WebElement Zip1;
		
		@FindBy(xpath="//input[@id='txtvcity']") WebElement City;
		@FindBy(xpath="//input[@id='txtVSTATE']") WebElement State;
		@FindBy(xpath="//input[@id='txtVEMAIL']") WebElement Email;
		
		@FindBy(xpath="//img[@id='imgpInsurance']") WebElement Primary;
		@FindBy(xpath="//select[@id='cmbIPLANID']") WebElement Plan1;
		@FindBy(xpath="//select[@id='cmbPlanAdd']") WebElement Address1;
		@FindBy(xpath="//input[@id='txtDSIGNONFILE']") WebElement SignOnFile1;
		
		@FindBy(xpath="//img[@id='imgSInsurance']") WebElement Secondary;
		@FindBy(xpath="//select[@id='cmbSECPLANID']") WebElement Plan2;
		@FindBy(xpath="//select[@id='cmbSecPlanAdd']") WebElement Address2;
		@FindBy(xpath="//img[@id='Img4']") WebElement CalenderIcon;
		@FindBy(xpath="//td[text()='13']") WebElement Yesterday;
		
		
		@FindBy(xpath="//input[@id='txtSecDSIGNONFILE']") WebElement SignOnFile2;	
		@FindBy(id="tdsave") WebElement SaveBt;
		
		@FindBy(xpath="//Iframe[@id='DynamicBHdialogbox']") WebElement Frame3;	
		@FindBy(xpath="//button[@id='saveAsNewButton']") WebElement SaveAsNewBt;	
		@FindBy(xpath="//td[@id='spRedFlag']") WebElement NameTest;
		
	//-------------------------------Create Case Element ----------------------------------------------------------//
		
		@FindBy(xpath="//iframe[@id='fraCureMD_Patient_Menu']") WebElement Frame4;
		@FindBy(xpath="//a[@id='Provider_Notes_anchor']") WebElement ProviderNotes ;	
		@FindBy(xpath="//a[@id='Provider_Notes_New_Case_anchor']") WebElement NewCase ;
		@FindBy(xpath="//input[@id='txtVCNAME']") WebElement CaseName;
		@FindBy(xpath="//input[@id='txtDSTART']") WebElement CaseOpen;
		@FindBy(xpath="//td[@id='cmdSubmit']") WebElement SaveBt2;
		@FindBy(xpath="//span[text()='Accident']") WebElement CaseTest;
		
		
		
	//-------------------------------Create Provider Note Element ----------------------------------------------------------//	
		
		@FindBy(xpath="//li[@id='Provider_Notes_Provider_Notes']") WebElement ProviderNotes2;
		@FindBy(xpath="//td[@id='SpAdd1']") WebElement AddProviderNotesBt;
		@FindBy(xpath="//input[@id='Sdate']") WebElement Date;
		@FindBy(xpath="//select[@id='cmbProvider']") WebElement Provider;
		@FindBy(xpath="//select[@id='cmbRTemplate']") WebElement NoteTemplate;
		@FindBy(xpath="//select[@id='txtVREASON']") WebElement VisitReason;
		@FindBy(xpath="//select[@id='cmbLocation']") WebElement Location2;
		@FindBy(xpath="//td[@id='btnSave']") WebElement Create;
		@FindBy(xpath="//select[@id='cmbReportType']") WebElement NoteType;
		@FindBy(xpath="//font[@id='Comp_Heading']") WebElement ProviderTest;
		
		
		
	//-------------------------------Add Diagnosis Note Element ----------------------------------------------------------//
		
		@FindBy(xpath="//label[@id='label_Clinical_Diagnoses_6']/following::a[1]") WebElement AddDiagnosis;
		@FindBy(xpath="//iframe[@id='DynamicBHdialogbox']") WebElement Frame5;
		@FindBy(xpath="//input[@id='txtKeyword']") WebElement Search;
		@FindBy(xpath="//img[@id='imgMaster']") WebElement SearchBt;
		@FindBy(xpath="//a[@id='0']") WebElement Link;
		@FindBy(xpath="//td[@id='tdSaveDiagnosis']") WebElement SaveBt3;
		@FindBy(xpath="//td[@id='tdSoapAccept']") WebElement Accept;
		@FindBy(xpath="//iframe[@id='frmclinicalsummary']") WebElement DiagnosisTest;
		
		
   //-------------------------------Add Procedure Element ----------------------------------------------------------//
		
		@FindBy(xpath="//a[@id='Clinical_Lab_Order_7_anchor']") WebElement Orders;
		@FindBy(xpath="//label[@id='label_OrderResult_8_2']/following::a[1]") WebElement AddProcedure;
		@FindBy(xpath="//iframe[@id='DynamicBHdialogbox']") WebElement Frame6;
		@FindBy(xpath="//input[@id='txtSearch']") WebElement Search2;
		@FindBy(xpath="//img[@id='SearchImg']") WebElement SearchBt2;
		@FindBy(xpath="//ul[@id='ulSearchResultFav']/li/a") WebElement Link2;
		@FindBy(xpath="//td[@id='tdSaveDiagnosis']") WebElement SaveAccept;
		@FindBy(xpath="//font[text()='Procedures']") WebElement ProcedureTest;
		
		
		//-------------------------------Create eSuperbill Element ----------------------------------------------------------//	
		
		@FindBy(xpath="//td[@id='sp_eSuperbill']") WebElement CreateSuperBillBt;
		@FindBy(xpath="//select[@id='ddleandm']") WebElement EvaAndManagDrp;
		@FindBy(xpath="//input[@id='chk99211']") WebElement CheckBox;
		
		@FindBy(xpath="//input[@id='gvSuperBill_ctl02_txtDxPointer']") WebElement DxPointerDrp;
		@FindBy(xpath="//input[@id='chkDxPointer_1']") WebElement OneBox;
		@FindBy(xpath="//input[@id='gvSuperBill_ctl02_txtAmount']") WebElement Amount;
		@FindBy(xpath="//li[@id='tdSave']/a[1]") WebElement SaveBt4;
		
		
		
		//Constructor Declaration
		public POMProject(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
	 public void userLoginIn() {
			
			Username.sendKeys("ChargeCase");
			Password.sendKeys("SuPPort.2014");
			Login.click();
		
			String ExpectedTitle = "Welcome to CureMD";
			String ActualTitle = driver.getTitle();
			
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			log.info("User Login Successful");
			
		}
	 
	 
	 public void addPatient() throws InterruptedException {
			
		Thread.sleep(3000);
 	    ArrayList<String> tab1 = new ArrayList<String>(driver.getWindowHandles());                                      
 	    driver.switchTo().window(tab1.get(1));
 	    Thread.sleep(3000);
 	    log.info("Switched to Window");
 	    
 	    driver.switchTo().frame(Frame1);
		Thread.sleep(3000);
	    Patient.click();
	    Thread.sleep(3000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(3000);
	    driver.switchTo().frame(Frame2);
		Thread.sleep(3000);
	 
		AddBt.click();
		
		Select DrpTitle1 = new Select(TitleBt);
		DrpTitle1.selectByIndex(3);
		Thread.sleep(3000);
		FirstName.sendKeys("Hamza");
	    LastName.sendKeys("Qaisar");
	    
	    Select DrpTitle2 = new Select(Gender);
		DrpTitle2.selectByIndex(0);
		
		Thread.sleep(2000);
		DOB.sendKeys("10/28/1999");
		
		Select DrpTitle3 = new Select(Location);
		DrpTitle3.selectByVisibleText("abc");
		Thread.sleep(2000);
		
		Zip1.sendKeys("10001");
		
		
		City.sendKeys("New York");
		
		State.sendKeys("AE");
		
		Email.sendKeys("hamzaqaiser998@gmail.com");
		Thread.sleep(2000);
		

		
		Primary.click();
		Select Drp1 = new Select(Plan1);
		Drp1.selectByVisibleText("AARP");
		Thread.sleep(1000);	
		Select Drp2= new Select(Address1);
		Drp2.selectByVisibleText("P O BOX 1017");
		SignOnFile1.sendKeys("12/14/2022");
		
		Secondary.click();	
		Select Drp3= new Select(Plan2);
		Drp3.selectByVisibleText("AETNA");
		Thread.sleep(1000);
		Select Drp4= new Select(Address2);
		Drp4.selectByVisibleText("P.O. BOX 981106");
		SignOnFile2.sendKeys("12/13/2022");
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		SaveBt.click();
		
		Thread.sleep(3000);
		driver.switchTo().frame(Frame3);
		
		SaveAsNewBt.click();
		Thread.sleep(2000);
	
	    act.sendKeys(Keys.PAGE_UP).build().perform();
	    act.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        
		 Thread.sleep(2000);
		 driver.switchTo().frame(Frame4); 
	    Assert.assertTrue(ProviderNotes.isDisplayed());

		
	 }	
	 public void createCase() throws InterruptedException {
		 
		 
		 log.info("Frame Changed");
		 ProviderNotes.click();
		 NewCase.click();
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame(Frame2); 
		 CaseName.sendKeys("Accident");
		 CaseOpen.sendKeys("12/15/2022");
		 Thread.sleep(2000);
		 SaveBt2.click();
		 
		 log.info("Case Created");
		 
		
		 Thread.sleep(3000);
		 Assert.assertEquals(true, CaseTest.isDisplayed());
		 
	 }
	 
    public void createProviderNote() throws InterruptedException {
    	driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.switchTo().frame(Frame4); 
		 ProviderNotes2.click();
		 Thread.sleep(2000);
			 
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(Frame2); 
	   AddProviderNotesBt.click();
        Thread.sleep(2000);
        Date.sendKeys("12/15/2022");
        
        Select DrpTitle1 = new Select(Provider);
		DrpTitle1.selectByVisibleText("Appointment, Televisit");
		Thread.sleep(2000);
		
		Select DrpTitle2 = new Select(NoteTemplate);
		DrpTitle2.selectByVisibleText("Appointment Field max");
		Thread.sleep(2000);
		
		Select DrpTitle3 = new Select(VisitReason);
		DrpTitle3.selectByVisibleText("ABTJF");
		Thread.sleep(2000);
		
		Select DrpTitle4 = new Select(Location2);
		DrpTitle4.selectByVisibleText("Clinic One10");
		Thread.sleep(2000);
		
		Select DrpTitle5 = new Select(NoteType);
		DrpTitle5.selectByVisibleText("H&P Note");
		Thread.sleep(2000);
		Create.click();
		log.info("ProviderNotes Complete");
		
	
		 Assert.assertEquals(true, ProviderTest.isDisplayed());
		
		
    }
    
    public void addDiagnosis() throws InterruptedException {
    	
         Thread.sleep(5000);
    	 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 driver.switchTo().frame(Frame4); 
		 AddDiagnosis.click();
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 driver.switchTo().frame(Frame5); 
		 Thread.sleep(3000);
		 Search.sendKeys("A00.0");
		 Thread.sleep(3000);
		 SearchBt.click();
		 Thread.sleep(3000);
		 Link.click();
		 Thread.sleep(3000);
		 SaveBt3.click();
		 Accept.click();
		 log.info("Diagnosis Complete");
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 driver.switchTo().frame(Frame4); 
		 Assert.assertTrue(Orders.isDisplayed());
		 
}
    
    public void addProcedure() throws InterruptedException {
    	
   
		Orders.click();
		Thread.sleep(2000);
		AddProcedure.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(Frame6); 
		Thread.sleep(3000);
		Search2.sendKeys("99211"); 
		Thread.sleep(2000);
    	SearchBt2.click();
    	Thread.sleep(2000);
    	Link2.click();
    	Thread.sleep(2000);
    	SaveAccept.click();
    	
    	log.info("Procedure Complete");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(Frame2); 
		Thread.sleep(3000);
		 Assert.assertTrue(CreateSuperBillBt.isDisplayed());
}
public void createSuperBill() throws InterruptedException {
		
	
	    CreateSuperBillBt.click();
	    Thread.sleep(3000);
	    Select DrpTitle1 = new Select(EvaAndManagDrp);
		DrpTitle1.selectByVisibleText("99251-99255: Inpatient Consultations");
		Thread.sleep(2000);
		
		CheckBox.click();
		Thread.sleep(2000);
		 DxPointerDrp.click();
		 Thread.sleep(2000);
		 OneBox.click();
	
	  Actions act = new Actions(driver);
	  act.doubleClick(Amount).build().perform(); 
	    Amount.clear();
	    Amount.sendKeys("10.00");
	    Thread.sleep(2000);
		SaveBt4.click();
		log.info("SuperBill Complete");
		
		String ExpectedTitle="Patient: Provider Notes: eSuperbill";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
			
}
}
