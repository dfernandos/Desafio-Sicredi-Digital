package Steps;

import PageObjects.SimulationFormPageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SimulationFormSteps {

    private WebDriver driver;
    private SimulationFormPageObject simulationFormPageObject;

    public SimulationFormSteps(WebDriver driver, SimulationFormPageObject simulationFormPageObject) {
        this.driver = driver;
        this.simulationFormPageObject = simulationFormPageObject;
    }

    public String getTotalAmount(){
        return simulationFormPageObject.getValorField().getText();
    }

    public String getMoreOptionsMessage(){
        return simulationFormPageObject.getMoreOptionsMessege().getText();
    }

    public void validateMoreOptionsMessage(String message){
        Assert.assertEquals("Veja estas outras opções para você", message);
    }
}
