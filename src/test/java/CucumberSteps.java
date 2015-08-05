package test.java;

import junit.framework.TestCase;
import main.java.Calc;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CucumberSteps extends TestCase{
//	Calc calc = new Calc();
	String input;
	@Given("^the inputs \"([^\"]*)\"$")
	public void the_inputs(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		input = String.valueOf(Calc.method(arg1));
	}

	@Then("^the result should be \"([^\"]*)\"$")
	public void the_result_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
//	    throw new PendingException();
		assertEquals(arg1, input);
	}

}
