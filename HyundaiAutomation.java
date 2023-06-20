package TestCases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HyundaiAutomation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zainul Arifin\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://clicktobuy.hyundai.co.in/#/bookACar?modelCode=0Y");
        driver.navigate().refresh();
 
        // Model Drop Down
        Select drpModel = new Select(driver.findElement(By.xpath("//select[@id='inputmodel-01']")));
        drpModel.selectByVisibleText("New Verna");
        System.out.println("Successfully selected Model");

        // Fuel Type Drop Down
        Select drpType = new Select(driver.findElement(By.xpath("//select[@id='inputfuel-01']")));
        drpType.selectByVisibleText("Petrol");
        System.out.println("Successfully selected Fuel Type");

        // Variant Drop Down
        Select drpVariant = new Select(driver.findElement(By.xpath("//select[@id='inputvrnt-01']")));
        drpVariant.selectByVisibleText("VERNA 1.5 MPi MT S");
        System.out.println("Successfully selected Variant");
    
        // Select Exterior
        Select drpExterior = new Select(driver.findElement(By.xpath("//select[@id='inputext-01']")));
        drpExterior.selectByVisibleText("Abyss Black Pearl");
        System.out.println("Successfully selected Exterior color");
    
        // Select Interior
        Select drpInterior = new Select(driver.findElement(By.xpath("//select[@id='inputinter-01']")));
        drpInterior.selectByVisibleText("CREAM BEIGE");
        System.out.println("Successfully selected Interior color");
    
        // Select State
        Select drpState = new Select(driver.findElement(By.xpath("//select[@id='state-01']")));
        drpState.selectByVisibleText("Andaman & Nicobar");
        System.out.println("Successfully selected State");
    
        // Select City
        Select drpCity = new Select(driver.findElement(By.xpath("//select[@id='dealer-city-01']")));
        drpCity.selectByVisibleText("Port Blair");
        System.out.println("Successfully selected City");
    
        Select drpDealerName = new Select(driver.findElement(By.xpath("//select[@id='bookacardelar']")));
        drpDealerName.selectByVisibleText("LMS HYUNDAI-Port Blair-JUNGLIGHAT");
        System.out.println("Successfully selected Dealer name");
    
        List<WebElement> details = driver.findElements(By.xpath("//ul[@class='cont']"));
        for (WebElement option : details) {
            if (option.isDisplayed()) {
                System.out.println("Dealership details: " + option.getText());
            } else {
                System.out.println("Dealership details not showing");
            }
        }
       
        List<WebElement> op = drpDealerName.getOptions();
        int size = op.size();
        if (size > 1) {
            for (int i = 0; i < size; i++) {
                String options = op.get(i).getText();
                drpDealerName.selectByVisibleText(options);
                for (WebElement option : details) {
                    if (option.isDisplayed()) {
                        System.out.println("Dealership details: " + option.getText());
                    } else {
                        System.out.println("Dealership details not showing");
                    }
                }
                if (op.get(i).equals(size - 1)) {
                    System.out.println("break");
                    break;
                }
            }
        }
        
        List<WebElement> cityop = drpCity.getOptions();
        int sizecity = cityop.size();
        if (sizecity > 1) {
            for (int j = 0; j < size; j++) {
                String optionsCity = cityop.get(j).getText();
                drpCity.selectByVisibleText(optionsCity);
                for (WebElement option2 : details) {
                    if (option2.isDisplayed()) {
                        System.out.println("Dealership details: " + option2.getText());
                    } else {
                        System.out.println("Dealership details not showing");
                    }
                }
            }
        }
    }
}
