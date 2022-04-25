package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition2", dryRun = false, monochrome = true, strict = true,
tags = { "@smoke","@sanity"},snippets=SnippetType.CAMELCASE,plugin= {"pretty"})

public class TestRunner {

}