package stepdefination;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationProject {
	
	WebDriver driver;
	
	
	
	
	// Module 1
	
	@Given("Go to user Login page")
	public void go_to_user_Login_page() {
		try {
			System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		catch(Exception ex) {
			System.out.println("Error in Go To User Log in Page Method.");
		}
	}

	@When("Navigate to log in")
	public void navigate_to_log_in() {
		try {
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		}
		catch(Exception ex) {
			System.out.println("Error in Navigate To Log In Method");
		}
		
	}

	@When("Enter {string} and {string}")
	public void enter_and(String username, String password) {
		try {
			WebElement obj = driver.findElement(By.id("login"));
			obj.sendKeys(username);
		
			obj = driver.findElement(By.id("password"));
			obj.sendKeys(password);
		
			obj = driver.findElement(By.xpath("//button[@type='submit']"));
			obj.click();
		}
	catch(Exception ex) {
		System.out.println("Error in Enter Metod.");
	}
	}

	
	@Then("Go to Social Nwtwork")
	public void go_to_Social_Nwtwork() throws InterruptedException {
		try {
			WebElement obj = driver.findElement(By.xpath("//*[contains(text(),'Social network')]"));
			obj.click();
	    
			Thread.sleep(2000);
	    
	    
			obj = driver.findElement(By.xpath("//*[@id='sn-sidebar-collapse']/div/ul/li[4]/a"));
			obj.click();
	    
			Thread.sleep(2000);
	    
			obj = driver.findElement(By.xpath("//textarea[@name='social_wall_new_msg_main']"));
			obj.sendKeys("Whats the day today?");
			Thread.sleep(2000);
	    
			obj = driver.findElement(By.xpath("//button[@type='submit']"));
			obj.click();
	    
			obj = driver.findElement(By.xpath("//textarea[@name='social_wall_new_msg']"));
			obj.sendKeys("Monday is it?");
	    
			obj = driver.findElement(By.xpath("//button[@name='social_wall_new_msg_submit']"));
			obj.click();
	    
	    	
	    	System.out.println("All the test Cases Has been passed");
		}
		catch(Exception ex) {
			System.out.println("Error in Go To Social Network Method.");
		}
	}
	
	
	
	
	
	
	
	//Module 2
	
	
	
	
	
	
	@Given("Go to user Login Page")
	public void go_to_user_Login_Page() {
		try {
			System.setProperty("webdriver.chrome.driver", ".\\lib\\new\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		catch(Exception ex) {
			System.out.println("Error in Go To Login Page Method.");
		}
	}
	

	@When("Navigate to Login")
	public void navigate_to_Login() {
		try {
			driver.get("http://elearningm1.upskills.in/");
			driver.manage().window().maximize();
		}
		catch(Exception ex) {
			System.out.println("Error in Navigate to login Method");
		}
	}

	@Then("Go to My couses")
	public void go_to_My_couses() {
		try {
			WebElement newobj = driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[1]/li[2]/a"));
			newobj.click();
		}
		catch(Exception ex) {
			System.out.println("Error in Go To My Courses Method.");
		}
	}

	@Then("Go to Demo Course")
	public void go_to_Demo_Course() {
		try {
			WebElement newobj = driver.findElement(By.xpath("//*[@id=\"page-content\"]/div/div/div/div/div[2]/h4/a"));
			newobj.click();
		}
		catch(Exception ex) {
			System.out.println("Error in Go To Demo Course Method");
		}
	}

	@Then("Select Chat Option and send the message")
	public void select_Chat_Option_and_send_the_message() {
		try {
			String parenthandle = driver.getWindowHandle();//Save the id of the current window handle called parenthandle
			WebElement newobj = driver.findElement(By.xpath("//img[@id='toolimage_12']"));
			newobj.click();
	    
			Set<String> handles = driver.getWindowHandles();
			for (String handle: handles) {
				if (!handle.equals(parenthandle))
				{
					driver.switchTo().window(handle);
					Thread.sleep(2000);
	    		
					WebElement chat = driver.findElement(By.xpath("//button[@data-name='Wrik Das']"));
					chat.click();
	    		
					chat = driver.findElement(By.xpath("//div[@class='emoji-wysiwyg-editor']"));
					String actual = "Monday";
					chat.sendKeys(actual);
	    		
					chat = driver.findElement(By.xpath("//button[@id='chat-send-message']"));
					chat.click();
	    		
					Thread.sleep(2000);
	    		
				
					chat =driver.findElement(By.xpath("//p[contains(text(),'Monday')]")); 
					String expected = chat.getText(); 
					Assert.assertTrue(actual.contains(expected));  
				 
				}
			}
			System.out.println("All the Test Cases has been Passed.");
		}
		catch(Exception ex) 
		{ 
			System.out.println("Error occured in Select Chat Option Method."); 
		}
	    
	}



}
