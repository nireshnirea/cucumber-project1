package com.steps.java;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("user should load url")
	public void user_should_load_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Subasri\\cucumber\\driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}
	    

	@Given("user should click on add customer")
	public void user_should_click_on_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user should enter the fields")
	public void user_should_enter_the_fields() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.id("fname")).sendKeys("niresh");
		driver.findElement(By.id("lname")).sendKeys("kumar");
		driver.findElement(By.id("email")).sendKeys("nireshbe1992@gmail.com");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("pallikkaranai");
		driver.findElement(By.id("telephoneno")).sendKeys("8015476615");
	    
	}

	@When("user should click on submit button")
	public void user_should_click_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should validate by id")
	public void user_should_validate_by_id() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
				
				
				
				
				
				
				
				
				
				
				
	   
	}



}
