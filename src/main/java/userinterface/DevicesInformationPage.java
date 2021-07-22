package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class DevicesInformationPage extends PageObject {

    public static final Target SPAN_COMPUTER = Target.the("Select computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_COMPUTER = Target.the("Enter computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SPAN_VERSION = Target.the("Select version of computer").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_VERSION = Target.the("Enter version of computer").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SPAN_LANG_COM = Target.the("Select language").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_LANG_COM = Target.the("Enter language").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target SPAN_MOBILE = Target.the("Select mobile").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE = Target.the("Enter mobile").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SPAN_MODEL = Target.the("Select model").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MODEL = Target.the("Enter model").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SPAN_MOBILE_OS = Target.the("Select os").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_OS = Target.the("Enter os").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_THREE = Target.the("Button to continue").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
