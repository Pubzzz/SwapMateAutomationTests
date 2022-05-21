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

WebUI.navigateToUrl('http://localhost:4200/site')

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/i_Products_fas fa-user-cog'))

WebUI.setText(findTestObject('Object Repository/Sample/Page_SwapMate/input_Email address_email'), 'Admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sample/Page_SwapMate/input_Password_password'), '/5S6MFFLcE4mlsixtc6/Tg==')

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/i_New_right fas fa-angle-left'))

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/svg_Well Known_bi bi-folder-symlink'))

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/span_'))

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/svg_Well Known_bi bi-folder-symlink'))

WebUI.click(findTestObject('Object Repository/Sample/Page_SwapMate/span_'))

