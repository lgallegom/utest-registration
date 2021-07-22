package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.UtestPage;

import static userinterface.UtestPage.*;

public class StartRegistration implements Task {
    public static StartRegistration onJoinToday() {
        return Tasks.instrumented(StartRegistration.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_START));

    }
}
