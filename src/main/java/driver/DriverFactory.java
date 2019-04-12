package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


    public static WebDriver createDriver(String nameOfDriver) {
        //Всегда устанавливается путь ко всем драйверам, если версия драйвера поменяется или у двух разработчкиков разные версии хрома будут проблемы
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver73.exe");
        System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");

        if (nameOfDriver.matches(DriverName.Chrome)) {
            return new ChromeDriver();
        }
        if (nameOfDriver.matches(DriverName.FireFox)) {
            return new FirefoxDriver();
        }
        return null;
    }
}
