package PageObjects;

import Utils.WaitElementManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAplicarValorField(){
        WaitElementManager.visibilityOfElementLocated(driver, By.id("valorAplicar"));
        return driver.findElement(By.id("valorAplicar"));
    }

    public WebElement getvalorInvestirField(){
        WaitElementManager.visibilityOfElementLocated(driver, By.id("valorInvestir"));
        return driver.findElement(By.id("valorInvestir"));
    }

    public WebElement getTempoField(){
        WaitElementManager.visibilityOfElementLocated(driver, By.id("tempo"));
        return driver.findElement(By.id("tempo"));
    }

    public WebElement getSimularButton(){
        WaitElementManager.visibilityOfElementLocated(driver, By.className("btn btnAmarelo btnSimular"));
        return driver.findElement(By.className("btn btnAmarelo btnSimular"));
    }


}
