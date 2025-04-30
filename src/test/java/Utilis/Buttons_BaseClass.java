package Utilis;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons_BaseClass {
	static WebDriver driver;
	
	//Function to Initialize the webdriver based on the browser given
	      @SuppressWarnings("deprecation")
		public static WebDriver Launch(String browser, String url) {
		  if(browser.equalsIgnoreCase("chrome")) {
	      driver = new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("edge")) {
		   driver = new EdgeDriver();
		  }
		  else if(browser.equalsIgnoreCase("firefox")) {
		  driver = new FirefoxDriver();
		  }
		  else {
			  System.out.println("Not a correct browser");
		  }
		  driver.get(url);
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
          return driver;
	}
	      
	
	//Function for finding an element
	      public static WebElement findElement(By locator) {

	          return driver.findElement(locator);
	      }
	      
	      
      //Function for clicking an element
	      public static void click(By locator) {
	         
	              //use explicit wait
	              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

	              // Wait for the element to be visible
	              wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	              // Wait for the element to be clickable
	              WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

	              // function to click
	              element.click();
	      }
	      
	      
	    //Function back navigation
	      public static void goback() {
	    	   driver.navigate().back();
	      }
	
	      
	    //Function to find if a button is enabled or disabled
	      public static void enabled(By locator)
	      {
	    	  //use explicit wait
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
	    	  
	    	  //wait for the element to be visible
	    	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    	  
	    	  //check if the element is enabled or disabled
	    	  if (element.isEnabled())
	    	  {
	    		  System.out.println("This button is Enabled");
	    	  }
	    	  else {
	    		  System.out.println("This button is Disabled");
	    	  }
	    	  
	      }
	      
	      
	      //Function to Select an option from the drop down using index number
	      public static void DropdownByIndex(By locator,int index) {
	    	  //use explicit wait
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
	    	  
	    	  //wait for the element to be visible
	    	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    	  
	    	  //Select an element
	    	  Select select = new Select(element);
	    	  select.selectByIndex(index);
	    	  
	      }
	      
	      
	      //Function to Select an option from the drop down using Visible Text
	      public static void DropdownByVisibleText(By locator, String txt) {
	    	//use explicit wait
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
	    	  
	    	  //wait for the element to be visible
	    	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    	  
	    	  ////Select an element
	    	  Select select = new Select(element);
	    	  select.selectByVisibleText(txt);
	      }
	      
	      
	    //Function to Select an option from the drop down using Value
	      public static void DropdownByValue(By locator, String txt) {
	    	//use explicit wait
	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
	    	  
	    	  //wait for the element to be visible
	    	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	    	  
	    	  ////Select an element
	    	  Select select = new Select(element);
	    	  select.selectByValue(txt);
	      }
	      
	      
	      //Function for giving inputs
	      public static void sendKeys(By locator, String txt) {
	         
	              //use explicit wait
	              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

	              // Wait for the element to be visible
	              wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	              // Wait for the element to be clickable
	              WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

	              // function to click
	              element.sendKeys(txt);
	      }
	      
	      
	      //Function to clear text
	      public static void clear(By locator) {
	    	//use explicit wait
              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

              // Wait for the element to be visible
              wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

              // Wait for the element to be clickable
              WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
              
              //clear the textbox
              element.clear();
	      }
              
	      
             //Function to read text from the text box
              public static void read(By locator) {
            	//use explicit wait
                  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));

                  // Wait for the element to be visible
                  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

                  // Wait for the element to be clickable
                  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
                  
                  //get text from the textbox
                  String readtext = element.getAttribute("value");
                  System.out.println(readtext);
              }
              
              
              //Function to move to an element
              public static void toElement(By locator) {
            	  //use explicit wait
            	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
            	  
            	  //Wait for the element to be visible
            	  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            	  
            	  //Wait for the element to be clickable
            	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            	  
            	  //Use Actions class to move to the element
            	  Actions act = new Actions(driver);
            	  act.moveToElement(element);
            	  
              }
	      
              
              //Function to get to an url
              public static void get(String url) {
            	  driver.get(url);
              }
              
              
              //Function to confirm that only one radio button is selected
              public static void confirmRadio(By locator1,By locator2) {
            	  //use explicit wait for radio button 1
            	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
            	  
            	  //Wait for the element to be visible
            	  wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
            	  
            	  //Wait for the element to be clickable
            	  WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(locator1));
            	  
            	  //check if the radio button is selected
            	  Boolean elem1 = element1.isSelected();
            	  
            	  
            	  //use explicit wait for radio button 1
            	  WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(70));
            	  
            	  //Wait for the element to be visible
            	  wait1.until(ExpectedConditions.visibilityOfElementLocated(locator2));
            	  
            	  //Wait for the element to be clickable
            	  WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(locator2));
            	  
            	  //check if the radio button is selected
            	  Boolean elem2 = element2.isSelected();
            	  
            	  
            	  //check if both are selected
            	  if(elem1 && elem2 == true) {
            		  System.out.println("Both are selected, so not good");
            	  }
            	  else {
            		  System.out.println("Only one is selected or none is selected");
            	  }
            	  
            	  
              }
              
              
              //Function to check if a radio button option is disabled
              public static void enabledRadio(By locator) {
            	//use explicit wait
    	    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
    	    	  
    	    	  //wait for the element to be visible
    	    	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    	    	  
    	    	  //check if the radio button is enabled
    	    	  boolean elem = element.isEnabled();
    	    	  if (elem) {
    	    		  System.out.println("The radio button is enabled");
    	    	  }
    	    	  else {
    	    		  System.out.println("The radio button is disabled");
    	    	  }
              }
              
              
              //Function to check if an option is selected (radio or check box)
              public static void isSelected(By locator) {
            	
                	  //use explicit wait for radio button 1
                	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
                	  
                	  //Wait for the element to be visible
                	  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                	  
                	  //Wait for the element to be clickable
                	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
                	  
                	  //check if the radio button is selected
                	  Boolean elem = element.isSelected();
                	  if(elem) {
                		  System.out.println("The checkbox/radio button is selected");
                	  }
                	  else {
                		  System.out.println("The checkbox/radio button is not selected");
                	  }
              }
              
              
              //Function to accept an alert
              public static void acceptAlert() throws InterruptedException {
            	  //Use explicit wait
            	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
            	  
            	  //wait till the alert pops up
            	  wait.until(ExpectedConditions.alertIsPresent());
            	  
            	  //wait
            	  Thread.sleep(3000);

            	  // Switch to the alert
            	  Alert alert = driver.switchTo().alert();

            	  // Accept it
            	  alert.accept();
              }
              
              
              //Function to dismiss an alert
              public static void dismissAlert() throws InterruptedException {
            	  //Use explicit wait
            	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
            	  
            	  //wait till the alert pops up
            	  wait.until(ExpectedConditions.alertIsPresent());
            	  
            	  //wait
            	  Thread.sleep(3000);

            	  // Switch to the alert
            	  Alert alert = driver.switchTo().alert();

            	  // Dismiss it
            	  alert.dismiss();
              }
              
              
              //Function to give an input to an alert and give "OK"
              public static void PromptAlert(String al) throws InterruptedException {
            	  //Use explicit wait
            	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));
            	  
            	  //Wait till the alert pops up
            	  wait.until(ExpectedConditions.alertIsPresent());
            	  
            	  //Wait
            	  Thread.sleep(3000);

            	  //Switch to the alert
            	  Alert alert = driver.switchTo().alert();
            	  
            	  //Enter the prompt
            	  alert.sendKeys(al);
            	  
            	  //Wait
            	  Thread.sleep(3000);
            	  
            	  //Accept it
            	  alert.accept();
              }
              
              
              //Function to switch frames
              public static void switchToFrame(int index) throws InterruptedException {
            	    Thread.sleep(2000);
            	    driver.switchTo().frame(0);
            	}
              
              
             //Function to switch to default content from a frame
              public static void backToDefault() {
            	  driver.switchTo().defaultContent();
              }
              
              
             //Function to get the window title of the page
              public static void getWindowTitle() {
            	  String title = driver.getTitle();
            	  System.out.println("Title of the page: "+title);
              }
              
              
              //Function to close the current window
              public static void close() throws InterruptedException {
            	  Thread.sleep(2000);
            	  driver.close();
              }
              
              
            //Function to close all the windows
              public static void quit() throws InterruptedException {
            	  Thread.sleep(2000);
            	  driver.quit();
              }
              
              
             
              
              
              
}