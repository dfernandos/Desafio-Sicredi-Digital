package br.com.sicredi.suites;

import br.com.sicredi.testCase.TestCaseSimulationServico;
import br.com.sicredi.testCase.TestCaseSimulationUI;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

        TestCaseSimulationServico.class,
        TestCaseSimulationUI.class
})
public class AllTests {

}
