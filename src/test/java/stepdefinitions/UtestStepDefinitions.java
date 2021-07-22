package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than Laura wants to register at utest website$")
    public void thanLauraWantsToRegisterAtUtestWebsite(){
        theActorCalled("Laura").wasAbleTo(OpenUp.thePage());
    }

    @When("^she complete the data at form$")
    public void sheCompleteTheDataAtForm(List<UtestData> utestData){
        theActorInTheSpotlight().attemptsTo(StartRegistration.onJoinToday(),
                RegistrationPersonalInformation.with(utestData.get(0)),
                RegistrationLocationInformation.with(utestData.get(0)),
                RegistrationDevicesInformation.with(utestData.get(0)),
                CreatePassword.with(utestData.get(0))
        );

    }

    @Then("^she see a finish message$")
    public void sheSeeAFinishMessage(List<UtestData> utestData){
        theActorInTheSpotlight().should(seeThat(Answer.toThe(utestData.get(0))));


    }
}
