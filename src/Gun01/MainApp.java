package Gun01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainApp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = new EdgeDriver();
        WebDriver driver2 = new SafariDriver();
        driver.get("https://www.techno.study/");
        //driver1.get("https://www.techno.study/");
        driver2.get("https://www.techno.study/");

    }
}
