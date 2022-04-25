package org.pojo;



import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{

	//1.Default Constructor

	public LoginPojo() {
		PageFactory.initElements(driver	, this);
	}

	//2.Find And Declare WebElements as private

	@CacheLookup
	@FindBys
	({
		@FindBy(xpath = "//input[@id='email']"),
		@FindBy(xpath = "//input[@name='email']")
	})
	private WebElement txtEmail;

	@CacheLookup
	@FindAll ({
		@FindBy(xpath = "//input[@id='pass']"),
		@FindBy(xpath = "//input[@name='pass']")
	})

	private WebElement txtPass;

	@FindBy(name="login")
	private WebElement btnLogin;



	//3.Getters to access other class

	public WebElement getTxtEmail()
	{
		return txtEmail;

	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}

	/*public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}*/

	/*public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}*/

	public WebElement getTxtPass()
	{
		return txtPass;

	}
}

