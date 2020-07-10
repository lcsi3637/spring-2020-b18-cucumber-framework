package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class GoogleStepDefinitions {


    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
        //Assert.fail("Unpurpose failing here!!!!!!!!");

        Driver.getDriver().get("https://www.google.com");


    }


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";



        //Both assertions is not needed. Just for the example's sake.
        Assert.assertTrue("Actual title does not match expected title!",actualTitle.equals(expectedTitle));
        Assert.assertEquals("Actual title does not match expected title!", actualTitle, expectedTitle);

    }
}
