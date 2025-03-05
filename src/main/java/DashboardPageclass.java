import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageclass {

    WebDriver d;
    public DashboardPageclass(WebDriver driver)
    {
        d=driver;
        PageFactory.initElements(d, this);
    }

    public String getPageTitle()
    {
        return(d.getTitle());
    }

}

