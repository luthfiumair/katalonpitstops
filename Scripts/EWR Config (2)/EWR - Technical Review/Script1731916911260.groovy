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

WebUI.setText(findTestObject('Object Repository/Config 2/Planning/Planning Text 1'),'23 hours duration')

WebUI.setText(findTestObject('Object Repository/Config 2/Planning/Manpower Cost'),'420')

WebUI.setText(findTestObject('Object Repository/Config 2/Planning/Equipment Cost'),'421')

WebUI.setText(findTestObject('Object Repository/Config 2/Planning/Insert Remarks'),'EWR Config 2 remarks planning')

WebUI.click(findTestObject('Object Repository/Config 2/Planning/Submit'))

WebUI.click(findTestObject('Object Repository/Config 2/Planning/Yes'))

WebUI.click(findTestObject('Object Repository/Config 2/Planning/Yes 2'))