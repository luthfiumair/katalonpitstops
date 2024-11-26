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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pitstopsstg.petronas.com/?returnUrl=%2Fhome')

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Login'))

WebUI.switchToWindowTitle('Sign in to your account')

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Scenario 1/Optional Element'), 5, FailureHandling.OPTIONAL)) {
	// Perform action if the element is present
	WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/ADD NEW'))
}
WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_loginfmt'), 'tverify4@pethlab.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'),10)
WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_Enter password_passwd'), 'Welcome@123456')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.switchToWindowTitle('PITSTOPS')

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span_Planning Homepage'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/div_Execution Homepage'))
