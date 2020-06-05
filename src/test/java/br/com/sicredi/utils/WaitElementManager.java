package br.com.sicredi.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElementManager {

    private static final int TIMEOUT_SECONDS = 10;

    public static void visibilityOfElementLocated(WebDriver driver, By by) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT_SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
