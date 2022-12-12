package seasonchecker.homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzz implements En {

    private String answer;
    private int number;

    public FizzBuzz() {
        Given("I get a 1", () -> {
            this.number = 1;
        });
        Given("I get a 2", () -> {
            this.number = 2;
        });
        Given("I get a 3", () -> {
            this.number = 3;
        });
        Given("I get a 4", () -> {
            this.number = 4;
        });
        Given("I get a 5", () -> {
            this.number = 5;
        });
        Given("I get a 6", () -> {
            this.number = 6;
        });
        Given("I get a 7", () -> {
            this.number = 7;
        });
        Given("I get a 15", () -> {
            this.number = 15;
        });



        When("I check if its dividable by 3 or 5", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkIfDivided(this.number);
        });

        Then("I return {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}
