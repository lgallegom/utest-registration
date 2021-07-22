package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.PersonalInformationPage;

import static userinterface.PersonalInformationPage.*;

public class RegistrationPersonalInformation implements Task {

    UtestData utestData;

    public RegistrationPersonalInformation(UtestData utestData) {
        this.utestData = utestData;
    }

    public static RegistrationPersonalInformation with(UtestData utestData) {
        return Tasks.instrumented(RegistrationPersonalInformation.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.getFirstName()).into(INPUT_FIRSTNAME),
                Enter.theValue(utestData.getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(utestData.getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getMonth()).from(MONTH),
                SelectFromOptions.byVisibleText(utestData.getDay()).from(DAY),
                SelectFromOptions.byVisibleText(utestData.getYear()).from(YEAR),
                Enter.theValue(utestData.getLanguage()).into(INPUT_LANG),
                Click.on(BUTTON_ONE)

        );


    }
}
