package balance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tooMuch.Wallet;

public class balance {
    private final Wallet wallet = new Wallet();

    @Given("There is {int} in my wallet")
    public void there_is_in_my_wallet(Integer saldo) {
        wallet.deposit(saldo);
        Assert.assertEquals("Error", (int) saldo, wallet.getBankContent());
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        wallet.getBankContent();
    }

    @Then("I should see that the balance is {int}")
    public void i_should_see_that_the_balance_is(Integer int1) {
        System.out.println("Current balance: " + wallet.getBankContent() + "$");
    }
}
