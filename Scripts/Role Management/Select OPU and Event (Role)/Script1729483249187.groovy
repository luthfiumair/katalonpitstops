import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span_Demo_Role'))

// Wait for the dropdown options to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PITSTOPS/li_PETRONAS Penapisan Terengganu Sdn Bhd'), 10)

// Optionally, mouse over the desired item (if necessary)
WebUI.mouseOver(findTestObject('Object Repository/Page_PITSTOPS/li_PETRONAS Penapisan Terengganu Sdn Bhd'))

// Click on the desired item
WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_PETRONAS Penapisan Terengganu Sdn Bhd'))


// EVENT SELECTION BELOW

// Click on the dropdown to open it
WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span_Assurance M - Role'))


// WfindTestObject('Object Repository/Page_PITSTOPS/span_Assurance M')ait for the dropdown options to become visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PITSTOPS/li_Jump Event'), 10)

// Ensure the item is clickable before trying to mouse over and click
WebUI.mouseOver(findTestObject('Object Repository/Page_PITSTOPS/li_Jump Event'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_Jump Event'))








