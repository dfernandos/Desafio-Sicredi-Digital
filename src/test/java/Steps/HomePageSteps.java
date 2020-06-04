package Steps;

import PageObjects.HomePageObject;
import PageObjects.SimulationFormPageObject;
import Utils.SimulationValues;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import sun.dc.DuctusRenderingEngine;

import java.sql.SQLTransactionRollbackException;
import java.util.ArrayList;
import java.util.List;

public class HomePageSteps {

    private WebDriver driver;
    private HomePageObject homePageObject;
    private List<String> errorMessages;

    public HomePageSteps(WebDriver driver) {
        this.driver = driver;
        this.homePageObject = new HomePageObject(driver);
    }

    public SimulationValues createSimulationValues(){
        SimulationValues simulationValues = new SimulationValues("2000", "2000", "100");
        return simulationValues;
    }

    public SimulationValues createSimulationIncorrectValue(){
        SimulationValues simulationValues = new SimulationValues("1900", "1900", "100");
        return simulationValues;
    }


}
