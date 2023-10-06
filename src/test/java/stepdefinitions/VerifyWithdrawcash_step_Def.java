package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyWithdrawcash_step_Def {

	@Given("I have a balance of {int} in my account")
	public void i_have_a_balance_of_in_my_account(Integer int1) {
		System.out.println("I have a balance of $100 in my account");
	    
	}

	@When("I request {int}")
	public void i_request(Integer int1) {
		System.out.println("I request $20");
	    
	}

	@Then("{int} should be dispensed")
	public void should_be_dispensed(Integer int1) {
		System.out.println("$20 should be dispensed");
	    
	}



	
}
