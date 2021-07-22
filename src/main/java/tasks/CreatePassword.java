package tasks;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CreatePasswordPage;

import static userinterface.CreatePasswordPage.*;

public class CreatePassword implements Task {

    UtestData utestData;

    public CreatePassword(UtestData utestData) {
        this.utestData = utestData;
    }

    public static CreatePassword with(UtestData utestData) {
        return Tasks.instrumented(CreatePassword.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.getPassword()).into(INPUT_CONFIRM_PSWD),
                Click.on(CHECK_USE),
                Click.on(CHECK_POLICY)
       );

    }
}
