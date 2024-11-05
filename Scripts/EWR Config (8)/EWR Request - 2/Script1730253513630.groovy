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
WebUI.delay(2)
WebUI.setText(findTestObject('Config 8/textarea__Justification'), 'Justification Automation 1')

WebUI.click(findTestObject('Object Repository/Config 8/div_Justification Impact Of Not Executing E_35a06e'))

WebUI.setText(findTestObject('Object Repository/Config 8/textarea__Impact'), 'Impact Automation 1')

WebUI.click(findTestObject('Object Repository/Config 8/div_Work Detailing Justification Impact Of _559bb3'))

WebUI.setText(findTestObject('Object Repository/Config 8/textarea__Risk'), 'Risk Automation 1')

WebUI.click(findTestObject('Object Repository/Config 8/div_Justification Impact Of Not Executing E_35a06e'))

WebUI.setText(findTestObject('Object Repository/Config 8/textarea__Mitigation'), 'Mitigation Automation 1')

WebUI.click(findTestObject('Object Repository/Config 8/span_ONOFF'))

WebUI.click(findTestObject('Object Repository/Config 8/span_ONOFF'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Config 8/select_Technical Reviewer'), 
    'a89e7c02-2472-4eb5-59e0-08db6e17a52a', true)

WebUI.click(findTestObject('Object Repository/Config 8/input_Reason 2 Delete'))

WebUI.click(findTestObject('Object Repository/Config 8/button_Submit'))

WebUI.click(findTestObject('Object Repository/Config 8/button_Yes'))

WebUI.click(findTestObject('Object Repository/Config 8/button_Okay'))

