package br.com.sicredi.pageObjects;

import br.com.sicredi.frameworks.utils.WaitElementManager;
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

    public WebElement getMoreOptionsMessege(){
        WaitElementManager.visibilityOfElementLocated(driver, By.cssSelector("div.maisOpcoes span"));
        return driver.findElement(By.cssSelector("div.maisOpcoes span"));
    }
}
