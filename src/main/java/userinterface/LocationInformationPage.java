package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.apache.tools.tar.TarArchiveSparseEntry;
import org.openqa.selenium.By;

public class LocationInformationPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("Enter city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Enter zip").located(By.id("zip"));
    public static final Target SPAN_COUNTRY = Target.the("Enter country").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY = Target.the("Enter country").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_TWO = Target.the("Button to continue").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
