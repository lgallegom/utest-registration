package questions;

import cucumber.api.java.bs.A;
import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.CreatePassword;
import userinterface.CreatePasswordPage;

import java.util.List;

import static userinterface.CreatePasswordPage.*;

public class Answer implements Question {

    UtestData utestData;

    public Answer(UtestData utestData) {
        this.utestData = utestData;
    }

    public static Answer toThe(UtestData utestData) {
        return new Answer(utestData);
    }

    @Override
    public Object answeredBy(Actor actor) {
        boolean result;
        String label_finish = Text.of(LABEL_FINISH).viewedBy(actor).asString();
        if(utestData.getStrFinish().equals(label_finish)){
            result= true;

        }
        else{
            result= false;
        }

        return result;
    }
}
