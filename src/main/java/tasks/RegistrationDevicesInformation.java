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
import userinterface.DevicesInformationPage;

import static userinterface.DevicesInformationPage.*;

public class RegistrationDevicesInformation implements Task {

    UtestData utestData;

    public RegistrationDevicesInformation(UtestData utestData) {
        this.utestData = utestData;
    }

    public static RegistrationDevicesInformation with(UtestData utestData) {
        return Tasks.instrumented(RegistrationDevicesInformation.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SPAN_COMPUTER),
                Enter.theValue(utestData.getComputer()).into(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).into(INPUT_COMPUTER),
                Click.on(SPAN_VERSION),
                Enter.theValue(utestData.getVersion()).into(INPUT_VERSION),
                Hit.the(Keys.ENTER).into(INPUT_VERSION),
                Click.on(SPAN_LANG_COM),
                Enter.theValue(utestData.getLanguageCom()).into(INPUT_LANG_COM),
                Hit.the(Keys.ENTER).into(INPUT_LANG_COM),
                Click.on(SPAN_MOBILE),
                Enter.theValue(utestData.getMobile()).into(INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE),
                Click.on(SPAN_MODEL),
                Enter.theValue(utestData.getModel()).into(INPUT_MODEL),
                Hit.the(Keys.ENTER).into(INPUT_MODEL),
                Click.on(SPAN_MOBILE_OS),
                Enter.theValue(utestData.getMobileOS()).into(INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_OS),
                Click.on(BUTTON_THREE)


        );

    }
}
