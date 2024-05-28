package Excel_Technologies_Ltd.com.Excel_Technologies_Ltd;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

// https://github.com/Tanvir-Tain/Web_Automation

public class Cutting_Edge_Hospital_Management extends BaseDriverEXCL {
	
	static String baseurlsignin  ="https://carepro-training.ihmafrica.com";
	static String csvfile = "E:\\SQA\\selenium revised\\practice\\SSSampleDataset.csv";
	//static String filePath = "E:\\SQA\\selenium revised\\practice\\ssampleDataset.csv";
	@SuppressWarnings("deprecation")
	@Test(priority = 1)

 public void signin() throws InterruptedException{
	
	
	driver.get(baseurlsignin);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 WebElement usernamElement =driver.findElement(By.xpath("//input[@name=\"username\"]"));
	 usernamElement.sendKeys("tester");
	 WebElement passwordElement = driver.findElement(By.xpath("//input[@name=\"password\"]"));
	 passwordElement.sendKeys("tester2023!");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	driver.navigate().forward();
	Thread.sleep(5000);
}
	@Test(priority = 2)
	public void selcetFaculty() throws InterruptedException {
		
		WebElement provincElement =driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/div[1]/select[1]"));
		Select svrSelectprovince = new Select(provincElement);
		svrSelectprovince.selectByIndex(5);
		Thread.sleep(2000);
		
		
		WebElement District =driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/div[2]/select[1]"));
		Select svrSelectDistrict = new Select(District);
		svrSelectDistrict.selectByIndex(5);
		Thread.sleep(2000);
		
		WebElement Facility =driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/div[2]/input[1]"));
		Facility.sendKeys("Dr. Watson Dental Clinic");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Dr. Watson Dental Clinic')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Enter')]")).click();
		Thread.sleep(2000);
		
		
		driver.navigate().forward(); // search or add patients page ;
		Thread.sleep(5000);
	}
	
	@Test(priority = 3)
	public void searchoraddpatients() throws InterruptedException{
		
		driver.findElement(By.xpath("//button[contains(text(),'NRC')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search by NRC']")).sendKeys("111111111");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[2]/form/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Attend to Patient')]")).click();
		Thread.sleep(2000);
		 try {
			 
			 if (driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).isDisplayed())
			 {
				 driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
					driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
					Thread.sleep(2000);

					driver.navigate().forward();  // service-points
					Thread.sleep(2000);
			 }
			 
			 else {
				 driver.navigate().forward();  // service-points
					Thread.sleep(2000);
			}
		 }
		 
		 catch (Exception e) {
			 driver.navigate().forward();  // service-points
				Thread.sleep(2000);
		}
		
		
		
//		//thum button
//		driver.findElement(By.xpath("//button[contains(text(),'Skip')]")).click();
//		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//		Thread.sleep(2000);
//
//		driver.navigate().forward();  // service-points
//		Thread.sleep(2000);
		
		
	}
	
@Test(priority = 4)	
	public void servicepont() throws InterruptedException {
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/div[1]/img[1]")).click();
		driver.navigate().forward();  // vitals
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(4000);
	}
	
@Test(priority = 5)
  public void patientInformation () throws InterruptedException, CsvValidationException, IOException {
	  
	
	Thread.sleep(4000);
	CSVReader reader = new CSVReader(new FileReader(csvfile));
	String[] cell;
	while ((cell=reader.readNext())!=null)
	{
		for (int i=0 ; i<=cell.length ; i++) {
				String weightString  = cell[i+3];
				String HightString  = cell[i+4];
				String TemperatureString  = cell[i+5];
				String SystolicString  = cell[i+6];
				String DiastolictString  = cell[i+7];
				String PulseString  = cell[i+8];
				String RespiratoryRateString  = cell[i+9];
				String OxygenString  = cell[i+10]; 
				
				Thread.sleep(1000);
				WebElement weightElement =driver.findElement(By.xpath("//input[@placeholder='Enter Weight (kg)']"));
				weightElement.clear();
				weightElement.sendKeys(weightString);
				Thread.sleep(1000);
				
				WebElement highElement = driver.findElement(By.xpath("//input[@placeholder='Enter Height (cm)']"));
				highElement.clear();
				highElement.sendKeys(HightString);
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Temperature (c)']")).sendKeys(TemperatureString);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Systolic (mmHg)']")).sendKeys(SystolicString);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Diastolic (mmHg)']")).sendKeys(DiastolictString);
				Thread.sleep(1000);
				
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Pulse Rate (bpm)']")).sendKeys(PulseString);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder='Enter Respiratory Rate (bpm)']")).sendKeys(RespiratoryRateString);
				Thread.sleep(1000);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
				break ;

	
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(2000);
	
	}
	
	
	
}
	

}
