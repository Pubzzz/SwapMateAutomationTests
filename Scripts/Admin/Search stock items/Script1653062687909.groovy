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

WebUI.click(findTestObject('Object Repository/Stock_Search/Page_SwapMate/i_New_right fas fa-angle-left'))

WebUI.click(findTestObject('Object Repository/Stock_Search/Page_SwapMate/i_New_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Stock_Search/Page_SwapMate/a_Manage Stock'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Stock_Search/Page_SwapMate/label_Search'), 0)

WebUI.setText(findTestObject('Object Repository/Stock_Search/Page_SwapMate/input_Search_form-control form-control-sm'), 
    'XL')

WebUI.verifyElementPresent(findTestObject('Object Repository/Stock_Search/Page_SwapMate/div_Showing 1 to 5 of 5 entries (filtered f_9f68b9_1'), 
    0)

WebUI.setText(findTestObject('Object Repository/Stock_Search/Page_SwapMate/input_Search_form-control form-control-sm'), 
    '')

WebUI.verifyElementPresent(findTestObject('Object Repository/Stock_Search/Page_SwapMate/div_Showing 1 to 11 of 11 entries'), 
    0)

