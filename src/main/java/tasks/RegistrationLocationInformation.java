package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.LocationInformationPage;

import static userinterface.LocationInformationPage.*;

public class RegistrationLocationInformation implements Task {

    UtestData utestData;

    public RegistrationLocationInformation(UtestData utestData) {
        this.utestData = utestData;
    }

    public static RegistrationLocationInformation with(UtestData utestData) {
        return Tasks.instrumented(RegistrationLocationInformation.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.getCity()).into(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(utestData.getZip()).into(INPUT_ZIP),
                Click.on(SPAN_COUNTRY),
                Enter.theValue(utestData.getCountry()).into(INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY),
                Click.on(BUTTON_TWO)


        );


    }
}
