package org.stepdefinition2;

import org.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before

	public void bef() {
		System.out.println("Before Scenario");
		launchBrowser();
		loadurl("https://en-gb.facebook.com/");
		winmax();

	}

	@Before(order=2)

	public void befSce2()
	{
		System.out.println("Before Scenario 2");

	}


	@Before(order=3)

	public void befSce3()
	{
		System.out.println("Before Scenario 3");

	}


	@Before(order=1)

	public void befSce1()
	{
		System.out.println("Before Scenario 1");

	}



	@After(order=1)

	public void afterSce1()
	{
		System.out.println("After Scenario1");
	}

	@After(order=3)

	public void afterSce3()
	{
		System.out.println("After Scenario3");
	}

	@After(order=2)

	public void afterSce2()
	{
		System.out.println("After Scenario1");
	}



	@After

	public void aft() {
		System.out.println("After Scenario");
		toQuit();

	}


}
