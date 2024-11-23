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

WebUI.callTestCase(findTestCase('Test Cases/Login/Execution Module Login'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('Test Cases/Login/Change OPUnEvent'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/a_Worklist'))

WebUI.click(findTestObject('Object Repository/Scenario 1/Search Bar')) // Click to focus
WebUI.setText(findTestObject('Object Repository/Scenario 1/Search Bar - Copy'), 'TEST - SC6 - 01')

WebUI.click(findTestObject('Object Repository/Scenario 1/Search Button'))


WebUI.click(findTestObject('Object Repository/Config 9/Config 9/img'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_PITSTOPS/div_Delete'),10)

WebUI.click(findTestObject('Object Repository/Config 3/Request/Add Scope'))


WebUI.click(findTestObject('Object Repository/Config 2/Request/Work'))
WebUI.setText(findTestObject('Object Repository/Config 2/Request/Work'),'Work 1')

WebUI.click(findTestObject('Object Repository/Config 2/Request/Justification'))
WebUI.setText(findTestObject('Object Repository/Config 2/Request/Justification'),'Justification 1')

WebUI.click(findTestObject('Object Repository/Config 2/Request/Impact'))
WebUI.setText(findTestObject('Object Repository/Config 2/Request/Impact'),'Impact 1')

WebUI.scrollToElement(findTestObject('Object Repository/Config 2/Request/Submit'), 10)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Config 3/Request/Submit'))
WebUI.click(findTestObject('Object Repository/Config 3/Request/Submit'))

WebUI.click(findTestObject('Object Repository/Config 2/Request/Yes'))

WebUI.click(findTestObject('Object Repository/Config 2/Request/Yes 2'))