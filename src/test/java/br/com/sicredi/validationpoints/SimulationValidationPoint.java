package br.com.sicredi.validationpoints;

import org.junit.Assert;

public class SimulationValidationPoint {

    private static final String MORE_OPTIONS_MESSAGE = "Veja estas outras opções para você";
    private static final String TOTAL_AMOUNT = "R$ 2.206";

    public SimulationValidationPoint() {
    }

    public void validateMoreOptionsMessage(String message){
        Assert.assertEquals(MORE_OPTIONS_MESSAGE, message);
    }

    public void validateTotalAmount(String totalAmount){
        Assert.assertEquals(totalAmount, TOTAL_AMOUNT);
    }

}
