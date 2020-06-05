package br.com.sicredi.testCase;

import br.com.sicredi.steps.HomePageSteps;
import br.com.sicredi.steps.SimulationFormSteps;
import br.com.sicredi.frameworks.utils.SimulationValues;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestCaseSimulationUI {

    static WebDriver driver;

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

        //Dado que o usuário está no site de simulação de investimento
        HomePageSteps homePageSteps = new HomePageSteps(driver);

        //E o usuário insere dados  válidos no sistema
        SimulationValues simulationValues = homePageSteps.createSimulationValues();
        homePageSteps.fillSimulationForm(simulationValues);

        //Quando o os dados forem enviados
        SimulationFormSteps simulationFormSteps = homePageSteps.submitSimularButton();

        //Então o usuário acessa o valor do seu investimento
        String totalAmount = simulationFormSteps.getTotalAmount();
        simulationFormSteps.validateTotalAmount(totalAmount);

        //E acessa a tabela de investimento
        String message = simulationFormSteps.getMoreOptionsMessage();
        simulationFormSteps.validateMoreOptionsMessage(message);
    }

    @Test
    public void fillSimulationFormTestIncorrectly(){

        //Dado que o usuário está no site de simulação de investimento
        HomePageSteps homePageSteps = new HomePageSteps(driver);

        //E o usuário insere dados  inválidos no sistema
        SimulationValues simulationValues = homePageSteps.createSimulationIncorrectValue();

        //Quando o sistema validar o campo
        homePageSteps.fillSimulationForm(simulationValues);

        //Então o sistema mostra uma mensagem informando que o valor está incorreto
        List<String> message = homePageSteps.getErrorMessages();
        homePageSteps.validateErrorMessage(message);
    }
}
