package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multiscenario {
	

@Given("refund of any faulty item as per the guidelines")
public void refund_of_any_faulty_item_as_per_the_guidelines() {
	
	System.out.println("am in refund");
   
}

@Given("Jeff has brought microwave for {int}")
public void jeff_has_brought_microwave_for(Integer int1) {
	System.out.println("cost of microwave is " );
  
}

@Given("Jeff has the reciept")
public void jeff_has_the_reciept() {
	
	System.out.println("jeff has reciept " );
	
    
}

@When("Jeff returns the faulty item")
public void jeff_returns_the_faulty_item() {
	
	System.out.println("jeff returned item" );
	
    
}

@Then("Jeff got the refund of {int}")
public void jeff_got_the_refund_of(Integer int1) {
	
	System.out.println("jeff got refund of item" );
   
}

}
