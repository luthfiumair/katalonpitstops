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

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/a_Worklist'))

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PITSTOPS/div_Delete'),10)

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/div_Descope (1)'))

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/Checkbox'))

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/checkbox dalam'))

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/Submit dalam'))

WebUI.setText(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/textJustification'),'EWR 9 Automation Justification')

WebUI.setText(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/textImpact'),'EWR 9 Automation Impact')

WebUI.setText(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/textRisk'),'EWR 9 Automation Risk')

WebUI.setText(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/textAction'),'EWR 9 Automation Action')

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/SPAN_onoff'))

//WebUI.click(findTestObject('Object Repository/Config 9/Config 9/ClickReview'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Config 9/Config 9/Choose Technical Reviewer'),'a89e7c02-2472-4eb5-59e0-08db6e17a52a', true)

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/DeleteTasklist'))

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/Submit(Request2)'))

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/Submit2(Request2)'))
