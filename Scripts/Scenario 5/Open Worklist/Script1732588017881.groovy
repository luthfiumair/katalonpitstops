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


WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/a_Worklist'))
WebUI.click(findTestObject('Object Repository/Scenario 1/Search Bar')) // Click to focus
WebUI.setText(findTestObject('Object Repository/Scenario 1/Search Bar - Copy'), 'TEST - SC5 - 02')
WebUI.click(findTestObject('Object Repository/Scenario 1/Search Button'))

WebUI.click(findTestObject('Object Repository/Scenario 1/Show tasklist'))
WebUI.setText(findTestObject('Object Repository/Scenario 1/INPUT SEARCH'),'Inspection as per SOE/IRP')
WebUI.sendKeys(findTestObject('Object Repository/Scenario 1/INPUT SEARCH'), Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Scenario 1/Open tasklist'))