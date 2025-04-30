package MainFlow;
import org.testng.annotations.Test;

import Utilis.Buttons_BaseClass;

public class Buttons_MainFlow extends Buttons_BaseClass{
	
		@Test
	    //Launch and set up the browser
		public static void buttons() throws InterruptedException {
		Launch("Chrome","https://letcode.in/test");
		
		//Locate & Click on the Buttons card
		click(POM.Buttons.ButtonCard);
		
		Thread.sleep(5000);
		//Click on the Goto home button and wait 
		click(POM.Buttons.GotoHomeButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//To navigate back
		goback();
		
		//to check if a button is enabled or disabled
		enabled(POM.Buttons.DisabledButton);
		
		//navigate to dropdown page
		goback();
		click(POM.Buttons.DropDownCard);
		
	    //Select a fruit from the Fruits dropdown
		DropdownByIndex(POM.Buttons.FruitsDropDown,1);
		
		//Select a super hero from the Super hero dropdown
		DropdownByVisibleText(POM.Buttons.HeroDropDown,"Batwoman");
		
		//Select a language from the language dropdown
		DropdownByValue(POM.Buttons.LanguageDropDown,"swift");
		
		//navigate to inputs page
		goback();
		click(POM.Buttons.InputsCard);
		
		//enter fullname
		sendKeys(POM.Buttons.FullName,"Raja Madanki Paramasivam");
		
		//append text
		sendKeys(POM.Buttons.Append,". How are you?");
		
		//Clear the txt in Fullname
		clear(POM.Buttons.FullName);
		
		//read text from the text box
		read(POM.Buttons.Read);
		 
		//navigate to the Radio button and check box page
		get("https://letcode.in/radio");
		
		//select only one option in the 1st radio button set
		click(POM.Buttons.OneOption);
		
		//click 2 options in the 2nd radio button set
		click(POM.Buttons.Yes1);
		click(POM.Buttons.No1);
		
		//confirm only one radio button is selected
		confirmRadio(POM.Buttons.Yes1, POM.Buttons.No1 );
		
		//click 2 options in the 2nd radio button set
		click(POM.Buttons.Yes2);
		click(POM.Buttons.No2);
		
		//confirm only one radio button is selected 2
		confirmRadio(POM.Buttons.Yes2, POM.Buttons.No2);
		
		//check if the radio button is disabled
		enabledRadio(POM.Buttons.DisabledRadio);
		
		//check if the checkbox is selected
		isSelected(POM.Buttons.CheckBox);
		
		//navigate to the alert page
		goback();
		get("https://letcode.in/alert");
		
		//click on the Simple Alert button to trigger an alert
		click(POM.Buttons.SimpleAlert);
		
		//Accept the accept
		acceptAlert();

		//click on the Confirm Alert button to trigger an alert
		click(POM.Buttons.ConfirmAlert);
		
		//Dismiss the Confirm Alert
		dismissAlert();
		
		//click on the Prompt Alert button to trigger an alert
		click(POM.Buttons.PromptAlert);
		
		//Enter a prompt and accept an alert
		PromptAlert("Raji");
		
		//click on the Modern Alert button to trigger an alert and close it
		//click(POM.Buttons.ModernAlert);
		//Thread.sleep(3000);
		//click(POM.Buttons.CloseModernAlert);
		
		//Navigate to the Frames page
		get("https://letcode.in/frame");
		
		//Switch to the frame and enter details
		switchToFrame(0);
		sendKeys(POM.Buttons.FirstName,"Raji");
		sendKeys(POM.Buttons.LastName,"Raji");
		
		//Switch to the inner frame and enter details
		switchToFrame(0);
		sendKeys(POM.Buttons.Email,"hello@gmail.com");
		
		//Switch back to the default content
		backToDefault();
		
		//Navigate to the Window page
		get("https://letcode.in/window");
		
		//Get the title of the page
		getWindowTitle();
		
		//click on the multiple windows button
		click(POM.Buttons.MultipleWindows);
		
		//close the current window
		//close();
		//close();
		
		
		//go to the Waits page
		get("https://letcode.in/waits");
		
		//click on the simple alert button to trigger the alert
		click(POM.Buttons.SimpleAlert2);
		
		//Accept the alert
		acceptAlert();
		
		//close all the windows
		quit();
		
		
		
		
		
		
		
		}
}
