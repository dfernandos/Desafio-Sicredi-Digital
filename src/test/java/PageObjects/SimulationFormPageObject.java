package PageObjects;

import Utils.WaitElementManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimulationFormPageObject {

    private WebDriver driver;

    public SimulationFormPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getValorField(){
        WaitElementManager.visibilityOfElementLocated(driver, By.className("valor"));
        return driver.findElement(By.className("valor"));
    }
}
