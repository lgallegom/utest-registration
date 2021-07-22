package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class CreatePasswordPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("Enter password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_PSWD = Target.the("Confirm password").located(By.id("confirmPassword"));
    public static final Target CHECK_USE = Target.the("Check to accept use").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_POLICY = Target.the("Check to accept policy").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target LABEL_FINISH = Target.the("Label finish").located(By.xpath("//*[@id='laddaBtn']/span"));

}
