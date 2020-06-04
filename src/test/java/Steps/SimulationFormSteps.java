package Steps;

import PageObjects.SimulationFormPageObject;
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
}
