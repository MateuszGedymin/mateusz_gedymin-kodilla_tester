package tooMuch;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class tooMuch {
    private final Wallet wallet = new Wallet();
    @Given("there is {int} in my wallet")
    public void there_is_in_my_wallet(Integer deposit) {
        wallet.deposit(deposit);
    }
    @When("I withdraw {int}")
    public void i_withdraw(Integer withdraw) {
        wallet.withdraw(withdraw);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        System.out.println("Current balance: " + wallet.getBankContent() + "$");
    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        System.out.println("You doesn't have enough money in your wallet");
    }
}
