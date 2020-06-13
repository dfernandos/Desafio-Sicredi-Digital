package br.com.sicredi.validationpoints;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePageValidationPoint {

    private static String ERROR_MESSAGE = "Valor mínimo de 20.00";

    private WebDriver driver;

    public HomePageValidationPoint() {}

    public void validateErrorMessage(List<String> messages){
        for(String message: messages){
            Assert.assertEquals(message, ERROR_MESSAGE);
        }
    }

}
