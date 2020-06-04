package TestCase;

import PageObjects.HomePageObject;
import PageObjects.SimulationFormPageObject;
import Steps.HomePageSteps;
import Steps.SimulationFormSteps;
import Utils.SimulationValues;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class TestCaseSimulation {

    static WebDriver driver;
    static HomePageObject homePageObject;
    static List<SimulationValues> simulationValuesList = new ArrayList<>();

    @BeforeClass
    public static void beforeClass() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
    }

    @Before
    public void setup() {
        driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
        new WebDriverWait(driver, 15);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void fillSimulationFormTest(){
        HomePageSteps homePageSteps = new HomePageSteps(driver);
        SimulationValues simulationValues = homePageSteps.createSimulationValues();
        homePageSteps.fillSimulationForm(simulationValues);
        SimulationFormSteps simulationFormSteps = homePageSteps.submitSimularButton();
        String totalAmount = simulationFormSteps.getTotalAmount();
        Assert.assertEquals(totalAmount, "R$ 2.206");
    }
}
