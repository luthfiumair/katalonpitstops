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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://pitstopsstg.petronas.com/?returnUrl=%2Fhome')
//
//WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Login'))
//
//WebUI.switchToWindowTitle('Sign in to your account')
//
//WebUI.setText(findTestObject('Page_Sign in to your account/input_Sign in_loginfmt'), 'updater1@pethlab.com')
//
//WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Enter password_passwd'), '8ONjX3ggx5TeICilsxkl7A==')
//
//WebUI.switchToWindowTitle('PITSTOPS')
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PITSTOPS/select_PC Ammonia Sdn Bhd  PETRONAS Penapis_a29677'), 
//    'OPU_Demo', true)
//
//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PITSTOPS/select_Demo - Training  MNLG - Demo TP  Dem_be5ca4'), 
//    'd5402b86-996a-4365-6cc3-08dcb4f68116', true)

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/a_Worklist'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/button_Skip'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/img'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/div_Delete'))

