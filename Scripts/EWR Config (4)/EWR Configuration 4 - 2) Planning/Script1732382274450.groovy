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

WebUI.doubleClick(findTestObject('Object Repository/Config 9/EWR Technical Review/Open EWR'))

WebUI.click(findTestObject('Object Repository/Config 2/Planning/Planning Dropdown'))

WebUI.click(findTestObject('Object Repository/Config 3/Planning/Estimate Work Duration'))
WebUI.setText(findTestObject('Object Repository/Config 3/Planning/Estimate Work Duration'),'EWR Config 3 Automation')

WebUI.click(findTestObject('Object Repository/Config 3/Planning/Estimated Lead Time'))
WebUI.setText(findTestObject('Object Repository/Config 3/Planning/Estimated Lead Time'),'EWR Config 3 Automation')

WebUI.setText(findTestObject('Object Repository/Config 3/Planning/Service Cost'),'320')
WebUI.setText(findTestObject('Object Repository/Config 3/Planning/Material Cost'),'420')

WebUI.setText(findTestObject('Object Repository/Config 4/Planning/text'),'Automation')

WebUI.click(findTestObject('Object Repository/Config 3/Planning/Select Technical Reviewer'))
WebUI.click(findTestObject('Object Repository/Config 3/Planning/Select Technical Reviewer - 2'))


WebUI.click(findTestObject('Object Repository/Config 3/Request/Submit'))

WebUI.click(findTestObject('Object Repository/Config 2/Request/Yes'))

WebUI.click(findTestObject('Object Repository/Config 3/Planning/Okay'))