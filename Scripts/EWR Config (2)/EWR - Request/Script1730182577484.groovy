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

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/a_EWR'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Add Resources'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span__Location'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_gttt'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span__Location1'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_GHH'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span__02ec40da-9caa-40a5-bfc8-8ad3c06ea692'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_Maintenance'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span__84ef8b56-3751-4740-8193-4d9e2703f9cd'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_Static (1)'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/input__checkbox k-checkbox k-checkbox-md k-_8e0ad3'))

WebUI.setText(findTestObject('Object Repository/Page_PITSTOPS/textarea__form-control custom-input textbox_7cb806'), 'Resources 1')

WebUI.setText(findTestObject('Object Repository/Page_PITSTOPS/textarea__form-control custom-input ng-unto_51356f'), 'Work 1')

WebUI.setText(findTestObject('Object Repository/Page_PITSTOPS/textarea__form-control custom-input textbox_7cb806'), 'Impact 1')

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Okay (1)'))

