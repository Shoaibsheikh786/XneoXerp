package com.zenoxerp.qa.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.generic.methods.Downloads;
import com.timeUnits.TimeUnit;

import xenoxerp.qa.pages.Reports;
import xenoxerp.qa.setup.SetUp;

public class ReportTest extends SetUp{
	
	public String AdStatusRepFileName="Admission.xls";
	public String StudentinfoFileName="Student Info.xls";
	public String AdStatusGrRepFileName="Admission (1).xls";
	public String StudentFollowRepFileName="Student Followup.xls";
	public String EmployeesReport="Employees.xls";
	public String ReceiptReport="Receipts Report.xls";
	public String RecievalbeReport="Receivable Report.xls";
	public String InstallementDueRep="Installment Due Report.xls";
	public String FeesReport="FeesReport.xls";
	public String FeesDetailsReport="FeesReportDetails.xls";
    public String BatchSchedulingReport="BatchSchedule.xls";
    public String WhatsappDeliveryReport="WhatsApp Log.xls";
	public String folderName;
	Reports rep;
	ReportTest()
	{
		initilization();
		rep=new Reports(driver);
		folderName=System.getProperty("user.dir")+"\\Downloads";
	
		
	}
	
	
	
	/** Downloads the Excel file of AdmissionStatusRep and saves it in 
	 * the same project's Downlaods folder */
	@Test
	public void DownloadExcel()
	{
		//1. Admission Status File 
		rep.hoverOnReports();
		rep.hoverOnStudReports();
		rep.clickOnAdmissionStatusRep();
		rep.clickOnExpOpt();
		rep.clickOnExcelDownload();
		Downloads.waitForDownloadToComplete(downloadFilePath,AdStatusRepFileName,TimeUnit.DTime);
		
		//2. StudentFileInfo
		rep.hoverOnReports();
		rep.hoverOnStudReports();
		rep.clickOnStudentInfoReport();
		rep.clickOnExpOpt();
		rep.clickOnExcelDownload();
		Downloads.waitForDownloadToComplete(downloadFilePath,StudentinfoFileName,TimeUnit.DTime);
		
		//3. Admission GR Report
		rep.hoverOnReports();
		rep.hoverOnStudReports();
		rep.clickOnAdmissionGrReport();
		rep.clickOnExpOpt();
		rep.clickOnExcelDownload();
		Downloads.waitForDownloadToComplete(downloadFilePath,AdStatusGrRepFileName,TimeUnit.DTime);
		
		//4. Student Follow up Report
		rep.hoverOnReports();
		rep.hoverOnStudReports();
		rep.clickOnStudentFollowUpReport();
		rep.clickOnExpOpt();
		rep.clickOnExcelDownload();
		Downloads.waitForDownloadToComplete(downloadFilePath,StudentFollowRepFileName,TimeUnit.DTime);
		
		//5. Employee Report
		rep.hoverOnReports();
		rep.hoverOnEmployeReportss();
		rep.clickOnEmpReport();
		rep.clickOnExpOpt();
		rep.clickOnExcelDownload();
		Downloads.waitForDownloadToComplete(downloadFilePath,EmployeesReport,TimeUnit.DTime);
		
		
		//6. recipts  report
				rep.hoverOnReports();
				rep.hoverOnFeeReports();
				rep.clickOnReciptsReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,ReceiptReport,TimeUnit.DTime);
		
		//7.  Receivable report
				rep.hoverOnReports();
				rep.hoverOnFeeReports();
				rep.clickOnRecievableReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,RecievalbeReport,TimeUnit.DTime);
		
		//8.  installement Due Report
				rep.hoverOnReports();
				rep.hoverOnFeeReports();
				rep.clickOnInstallemtDueReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,InstallementDueRep,TimeUnit.DTime);	
	
		//9.  installement Due Report
				rep.hoverOnReports();
				rep.hoverOnFeeReports();
				rep.clickOnFeesReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,FeesReport,TimeUnit.DTime);
		
		//10.  fees Details Report
				rep.hoverOnReports();
				rep.hoverOnFeeReports();
				rep.clickOnFeesDetailsReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,FeesDetailsReport,TimeUnit.DTime);
				
		//11.  Batch Scehduling Report
				rep.hoverOnReports();
                rep.clikOnBatchSchedulingReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,BatchSchedulingReport,TimeUnit.DTime);
	
		/** WhatsApp Delivery report is not visible in chrome only in brave
		//12.  WhatsApp Delivery Report
				rep.hoverOnReports();
			    rep.clikOnWhatsAppDeliveryReport();
				rep.clickOnExpOpt();
				rep.clickOnExcelDownload();
				Downloads.waitForDownloadToComplete(downloadFilePath,WhatsappDeliveryReport,TimeUnit.DTime);
		*/
				
		
	}
	

	
	
	@Test(enabled=false)
	public void deleteDownloadedFile()
	{
		Downloads.deleteDownloadedFile(folderName,"Admission.xls");
	}
	
	
    @Test(enabled=false)
    public void uploadFile()
    {  
    
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.get("https://forms.gle/6iSjvVCSrfV8D3HCA");
    	driver.findElement(By.xpath("//span[contains(text(),'Add File')]")).sendKeys("./Downloads/Admission.xls");
    }
	
	
	
	
	@AfterMethod()
	public void tearDwon()
	{  
		
		
		//add logic if downloading file is taking more time 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	

}
