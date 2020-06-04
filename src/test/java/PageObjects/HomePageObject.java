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

    public SimulationFormPageObject getSimularButton(){
        WaitElementManager.visibilityOfElementLocated(driver, By.className("simular"));
        driver.findElement(By.className("simular")).submit();
        return new SimulationFormPageObject(driver);
    }

    public WebElement getValorAplicarErro(){
        WaitElementManager.visibilityOfElementLocated(driver, By.id("valorAplicar-error"));
        return driver.findElement(By.id("valorAplicar-error"));
    }

    public WebElement getvalorInvestirErro(){
        WaitElementManager.visibilityOfElementLocated(driver, By.id("valorInvestir-error"));
        return driver.findElement(By.id("valorInvestir-error"));
    }
}
