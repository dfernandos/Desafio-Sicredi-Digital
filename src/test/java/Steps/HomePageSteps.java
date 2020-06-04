package Steps;

import PageObjects.HomePageObject;
import PageObjects.SimulationFormPageObject;
import Utils.SimulationValues;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

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

    public void fillSimulationForm(SimulationValues simulationValues){

        if(validateValues(simulationValues)){
            homePageObject.getAplicarValorField().sendKeys(simulationValues.getValorAplicar());
            homePageObject.getvalorInvestirField().sendKeys(simulationValues.getValorInvestir());
            homePageObject.getTempoField().sendKeys(simulationValues.getTempo());
        }
        else{
            homePageObject.getAplicarValorField().sendKeys(simulationValues.getValorAplicar());
            homePageObject.getvalorInvestirField().sendKeys(simulationValues.getValorInvestir());
            homePageObject.getTempoField().sendKeys(simulationValues.getTempo());
            setErrorMessage();
        }
    }

    public SimulationFormSteps submitSimularButton(){
        SimulationFormPageObject simulationFormPageObject = homePageObject.getSimularButton();
        return new SimulationFormSteps(driver, simulationFormPageObject);
    }

    public void setErrorMessage(){
        String valorAplicarErro  = homePageObject.getValorAplicarErro().getText();
        String valorInvestirErro = homePageObject.getvalorInvestirErro().getText();
        List<String> errorMessages = new ArrayList<>();
        errorMessages.add(valorAplicarErro);
        errorMessages.add(valorInvestirErro);

        this.errorMessages = errorMessages;
    }

    public List<String> getErrorMessages(){
        return this.errorMessages;
    }

    public void validateErrorMessage(List<String> messages){
        for(String message: messages){
            Assert.assertEquals(message, "Valor mínimo de 20.00");
        }
    }

    public boolean validateValues(SimulationValues simulationValues){
        return Integer.parseInt(simulationValues.getValorAplicar())>=2000 &&
                Integer.parseInt(simulationValues.getValorInvestir())>=2000;
    }

}
