package TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class MobileAppTask {
	public static void main(String[] args) throws Exception {
        // Set the desired capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6a");
        caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\Zainul Arifin\\OneDrive\\Documents\\APK\\Flipkart.apk"); // Replace with the actual APK file path
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

         URL serverUrl = new URL("http://localhost:4723/wd/hub");

        // Initialize the driver
        AppiumDriver<MobileElement> driver = new AndroidDriver<>(serverUrl, caps);

        MobileElement loginButton = driver.findElement(MobileBy.AccessibilityId("login"));
        loginButton.click();

        MobileElement product = driver.findElement(MobileBy.AccessibilityId("acer-Monitor"));
        product.click();

        MobileElement addToCartButton = driver.findElement(MobileBy.AccessibilityId("addToCartButton"));
        addToCartButton.click();

        MobileElement cartButton = driver.findElement(MobileBy.AccessibilityId("cartButton"));
        cartButton.click();

        driver.quit();
    }
}

