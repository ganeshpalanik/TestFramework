package com.project.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	
private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(linkText="I lost my password")
	private WebElement Lostpassword;
	
	@FindBy(className="dropdown-toggle")
	private WebElement dropdownmenu;
	
	@FindBy(xpath="//*[@id=\'logout_button\']")
	private WebElement logout;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void clicklostpassword() {
		this.Lostpassword.click(); 
	}
	
	public void Logoutmenu() {
		this.dropdownmenu.click(); 
	}
	
	public void Logout() {
		this.logout.click(); 
	}
	

}