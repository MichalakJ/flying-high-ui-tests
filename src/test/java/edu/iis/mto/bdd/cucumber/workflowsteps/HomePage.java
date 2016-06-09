package edu.iis.mto.bdd.cucumber.workflowsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void open(){
		driver.get("http://localhost:8080/#/welcome");
	}
	
	public String getWelcomeMsg(){
		return driver.findElement(By.id("welcome-message")).getText();
	}
	
}
