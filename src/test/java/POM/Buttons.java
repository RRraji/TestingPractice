package POM;

import org.openqa.selenium.By;

public class Buttons {

	//Buttons page
	public static By ButtonCard = By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[3]/app-menu/div/footer/a");
	public static By GotoHomeButton = By.xpath("//button[text()='Goto Home']");
	public static By DisabledButton = By.xpath("//*[@id=\"isDisabled\"]");
	
	//Dropdown page
	public static By FruitsDropDown = By.xpath("//*[@id=\"fruits\"]");
	public static By DropDownCard = By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[4]/app-menu/div/footer/a");
    public static By HeroDropDown = By.xpath("//*[@id=\"superheros\"]");
    public static By LanguageDropDown = By.xpath("//*[@id=\"lang\"]");
    
    //Inputs page
    public static By InputsCard = By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[2]/app-menu/div/footer/a");
    public static By FullName = By.xpath("//*[@id=\"fullName\"]");
    public static By Append = By.xpath("//*[@id=\"join\"]");
    public static By Read = By.xpath("//*[@id=\"clearMe\"]");
    
    //Radio buttons and Check Box page
    public static By RadioCard = By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[7]/app-menu/div/footer/a");
    public static By OneOption = By.xpath("//*[@id=\"no\"]");
    public static By Yes1 = By.xpath("//*[@id=\"one\"]");
    public static By No1 = By.xpath("//*[@id=\"two\"]");
    public static By Yes2 = By.xpath("//*[@id=\"nobug\"]");
    public static By No2 = By.xpath("//*[@id=\"bug\"]");
    public static By DisabledRadio = By.xpath("//*[@id=\"maybe\"]");
    public static By CheckBox = By.xpath("/html/body/app-root/app-radio/section/div/div/div[1]/div/div/div[6]/label[2]/input");
    
    //Alert page
    public static By SimpleAlert = By.xpath("//*[@id=\"accept\"]");
    public static By ConfirmAlert = By.xpath("//*[@id=\"confirm\"]");
    public static By PromptAlert = By.xpath("//*[@id=\"prompt\"]");
    public static By ModernAlert = By.xpath("//*[@id=\"modern\"]");
    public static By CloseModernAlert = By.xpath("/html/body/app-root/app-alert/section/div/div/div[1]/div/div/div[5]/button");
    
    //Frame Page
    public static By FirstName = By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input");
    public static By LastName = By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input");
    public static By Email = By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input");
    
    //Windows Page
    public static By MultipleWindows = By.xpath("//*[@id=\"multi\"]");
    
    //Waits Page
    public static By SimpleAlert2 = By.xpath("//*[@id=\"accept\"]");
    
    
    
    
    
    
    
    
    
    
    
}
