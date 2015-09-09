import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by idjalalov on 9/8/2015.
 */
public class CnnHome extends Base{

    @Test
    public void printHomePage() {
        System.out.print("This is CNN homepage, and web address: ");
        System.out.println(driver.getCurrentUrl());
        System.out.println();

        System.out.println("Today's top stories are:");


        List<WebElement> topStroies = driver.findElements(By.cssSelector(".cd__headline-text"));


        for (WebElement eachStory : topStroies) {

            System.out.println(eachStory.getText());

        }

    }




}
