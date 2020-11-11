package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class featureTest1 {


@Given("^you have a cucumber script ready$")
public void you_have_a_cucumber_script_ready() throws Throwable {
   System.out.println("Our script is ready to run");
}

@When("^we execute step one, make sure it runs ok$")
public void we_execute_step_one_make_sure_it_runs_ok() throws Throwable {
	System.out.println("Executed step 1");
}

@Then("^we move on to step three$")
public void we_move_on_to_step_three() throws Throwable {
	System.out.println("Step 1 finished ok! Move on to step 3");
}

@When("^we execute step three, make sure it runs ok$")
public void we_execute_step_three_make_sure_it_runs_ok() throws Throwable {
	System.out.println("Step 3 executed! Move on to step 4");
}

@And("^we execute step four, make sure that runs ok$")
public void we_execute_step_four_make_sure_that_runs_ok() throws Throwable {
	System.out.println("Step 4 executed! Move on to step 5");
}

@And("^we execute step five, make sure that runs ok$")
public void we_execute_step_five_make_sure_that_runs_ok() throws Throwable {
	System.out.println("Step 5 executed! Finish the test");
}

@Then("^our test has completed successfully$")
public void our_test_has_completed_successfully() throws Throwable {
	System.out.println("All steps finished ok! End the test");
}

}
