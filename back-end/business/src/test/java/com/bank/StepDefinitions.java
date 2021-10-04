package com.bank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class StepDefinitions {

    private int element;
    private int result;

    @Given("the number {}")
    public void initElement(int element) {
        this.element = element;
    }

    @When("this number is multiplied by {}")
    public void doMultiply(int mult) {
        this.result = element * mult;
    }

    @When("the result should be {}")
    public void checkResult(int expectedResult) {
        Assertions.assertThat(this.result).isEqualTo(expectedResult);
    }

}
