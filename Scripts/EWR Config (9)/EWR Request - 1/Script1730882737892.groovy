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

WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/a_Worklist'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Skip'))

//WebUI.click(findTestObject('Object Repository/Config 9/Config 9/worklist card'))
//
//WebUI.click(findTestObject('Object Repository/Config 9/Config 9/div_Descope'))
WebUI.click(findTestObject('Object Repository/Config 9/Config 9/div_Text area'))

WebUI.setText(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/Page_PITSTOPS/input_Post Execution_k-11b47442-f5c5-4f53-ba3b-74300062dfe1'), 
    'TEST - SC6 - 02')

WebUI.click(findTestObject('Object Repository/Config 9/Config 9/Page_PITSTOPS/button_Search'))

