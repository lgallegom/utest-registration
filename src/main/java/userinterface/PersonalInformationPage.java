package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class PersonalInformationPage extends PageObject {
    public static final Target INPUT_FIRSTNAME = Target.the("Enter the first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Enter the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Enter email").located(By.id("email"));
    public static final Target MONTH = Target.the("Select month").located(By.id("birthMonth"));
    public static final Target DAY = Target.the("Select day").located(By.id("birthDay"));
    public static final Target YEAR = Target.the("Select year").located(By.id("birthYear"));
    public static final Target INPUT_LANG = Target.the("Enter the language").located(By.xpath("//*[@id='languages']/div[1]/input"));
    public static final Target BUTTON_ONE = Target.the("Button to continue").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
