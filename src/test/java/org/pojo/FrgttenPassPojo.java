/**
 *
 */
package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Sowmi
 *
 */
public class FrgttenPassPojo extends BaseClass
{
	//DefaultConstructor

	public FrgttenPassPojo()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement btnFrgtPass;

	public WebElement getBtnFrgtPass() {
		return btnFrgtPass;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement txtSearchBox;

	@FindBy(xpath= "//button[text()='Search']")
	private WebElement btnSearch;


}