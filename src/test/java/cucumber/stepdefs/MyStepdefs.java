package cucumber.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pom.pom.Homepage;
import pom.pom.SearchPage;

public class MyStepdefs {
    Homepage homepage;
    SearchPage searchPage;
    @Given("user on homepage")
    public void userOnHomepage() {
        homepage = new Homepage();
        homepage.gotoUrl();
    }

    @When("user search for {string}")
    public void userSearchFor(String searchedText) {
        searchPage = homepage.search(searchedText);
    }

    @Then("listed product count should be {int}")
    public void listedProductCountShouldBe(int num) {
        //searchPage = new SearchPage();
        Assert.assertEquals(searchPage.getProductNumber(), num);
    }
}
