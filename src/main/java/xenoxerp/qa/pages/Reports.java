package xenoxerp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.methods.MouseInt;

import xenoxerp.qa.setup.SetUp;

public class Reports extends SetUp {
	
	public Reports(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Reports']")
	private WebElement Reports;
	
	@FindBy(xpath="//a[normalize-space()='Student Reports']")
	private WebElement StudReport;
	
    @FindBy(xpath="//a[normalize-space()='Admission Status Report']")
    private WebElement AdmStatusRep;
    
    @FindBy(xpath="//a[@class='btn btn-default dropdown-toggle']")
    private WebElement ExportOpt;
    
    @FindBy(xpath="//a[@id='MainContent_liExportXls']")
    private WebElement ExcelD;
    
   @FindBy(xpath="//a[normalize-space()='Student Info Report']")
   private WebElement studentInfoRep;
   
   @FindBy(xpath="//a[normalize-space()='Admission Status Report']")
   private WebElement admissionStatRep;
   
   @FindBy(xpath="//a[normalize-space()='Admission GR Report']")
   private WebElement admissionGrRep;
   
   @FindBy(xpath="//a[normalize-space()='Students Followup Report']")
   private WebElement studentsFollRep;
   
   
   @FindBy(xpath="//a[normalize-space()='Employee Report']")
   private WebElement employeeReport;
   
   @FindBy(xpath="//a[normalize-space()='Employee Reports']")
   private WebElement employeeReportss;
   
   @FindBy(xpath="//a[normalize-space()='Fees Reports']")
   private WebElement feesReports;
   
   @FindBy(xpath="//a[normalize-space()='Receipts Report']")
   private WebElement reciptsReport;
   
   @FindBy(xpath="//a[normalize-space()='Receivable Report']")
   private WebElement recievableReport;
   
   @FindBy(xpath="//a[normalize-space()='Installment Due Report']")
   private WebElement installmentDueReport;
   
   @FindBy(xpath="//a[normalize-space()='Fees Report']")
   private WebElement feesReport;
   
   @FindBy(xpath="//a[normalize-space()='Fees Details Report']")
   private WebElement feesDetailsReport;
   
   @FindBy(xpath="//a[normalize-space()='Batch Scheduling Report']")
   private WebElement batchSchedulingReport;
   
   @FindBy(xpath="//a[normalize-space()='WhatsApp Delivery Report']")
   private WebElement whatsAppDeliveryReport;
	
	public void hoverOnReports()
	{
		MouseInt.hoverOverElement(driver, Reports);
	}
	
	public void hoverOnStudReports()
	{
		MouseInt.hoverOverElement(driver,StudReport);
	}
	
	public void clickOnAdmissionStatusRep()
	{
		AdmStatusRep.click();
	}
	public void clickOnExpOpt()
	{
		ExportOpt.click();
	}
	public void clickOnExcelDownload()
	{
		ExcelD.click();
	}
	
	public void clickOnStudentInfoReport()
	{
		studentInfoRep.click();
	}
	
	public void clickOnAddStatusRep()
	{
		admissionStatRep.click();
	}
	public void clickOnAdmissionGrReport()
	{
		admissionGrRep.click();
	}
	
	public void clickOnStudentFollowUpReport()
	{
		studentsFollRep.click();
	}
	
	public void hoverOnEmployeReportss()
	{
		MouseInt.hoverOverElement(driver, employeeReportss);
	}
	
	public void clickOnEmpReport()
	{
		employeeReport.click();
	}
	
	//hover on fee reports
	public void hoverOnFeeReports()
	{
		MouseInt.hoverOverElement(driver, feesReports);
	}
	public void clickOnReciptsReport()
	{
		reciptsReport.click();
	}
	
	//Receivable report
	public void clickOnRecievableReport()
	{
		recievableReport.click();
	}
	
	//installement due report
	public void clickOnInstallemtDueReport()
	{
		installmentDueReport.click();
	}
	
	//fees report
	public void clickOnFeesReport()
	{
		feesReport.click();
	}
	
	//public void feesDetails Report
	public void clickOnFeesDetailsReport()
	{
		feesDetailsReport.click();
	}
	
	//batchSchedulingReport
	public void clikOnBatchSchedulingReport()
	{
		batchSchedulingReport.click();
	}
	
	//whatsAppDeliveryReport
	public void clikOnWhatsAppDeliveryReport()
	{
		whatsAppDeliveryReport.click();
	}
	
	
	

}
