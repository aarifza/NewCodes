package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HyundaiScenario {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Zainul Arifin\\Downloads\\chromedriver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        driver.get("https://clicktobuy.hyundai.co.in/#/bookACar");
	        driver.navigate().refresh();
	     
	        WebElement bookAcar = driver.findElement(By.xpath("//div/strong[contains(text(),'BOOK A CAR')]"));
	        if(bookAcar.isDisplayed()) {
	        	System.out.println("Page successfully navigated to the booking screen");
	        }else {
	        	System.out.println("Page not navigated!!");
	        }
	      
	            Select drpModel = new Select(driver.findElement(By.xpath("//select[@id='inputmodel-01']")));
	            drpModel.selectByVisibleText("AURA");
	            System.out.println("Successfully selected Model");
	      
	            Select drpType = new Select(driver.findElement(By.xpath("//select[@id='inputfuel-01']")));
	            drpType.selectByVisibleText("Petrol");
	            System.out.println("Successfully selected Fuel Type");
	        
	              
	            Select drpVariant = new Select(driver.findElement(By.xpath("//select[@id='inputvrnt-01']")));
	            drpVariant.selectByVisibleText("AURA 1.2MT Kappa E");
	            System.out.println("Successfully selected Variant");
	        
	          
	            Select drpExterior = new Select(driver.findElement(By.xpath("//select[@id='inputext-01']")));
	            drpExterior.selectByVisibleText("Atlas White");
	            System.out.println("Successfully selected Exterior color");
	        
	            Select drpInterior = new Select(driver.findElement(By.xpath("//select[@id='inputinter-01']")));
	            drpInterior.selectByVisibleText("FOSSIL GRAY");
	            System.out.println("Successfully selected Interior color");
	        
	            Select drpState = new Select(driver.findElement(By.xpath("//select[@id='state-01']")));
	            drpState.selectByVisibleText("Andhra Pradesh");
	            System.out.println("Successfully selected State");
	        
	            Select drpCity = new Select(driver.findElement(By.xpath("//select[@id='dealer-city-01']")));
	            drpCity.selectByVisibleText("Anakapalli");
	            System.out.println("Successfully selected City");
	        
	            Select drpDealerName = new Select(driver.findElement(By.xpath("//select[@id='bookacardelar']")));
	            drpDealerName.selectByVisibleText("LAKSHMI(ANAKAPALLI)-12-4-77/1,Pudimadaka road-Opp. visakha dairy zonal office");
	            System.out.println("Successfully selected Dealer name");
	        
	            List<WebElement> details = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option : details) {
	            	if(option.isDisplayed()) {
	            	System.out.println("Dealership details : " +option.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            Select drpCity2 = new Select(driver.findElement(By.xpath("//select[@id='dealer-city-01']")));
	            drpCity2.selectByVisibleText("Anantpur");
	            System.out.println("Successfully selected City");
	            
	            for(WebElement option : details) {
	            if(option.isDisplayed()) {
	            	System.out.println("Successfully got the text : " +option.getText());
	            }else {
	            	System.out.println("Details not displayed");
	            	
	            }
	            }
	            //City : Bhimavaram
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Andhra Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Bhimavaram");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("KUSALAVA HYUNDAI,BHIMAVARAM-UNDI ROAD,WEST GODAWARI- 54/3A, PEDA AMIRAM");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details3 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option3 : details3) {
	            	if(option3.isDisplayed()) {
	            	System.out.println("Dealership details : " +option3.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            
	          //City : Chirala
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Andhra Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Chirala");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("SRI CHAKRA HYUNDAI-SANTHI THREATRE ROAD-SADANADARAO CAMPUS");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details4 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option4 : details4) {
	            	if(option4.isDisplayed()) {
	            	System.out.println("Dealership details : " +option4.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            
	          //City : Chitoor
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Andhra Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Chittoor");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("R K HYUNDAI-SURVEY NOS.98/2,97/3,97/4 THIMMASAMUDRAM-R K HYUNDAI");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details5 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option5 : details5) {
	            	if(option5.isDisplayed()) {
	            	System.out.println("Dealership details : " +option5.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            
	          //City : Eluru
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Andhra Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Eluru");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("KUSALAVA(ELURU)--OPP USHA TOWERS");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details6 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option6 : details6) {
	            	if(option6.isDisplayed()) {
	            	System.out.println("Dealership details : " +option6.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            
	                 
	          //City : Guntur
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Andhra Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Guntur");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("KUSALAVA GUNTUR- Phase 1&2, Autonagar- Plot No. 558,");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details7 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option7 : details7) {
	            	if(option7.isDisplayed()) {
	            	System.out.println("Dealership details : " +option7.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	     
	            //Change state : Arunachal Pradesh
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Arunachal Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Itanagar");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("NENI HYUNDAI-NH-52A, CHANDAN NAGAR-PO RK MISSION");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details8 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option8 : details8) {
	            	if(option8.isDisplayed()) {
	            	System.out.println("Dealership details : " +option8.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city : Pasighat
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Arunachal Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Pasighat");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("Neni Motors-NH 52, Gumin Nagar-Opposite D.E.I.T.");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details9 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option9 : details9) {
	            	if(option9.isDisplayed()) {
	            	System.out.println("Dealership details : " +option9.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            
	          //city : Roing
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Arunachal Pradesh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Roing");
	            System.out.println("Successfully selected City");
	            
	          //Change state : Assam
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Assam");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Baihata Chariali");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("SARAIGHAT HYUNDAI--N H 31 BAIHATA CHARIALI");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details10 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option10 : details10) {
	            	if(option10.isDisplayed()) {
	            	System.out.println("Dealership details : " +option10.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city : Barpera
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Assam");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Barpera");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("MUKESH(BARPETA)--SUNDARIDIA KALAYAHATI");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details11 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option11 : details11) {
	            	if(option11.isDisplayed()) {
	            	System.out.println("Dealership details : " +option11.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city : Barpera
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Assam");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Barpeta");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("MEGHNA HYUNDAI-SIMLAGURI-GOBINDAPUR, 10 MILE");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details12 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option12 : details12) {
	            	if(option12.isDisplayed()) {
	            	System.out.println("Dealership details : " +option12.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city :  Bijoynagar
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Assam");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Bijoynagar");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("MUKESH(BIJOYNAGAR)--UPARHALI, OPP. UPARHALI FOREST GATE");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details13 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option13 : details13) {
	            	if(option13.isDisplayed()) {
	            	System.out.println("Dealership details : " +option13.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
		          //city :   Biswanath Chariali
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Assam");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Biswanath Chariali");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("KRISHNA (BISWANATH CHARIALI)--NH-15");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details14 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option14 : details14) {
	            	if(option14.isDisplayed()) {
	            	System.out.println("Dealership details : " +option14.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //Change state : Bihar
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Bihar");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Begusarai");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("BINAY HYUNDAI-PO - MAHNA-PARTNER NISHANT KUMAR, AT - PAPRAUR");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details15 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option15 : details15) {
	            	if(option15.isDisplayed()) {
	            	System.out.println("Dealership details : " +option15.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city :   Bettiah
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Bihar");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Bettiah");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("BALAJI(BETTIAH)-BETTIAH-SUPRIYA CINEMA ROAD");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details16 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option16 : details16) {
	            	if(option16.isDisplayed()) {
	            	System.out.println("Dealership details : " +option16.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city :    Bhagalpur
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Bihar");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Bhagalpur");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("LAGOON HYUNDAI-Rani Talab- NH-80,Sabour Road,");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details17 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option17 : details17) {
	            	if(option17.isDisplayed()) {
	            	System.out.println("Dealership details : " +option17.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	          //city :  Biharsharif
	            drpState.selectByVisibleText("Andaman & Nicobar");
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Bihar");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Biharsharif");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("BINAY HYUNDAI-NH-28 ASHA NAGAR BIHARSHARIF-NH-28 ASHA NAGAR BIHARSHARIF");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details18 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option18 : details18) {
	            	if(option18.isDisplayed()) {
	            	System.out.println("Dealership details : " +option18.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            
	          //Change state : Chandigarh
	            Thread.sleep(3000);
	            drpState.selectByVisibleText("Chandigarh");
	            System.out.println("Successfully selected State");
	     
	            Thread.sleep(3000);
	            drpCity.selectByVisibleText("Chandigarh");
	            System.out.println("Successfully selected City");
	        
	            drpDealerName.selectByVisibleText("BERKELEY HYUNDAI-PLOT NO.27,INDUSTRIAL AREA,PHASE-1-BERKELEY HYUNDAI");
	            System.out.println("Successfully selected Dealer name");
	            Thread.sleep(3000);
	            List<WebElement> details19 = driver.findElements(By.xpath("//ul[@class='cont']"));
	            for(WebElement option19 : details19) {
	            	if(option19.isDisplayed()) {
	            	System.out.println("Dealership details : " +option19.getText());
	            }else {
	            System.out.println("Dealership details not showing");	
	            }
	            }
	            driver.close();
	}

}
