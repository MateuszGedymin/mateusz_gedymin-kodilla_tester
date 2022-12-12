package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer int1) {
        wallet.deposit(int1);
    }
    @When("I request {int}")
    public void i_request(Integer int1) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, int1);
    }
    @Then("{int} should be dispensed")
    public void should_be_dispensed(Integer int1) {
        Assert.assertEquals((int) int1, cashSlot.getContents());
    }

}