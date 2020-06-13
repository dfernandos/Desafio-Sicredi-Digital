package br.com.sicredi.validationpoints;

import org.junit.Assert;

import java.util.List;

public class HomePageValidationPoint {

    private static final String ERROR_MESSAGE = "Valor mínimo de 20.00";

    public HomePageValidationPoint() {}

    public void validateErrorMessage(List<String> messages){
        for(String message: messages){
            Assert.assertEquals(message, ERROR_MESSAGE);
        }
    }

}
