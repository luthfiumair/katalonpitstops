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

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/a_EWR'))
WebUI.click(findTestObject('Object Repository/Config 1/Request/Create EWR'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span__Location'))
WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_gttt'))

WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/span__Location1'))
WebUI.click(findTestObject('Object Repository/Page_PITSTOPS/li_GHH'))

WebUI.click(findTestObject('Object Repository/Config 1/Request/Work Category - 1'))
WebUI.click(findTestObject('Object Repository/Config 1/Request/Work Category - 2'))

WebUI.click(findTestObject('Object Repository/Config 1/Request/Work Disciplines - 1'))
WebUI.waitForElementVisible(findTestObject('Object Repository/Config 1/Request/Work Disciplines - 2'),10)
WebUI.click(findTestObject('Object Repository/Config 1/Request/Work Disciplines - 2'))

WebUI.click(findTestObject('Object Repository/Config 1/Request/Equipment Type - 1'))
WebUI.click(findTestObject('Object Repository/Config 1/Request/Equipment Type - 2'))

WebUI.click(findTestObject('Object Repository/Config 1/Request/Tag No - 1'))
WebUI.scrollToElement(findTestObject('Object Repository/Config 1/Request/Tag No - 2'), 5)
WebUI.waitForElementVisible(findTestObject('Object Repository/Config 1/Request/Tag No - 2'), 10)
WebUI.setText(findTestObject('Object Repository/Config 1/Request/Tag No - 2'), '1234')


WebUI.setText(findTestObject('Object Repository/Config 2/Request/Work'),'Work 1')
WebUI.setText(findTestObject('Object Repository/Config 2/Request/Justification'),'Justification 1')
WebUI.setText(findTestObject('Object Repository/Config 2/Request/Impact'),'Impact 1')

//WebUI.click(findTestObject('Object Repository/Config 3/Request/Submit'))
WebUI.click(findTestObject('Object Repository/Config 3/Request/Submit'))
WebUI.click(findTestObject('Object Repository/Config 2/Request/Yes'))
WebUI.click(findTestObject('Object Repository/Config 2/Request/Yes 2'))