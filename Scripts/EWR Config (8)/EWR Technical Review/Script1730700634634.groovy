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

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/a_EWR'))

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/div_Click on EWR'))

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/div_Review'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_Disagree - ATR'), 30)

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_Disagree - ATR'))

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_Agree - ATR'))

WebUI.setText(findTestObject('Object Repository/Config 8/Page_PITSTOPS/textarea__remark - ATR'), 'Remark is here')

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_Submit - ATR - 1'))

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_No_1'))

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_Submit - ATR - 2'))

WebUI.click(findTestObject('Object Repository/Config 8/Page_PITSTOPS/button_Yes - ATR'))

