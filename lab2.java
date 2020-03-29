package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class demo {
	static String[] names = {"3017218053", "3017218054", "3017218055", "3017218056", "3017218057",
			"3017218058", "3017218059", "3017218060", "3017218061", "3017218062",
			"3017218063", "3017218064", "3017218065", "3017218066", "3017218067", 
			"3017218068", "3017218069", "3017218070", "3017218071", "3017218072"};
	static String[] pwds = {"https://gitee.com/chenkuochih/software_test.git",
			"https://gitee.com/roshan0/software_test.git",
			"https://gitee.com/dai88X/software_test.git",
			"https://github.com/Bing-Max/SoftwareTest.git",
			"https://github.com/YumengGuo/SoftwareTesting",
			"https://github.com/howAreYouHkk/SoftwareTestingTechnology",
			"https://github.com/Eternal144/Software-Testing",
			"https://gitee.com/HangxueLiu/softwareTest.git",
			"https://github.com/qq734628996/software-test",
			"https://github.com/cxdzb/software-testing-technology",
			"https://github.com/PathfinderTJU/Softwate_test_homework",
			"https://github.com/Martin12345677/software_testing_technology",
			"https://gitee.com/panliming0418/softwareTestingTechnology.git",
			"https://gitee.com/taytaytaytaylor11/SoftwareTesting",
			"https://gitee.com/surumeng/test3017218067",
			"https://gitee.com/Sunhanyu/SoftwareTestingTec",
			"https://github.com/HaomingSun-1895/Software-Testing-hw.git",
			"https://github.com/Taoboan1999/Taoboan1999",
			"https://github.com/tianzhaotju/software_testing",
			"https://github.com/ZhaomengWang/software_testing"};

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.firefox.marionette", "C:\\Users\\xu\\Downloads\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get("http://103.120.226.190/selenium-demo/git-repo?nsukey=vR4enxrjQBBd%2BQ6yXbr9agMqL3ZgoFRNPmsakLZbtWy9CUpUgZPOLwNy2fHE3S%2BkSQFUTPwIeXprJr%2Buyo3UUAkWwID3N0UWLB9yVRMLMTcApCm9G%2FF1%2B9SnfgZPnaIMePGbgb5uEdjWMmXuhvUSp2OOmwiNweTL%2FatMKWHoauvuF7S9D04Dt0%2B4xuCmuYhaRtHapZGqUsnYvgCA5oxFSg%3D%3D");
        for (int i = 0; i<20; i++) {
        	WebElement nameBox = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[1]/input"));
            WebElement pwdsBox = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[2]/input"));
            WebElement click = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
        	nameBox.sendKeys(names[i]);
        	pwdsBox.sendKeys(pwds[i]);
        	click.click();
        	WebElement code = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[4]/code"));
        	if (code.getText().contains("user number and password don't match!"))
        	{
        		System.out.println(names[i]+" does not match!");
        	}
        }
    }

}