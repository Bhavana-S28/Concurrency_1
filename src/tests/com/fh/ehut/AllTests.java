package tests.com.fh.ehut;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ DataExchangeSimulatorTest.class, LogFileCreatorTest.class })
public class AllTests {

}
